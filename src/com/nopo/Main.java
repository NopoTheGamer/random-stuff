package com.nopo;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	System.out.println("deez");
        JFrame frame = new JFrame("Virus!");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("you arte hack");
        JButton button = new JButton();
        button.setText("hack !");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);
        frame.setJMenuBar(menuBar);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
