/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author oflor
 */
public class Medicamento {
    
    
    public int obtenercodMed(String Med) throws ClassNotFoundException{
        int cod=0;
        try{            
            Statement combo = DB.conexion().createStatement();
            ResultSet rs = combo.executeQuery("select * from medicamento where descripcion_medicamento= '"+Med+"'");
            rs.next();
            cod = rs.getInt("idmedicamento");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cod;
    }
    
    
}
