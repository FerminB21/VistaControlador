/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class Controller implements ActionListener{
private Modelo model;
private Vista view;

    public Controller(Modelo model, Vista view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       this.model.setZip(this.view.getField().getText());
       this.view.showMessage(this.model.getZip());
    }
    
}
