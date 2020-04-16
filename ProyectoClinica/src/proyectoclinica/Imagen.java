/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author SASA
 */
public class Imagen extends javax.swing.JPanel{
    public Imagen(){
        this.setSize(300, 300);
    }     
    
    public void paint(Graphics grafico){
        Dimension height = getSize(); 
        ImageIcon Img = new ImageIcon(getClass().getResource("/images/med.png"));  
        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
        setOpaque(false);
        super.paintComponent(grafico);
    }
}
