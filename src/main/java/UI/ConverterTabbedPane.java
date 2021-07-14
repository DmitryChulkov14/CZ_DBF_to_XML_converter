package UI;

import processor.FourDfRowsToXMLProcessorImpl;
import processor.SixFormRowsToXMLProcessorImpl;
import row_convertors.FourDfDBFtoRowConvertor;
import row_convertors.SixFormDBFtoRowConvertor;

import javax.swing.*;

public class ConverterTabbedPane extends JTabbedPane {
    public ConverterTabbedPane() {
        init();

        JPanel sixFormPanel = new ConverterPanel(new SixFormDBFtoRowConvertor(), new SixFormRowsToXMLProcessorImpl());
        JPanel fourDFPanel = new ConverterPanel(new FourDfDBFtoRowConvertor(), new FourDfRowsToXMLProcessorImpl());

        add("6-форма", sixFormPanel);
        add("4ДФ", fourDFPanel);
    }

    private void init() {
        setTabPlacement(JTabbedPane.TOP);
    }
}
