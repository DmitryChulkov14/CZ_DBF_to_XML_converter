package UI;

import com.linuxense.javadbf.DBFReader;
import input_processor.RowsCreator;
import input_processor.RowsCreatorImpl;
import model.DBFRow;
import output_processor.XMLWriter;
import output_processor.XMLWriterImpl;
import processor.RowsToXMLProcessor;
import processor.RowsToXMLProcessorImpl;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainPanel extends JPanel {

    private File file;
    private final JLabel chooseFileLabel;
    private final JButton convertButton = new JButton("Конвертировать");

    public MainPanel() {
        init();

        if (file == null) {
            convertButton.setEnabled(false);
        }

        JPanel chooseFileLabelPanel = new JPanel();
        chooseFileLabelPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        chooseFileLabel = new JLabel();
        chooseFileLabelPanel.add(chooseFileLabel);
        add(chooseFileLabelPanel, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());

        JButton chooseFileButton = new JButton("Выбрать файл");
        chooseFileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int ret = fileChooser.showDialog(null, "Открыть файл");
            if (ret == JFileChooser.APPROVE_OPTION) {
                file = fileChooser.getSelectedFile();
                chooseFileLabel.setText(file.getName());
                convertButton.setEnabled(true);
            } else if (ret == JFileChooser.CANCEL_OPTION) {
                file = null;
                chooseFileLabel.setText("");
                convertButton.setEnabled(false);
            }
        });

        buttonsPanel.add(chooseFileButton);

        convertButton.addActionListener(e -> {
            DBFReader dbfReader = null;
            try {
                dbfReader = new DBFReader(new FileInputStream(file.getPath()), Charset.forName("Cp1251"));
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
                JOptionPane.showMessageDialog(
                        this,
                        "Файл не существует!",
                        "Ошибка!",
                        JOptionPane.ERROR_MESSAGE);
            }

            RowsCreator rowsCreator = new RowsCreatorImpl();
            try {
                List<DBFRow> rows = rowsCreator.getRowsFromDbfReader(dbfReader);
                RowsToXMLProcessor rowsToXMLProcessor = new RowsToXMLProcessorImpl();
                String resultXml = rowsToXMLProcessor.convertRowsToXmlString(rows);

                XMLWriter xmlWriter = new XMLWriterImpl();
                xmlWriter.writeDataToXml(resultXml);

                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.open(new File(Paths.get("").toUri()));
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            } catch (ClassCastException cce) {
                cce.printStackTrace();
                JOptionPane.showMessageDialog(
                        this,
                        "Неверное кол-во колонок во входящем файле!",
                        "Ошибка!",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        buttonsPanel.add(convertButton);

        add(buttonsPanel, BorderLayout.SOUTH);
    }

    private void init() {
        setLayout(new BorderLayout(3, 3));
    }
}
