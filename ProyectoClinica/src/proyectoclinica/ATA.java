/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author oflor
 */
public class ATA {
    
    public static int Ingresarata(String pac,String pre, String nom, String ape, int edad, String car, String sin)throws ClassNotFoundException{
        int correcto = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
        LocalDateTime now = LocalDateTime.now();  
        //JOptionPane.showMessageDialog(null, dtf.format(now));
        PreparedStatement insertar = null;
        try{
            String sql = "insert into ata (Id_Paciente,Prescripcion,nombre_paciente_ata,apellido_paciente_ata, edad_paciente_ata,carrera_paciente_ata,sintomas_paciente_ata, fecha_ata )"
                    + " values ('"+pac+"','"+pre+"','"+nom+"','"+ape+"',"+Math.toIntExact(edad)+",'"+car+"','"+sin+"','"+dtf.format(now)+"');";
            System.out.println(sql);
            insertar = DB.conexion().prepareStatement(sql);
            correcto = insertar.executeUpdate();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            correcto = 0;
        }
        return correcto;
    }
    
}
