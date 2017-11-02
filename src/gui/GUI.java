/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name=JOptionPane.showInputDialog(null,"What is your name?");
        int choice=JOptionPane.showConfirmDialog(null,"Do you like cake"+name+"?");
        if(choice==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null, "OF COURSE WHO DOESN´T?");
        
        }else{
        JOptionPane.showMessageDialog(null,"we ll have tp agree to disagree");
        
        }
    }
    
}
