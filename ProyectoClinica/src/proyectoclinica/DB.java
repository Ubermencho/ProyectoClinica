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
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinica_unicah", "root", "");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
         } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
         }
      }
      return cnx;
   }
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
   
   public static int guardarBase(String idpaciente, String fecha_expediente, String hora_ingreso, 
           String hora_egreso, String sintoma_principal, String hea, double peso_paciente, double talla_paciente,
            double glasgow, String frecuencia_cardiaca_paciente, String frecuencia_respiratoria_paciente, String presion_arterial_paciente,
           String temperatura_paciente, String color_piel_paciente, String llenado_capilar_paciente, String datos_contribuyentes_paciente,
           String diagnostico, String tratamiento, String interconsulta, String comentario_adicional) throws ClassNotFoundException{
        int correcto = 0;
        PreparedStatement insertar = null;
        try{
            String sql = "insert into expediente (idpaciente,fecha_expediente,hora_ingreso,hora_egreso,sintoma_principal,"
                    + "hea,peso_paciente,talla_paciente,glasgow,frecuencia_cardiaca_paciente,frecuencia_respiratoria_paciente,presion_arterial_paciente,"
                    + "temperatura_paciente,color_piel_paciente,llenado_capilar_paciente,datos_contribuyentes_paciente,diagnostico,"
                    + "tratamiento,interconsulta,comentario_adicional)"
                    + " values ('"+idpaciente+"','"+fecha_expediente+"','"+hora_ingreso+"','"+hora_egreso+"',"
                    + "'"+sintoma_principal+"','"+hea+"',"+peso_paciente+","+talla_paciente+","+glasgow+",'"+frecuencia_cardiaca_paciente+"','"
                    + frecuencia_respiratoria_paciente+"','"+presion_arterial_paciente+"','"+temperatura_paciente+"','"+color_piel_paciente+"',"
                    + "'"+llenado_capilar_paciente+"','"+datos_contribuyentes_paciente+"','"+diagnostico+"','"+tratamiento+"',"
                    + "'"+interconsulta+"','"+comentario_adicional+"');";
            insertar = conexion().prepareStatement(sql);
            correcto = insertar.executeUpdate();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
            correcto = 0;
        }
        return correcto;
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
              ResultSet rs = s.executeQuery(sql);
              if(rs.next()){
                usuRes = rs.getString("descripcion_usuario");
                passRes = rs.getString("password_usuario");
                res = 1;
              } else {
                  return 0;
              }
              rs.close();
              s.close();
              return res;
          }
       catch(SQLException ex){           
           res=0;    
           return res;
        }
   }
   
   public static int agregarPaciente(String idpaciente, int idcarrera, String nombre_paciente, 
           String apellido_paciente, int edad_paciente, String genero_paciente, int estado) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "insert into paciente values('"+idpaciente+"', "+idcarrera+", '"+nombre_paciente+"', '"+apellido_paciente+"',"
                   + edad_paciente + ",'"+genero_paciente+"',"+estado+");";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
      
   public static int modificarPaciente(String idpaciente, int idcarrera, String nombre_paciente, 
           String apellido_paciente, int edad_paciente, String genero_paciente) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement modificar = null;
       try{
           String sql = "update paciente set idcarrera = "+idcarrera+", nombre_paciente = '"+nombre_paciente+
                   "',apellido_paciente = '"+apellido_paciente+"' , edad_paciente = "+ edad_paciente + 
                   ", genero_paciente = '"+genero_paciente+"' where idpaciente = '"+idpaciente+"';";
           modificar = conexion().prepareStatement(sql);
           correcto = modificar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int eliminarPaciente(String idpaciente) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement eliminar = null;
       try{
           String sql = "update paciente set idestado = 2 where idpaciente = '"+idpaciente+"'";
           eliminar = conexion().prepareStatement(sql);
           correcto = eliminar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int agregarDoctor(String iddoctor, String nombre_doctor, 
           String apellido_doctor, int edad_doctor, int estado) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "insert into doctor values('"+iddoctor+"', '"+nombre_doctor+"', '"+apellido_doctor+"', "+edad_doctor+", "+estado+")";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int modificarDoctor(String iddoctor, String nombre_doctor, 
           String apellido_doctor, int edad_doctor) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement modificar = null;
       try{
           String sql = "update doctor set nombre_doctor = '"+nombre_doctor+"', apellido_doctor = '"+apellido_doctor+
                   "', edad_doctor = "+ edad_doctor +" where iddoctor = '"+iddoctor+"'";
           modificar = conexion().prepareStatement(sql);
           correcto = modificar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int eliminarDoctor(String iddoctor) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement eliminar = null;
       try{
           String sql = "update doctor set idestado = 2 where iddoctor = '"+iddoctor+"'";
           eliminar = conexion().prepareStatement(sql);
           correcto = eliminar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int agregarUsuario(String descripcion_usuario, String password_usuario, String fecha_creacion_usuario, int idtipo_usuario, int idestado) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "insert into usuario (descripcion_usuario,password_usuario,fecha_creacion_usuario,idtipo_usuario,idestado) "
                   + "values('"+descripcion_usuario+"', '"+password_usuario+"', '"+fecha_creacion_usuario+"', "+idtipo_usuario+", "+idestado+")";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int modificarUsuario(String descripcion_usuario, String password_usuario, int idtipo_usuario) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "update usuario set password_usuario = '"+password_usuario+"',idtipo_usuario = "+idtipo_usuario+" where descripcion_usuario = '"+descripcion_usuario+"';";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int cambioUsuario(String descripcion_usuario, int idestado) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement eliminar = null;
       try{
           String sql = "update usuario set idestado = "+idestado+" where descripcion_usuario = '"+descripcion_usuario+"'";
           eliminar = conexion().prepareStatement(sql);
           correcto = eliminar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int agregarMedicamento(String idmedicamento, String descripcion_medicamento, String tipo_medicamento, int idestado) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "insert into medicamento values('"+idmedicamento+"', '"+descripcion_medicamento+"', '"+tipo_medicamento+"', "+idestado+")";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int modificarMedicamento(String idmedicamento, String descripcion_medicamento, String tipo_medicamento) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement insertar = null;
       try{
           String sql = "update medicamento set descripcion_medicamento = '"+descripcion_medicamento+"', tipo_medicamento = '"+tipo_medicamento+"' where idmedicamento = '"+idmedicamento+"')";
           insertar = conexion().prepareStatement(sql);
           correcto = insertar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
   
   public static int eliminarMedicamento(String idmedicamento) throws ClassNotFoundException{
       int correcto = 0;
       PreparedStatement eliminar = null;
       try{
           String sql = "update medicamento set idestado = 2 where idmedicamento = '"+idmedicamento+"'";
           eliminar = conexion().prepareStatement(sql);
           correcto = eliminar.executeUpdate();
           return correcto;
       }
       catch(SQLException e){
            return 0;
       }
   }
}
