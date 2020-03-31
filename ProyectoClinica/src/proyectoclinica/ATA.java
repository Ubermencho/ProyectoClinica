/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author oflor
 */
public class ATA {
    
    public static int Ingresarata(String doc, String nom, String ape, int edad, int car, String sin)throws ClassNotFoundException{
        int correcto = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        //JOptionPane.showMessageDialog(null, dtf.format(now));
        PreparedStatement insertar = null;
        try{
            String sql = "insert into ata (iddoctor,nombre_paciente_ata,apellido_paciente_ata,edad_paciente_ata,idcarrera,sintomas_paciente_ata,fecha_ata )"
                    + " values ('"+doc+"','"+nom+"','"+ape+"',"+Math.toIntExact(edad)+",'"+car+"','"+sin+"','"+dtf.format(now)+"');";
            System.out.println(sql);
            insertar = DB.conexion().prepareStatement(sql);
            correcto = insertar.executeUpdate();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            correcto = 0;
        }
        return correcto;
    }
    
    public static void Ingresarata_med(int med, int ata)throws ClassNotFoundException{
        int correcto = 0;
        PreparedStatement insertar = null;
        try{
            String sql = "insert into ata_medicamentos (idmedicamento,idata)"
                    + " values ("+med+","+ata+");";
            System.out.println(sql);
            insertar = DB.conexion().prepareStatement(sql);
            correcto = insertar.executeUpdate();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            correcto = 0;
        }
        JOptionPane.showMessageDialog(null, correcto);
    }
    
    public static int obtenercodCar(String Car) throws ClassNotFoundException{
        int cod=0;
        try{            
            Statement combo = DB.conexion().createStatement();
            ResultSet rs = combo.executeQuery("select * from carrera where nombre_carrera= '"+Car+"'");
            rs.next();
            cod = rs.getInt("idcarrera");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cod;
    }
    
}
