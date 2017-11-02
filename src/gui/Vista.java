/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Vista extends JFrame{
    private JButton button;
    private JTextField field;
private Controller controller;
public Vista(){
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(new Dimension(400,300));
setTitle("A frame");
    setLayout(new FlowLayout());
    this.button=new JButton("boton");
    this.field=new JTextField(5);
    this.add(this.button);
    this.add(this.field);
}
    public void setController(Controller controlador){
    this.controller=controlador;
    this.button.addActionListener((ActionListener) this.controller);
    }
    
    
}
