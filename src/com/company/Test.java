package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Test implements ActionListener {


    JFrame frame;
    ImageIcon image1;
    ImageIcon image2;
    JButton button;
    JLabel label;

    public Test(){


        image1 = new ImageIcon("Kitties.jpg");
        image2 = new ImageIcon("Kitty.jpg");

        label = new JLabel(image2);
        label.setBounds(500,500,700,700);
        label.setVisible(false);

        button = new JButton(image1);
        button.setBounds(50,50,200,150);
        button.addActionListener(this);
        button.setBackground(new Color(38,147,200));
        button.setFont(new Font("Comic Sans",Font.ITALIC,15));
        button.setForeground(new Color(250,250,250));
        //button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);




        frame = new JFrame("Button");
        frame.setSize(new Dimension(420,420));
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button,BorderLayout.CENTER);
        frame.add(label,BorderLayout.CENTER);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setVisible(true);






        }










    }






}
