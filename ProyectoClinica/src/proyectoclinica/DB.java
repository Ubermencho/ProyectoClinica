/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DB {
   private static Connection cnx = null;
   public static Connection conexion() throws SQLException, ClassNotFoundException {
      if (cnx == null) {
         try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/clinica_unicah", "root", "");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
         } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
         }
      }
      return cnx;
   }
   
   /*
   public static int Login(String user,String pass)
   {
       try{
       
          }
       catch{
               return 0;
        }
   }
   */
   
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
   
}
