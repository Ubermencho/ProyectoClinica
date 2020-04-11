/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

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
public class Medicamento {
    
    private int cod_med, id_ata;
    
    public   Medicamento(){}
    
    public Medicamento(int med){
        this.cod_med=med;
    }

    public int getCod_med() {
        return cod_med;
    }

    public int getId_ata() {
        return id_ata;
    }

    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    public void setId_ata(int id_ata) {
        this.id_ata = id_ata;
    }
    
    
    
    public String obtenercodMed(String Med) throws ClassNotFoundException{
        String cod="";
        try{            
            Statement combo = DB.conexion().createStatement();
            ResultSet rs = combo.executeQuery("select * from medicamento where descripcion_medicamento= '"+Med+"'");
            rs.next();
            cod = rs.getString("idmedicamento");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cod;
    }
    
    public int obteneridATA(String doc, String nom, String ape, int edad, int car, String sin) throws ClassNotFoundException{
        int cod=0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        try{            
            Statement combo = DB.conexion().createStatement();
            ResultSet rs = combo.executeQuery("select idata from ata where iddoctor='"+doc+"' and nombre_paciente_ata='"+nom+"' and apellido_paciente_ata='"+ape+"' and edad_paciente_ata= "+edad+" and idcarrera="+car+" and sintomas_paciente_ata='"+sin+"' and fecha_ata='"+dtf.format(now)+"';");
            rs.next();
            cod = rs.getInt("idata");
            System.out.println(cod);
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return cod;
    }
    
    
}
