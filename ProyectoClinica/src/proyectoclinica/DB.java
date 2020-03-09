/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
   
   
   public static int Login(String user,String pass) throws ClassNotFoundException
   {
       int res = 0;
       String usuRes = "", passRes = "";
       String sql="";
       sql=("select descripcion_usuario, password_usuario from usuario where descripcion_usuario='"+user+"' and password_usuario='"+pass+"'");
       try{
              DB.conexion();
              Statement s = cnx.createStatement();
              //PreparedStatement s=cnx.prepareStatement(sql);
              ResultSet rs = s.executeQuery(sql);
              //JOptionPane.showMessageDialog(null, res);
              JOptionPane.showMessageDialog(null, rs);
              if(rs.next()){
                usuRes = rs.getString("descripcion_usuario");
                passRes = rs.getString("password_usuario");
                res = 1;
              } else {
                  return 0;
              }
              /*rs.beforeFirst();
              if(rs!=null){
                  if(rs.next())
                     res =rs.getInt(1);
              }*/
              rs.close();
              s.close();
              DB.cerrar();   
              return res;
          }
       catch(SQLException ex){
           
           res=0;    
           return res;
        }
   }
   
   
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
   
}
