package UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        init();

    }

    private void init() {
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("icon.png"));
        setIconImage(icon);
        setTitle("CZ DBF to XML convertor");
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 100));
        setResizable(false);
        getContentPane().add(new MainPanel());
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

