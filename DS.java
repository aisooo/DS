package com.example;

import javax.swing.BorderFactory;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DS implements ActionListener {
    private int counter = 0;
    private JLabel Label;
    private JFrame frame;
    private JPanel panel;

    public DS() {
        frame = new JFrame();

        JButton button = new JButton("Click");
        button.addActionListener(this);
        Label = new JLabel("Number of clicks: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(Label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("our GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new DS();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        Label.setText("Number of clicks: " + counter);


    }
}
