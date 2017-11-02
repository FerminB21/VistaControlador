/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class SimpleFrame {
    public static void main(String []args){
    JFrame frame=new JFrame();

    Image icon=Toolkit.getDefaultToolkit().getImage("icon.gif");
    frame.setIconImage(icon);
    JPanel panel=(JPanel)frame.getContentPane();
    panel.setBackground(Color.WHITE);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    frame.setSize(new Dimension(300,120));
    Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2);
    frame.setTitle("a Frame");
    JLabel label=new JLabel("Typo your zip code:");
    JTextField field=new JTextField(5);//ese 5 es el ancho de caracteres a recibir
    
    frame.setLayout(new FlowLayout());
    //frame.setLayout(new GridLayout(2,3));
    //frame.setLayout(new BorderLayout());

    frame.add(new JButton("North"),BorderLayout.NORTH);
    JButton button1=new JButton();
     button1.setText("Im a button");
     button1.setBackground(Color.BLUE);
     button1.addActionListener(new MessageListener());
     frame.add(button1);
       JButton button2=new JButton();
     button2.setText("Click me");
     button2.setBackground(Color.RED);
     frame.add(button2);
     frame.add(label);
     frame.add(field);
        frame.setVisible(true);}
}
