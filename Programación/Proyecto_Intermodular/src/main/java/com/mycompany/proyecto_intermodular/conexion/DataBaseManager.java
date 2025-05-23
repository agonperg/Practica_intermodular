

package com.mycompany.proyecto_intermodular.conexion;

import com.mycompany.proyecto_intermodular.Modelos.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class DataBaseManager {
    
    private static String url ="jdbc:mysql://database.c1qy2c4wwbk2.eu-north-1.rds.amazonaws.com:3306/monopoly?serverTimezone=UTC" ; 
    private static String user = "root"; 
    private static String pass = "pablongo03"; 
    private static Connection con; 
    private PreparedStatement pt; 
    private ResultSet rs; 
    
    Cliente c = null; 
    
    private Cliente getCliente(ResultSet rs){
        Cliente c = null; 
        
        try{
            
            c.setId_cliente(rs.getLong("id_cliente"));
            c.setNombre_cliente(rs.getString("nombre_cliente"));
            c.setDni_cliente(rs.getString("dni_cliente"));
            c.setEdad(rs.getInt("edad"));
            c.setTarjeta(rs.getBoolean("tarjeta"));
            c.setSaldo(rs.getDouble("saldo")); 
            c.setSexo(rs.getString("sexo"));
            c.setFecha(rs.getDate("fecha")); 
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return c; 
    }
    
    
    public DataBaseManager(ArrayList<Cliente> clientes){
        try{
            con = DriverManager.getConnection(url,user,pass); 
            
            pt = con.prepareStatement("SELECT * FROM cliente"); 
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                
                c = getCliente(rs); 
                clientes.add(c); 
                
            }
            
        }catch(SQLException e){
            
        }
    }
    
    
   
    
}
