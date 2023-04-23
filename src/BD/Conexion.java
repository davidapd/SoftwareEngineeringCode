/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Dape
 */
public class Conexion {
 private Connection conexion;
    
    public Connection getconexion(){
        return conexion;
    }
    
    public void setConexion(Connection conexion){
        this.conexion = conexion;
    }
    
    public Conexion conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";   
            conexion = DriverManager.getConnection(BaseDeDatos, "bd_isw","BD_ISW");
            conexion.setAutoCommit(false);
            if (conexion != null) {
                System.out.println("Conexion exitosa!");
            } 
            else {
                System.out.println("Conexion fallida!");
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion con la Base de datos fallida \n" + e);
            e.printStackTrace();
        }
        return this;
    }
    
    //metodo para ejecutar sentencias que no devuelven datos INSERT DELETE UPDATE
    public boolean ejecutar(String sql){
        try {
            Statement sentencia;
            sentencia = getconexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            sentencia.executeUpdate(sql);
            getconexion().commit();
        }
        catch (SQLException e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    //metodo para hacer consultas
    public ResultSet consultar(String sql){
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = getconexion().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            resultado = sentencia.executeQuery(sql);
            getconexion().commit();
            
        } catch (SQLException e) {
        
            e.printStackTrace();
            return null;
        }        
        return resultado;
    }       
    
    public ResultSet tablas(String sql, String user, String password){
        ResultSet resultado = null;
        try {
            Statement sentencia;
            sentencia = getconexion().createStatement();
            resultado = sentencia.executeQuery(sql);
            getconexion().commit();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }        
        return resultado;
    }                 
}

