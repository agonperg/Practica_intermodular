

package com.mycompany.proyecto_intermodular.conexion;

import com.mycompany.proyecto_intermodular.Modelos.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DataBaseManager {
    
    private static String url ="jdbc:mysql://database.c1qy2c4wwbk2.eu-north-1.rds.amazonaws.com:3306/casino?serverTimezone=UTC" ; 
    private static String user = "root"; 
    private static String pass = "pablongo03"; 
    private static Connection con; 
    private PreparedStatement pt; 
    private ResultSet rs; 
    
    Cliente c = new Cliente(); 
    Crupier cr = new Crupier(); 
    ClienteJuego cj = new ClienteJuego(); 
    Juego j = new Juego(); 
    
    private Cliente getCliente(ResultSet rs){
        Cliente cl = new Cliente(); 
        
        try{
            
            cl.setId_cliente(rs.getLong("id_cliente"));
            cl.setNombre_cliente(rs.getString("nombre_cliente"));
            cl.setDni_cliente(rs.getString("dni_cliente"));
            cl.setEdad(rs.getInt("edad"));
            cl.setTarjeta(rs.getBoolean("tarjeta"));
            cl.setSaldo(rs.getDouble("saldo")); 
            cl.setSexo(rs.getString("sexo"));
            cl.setFecha(rs.getDate("fecha")); 
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return cl; 
    }
    
    private Juego getJuego(ResultSet rs){
        Juego j = new Juego(); 
        
        try{
            
            j.setId_Juego(rs.getLong("id_juego"));
            j.setNombre_juego(rs.getString("nombre_juego"));
            j.setId_CrupierAsignado(rs.getLong("id_CrupierAsignado"));
            
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return j; 
    }
    
    
    private ClienteJuego getClienteJuego(ResultSet rs){
        ClienteJuego j = new ClienteJuego(); 
        
        try{
            
            j.setId_cliente(rs.getLong("id_cliente"));
            j.setId_juego(rs.getLong("id_juego"));
            j.setFecha(rs.getDate("fecha"));
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return j; 
    }
    
    
    private Crupier getCrupier(ResultSet rs){
        Crupier c = new Crupier(); 
        
        try{
            
            c.setId_crupier(rs.getLong("id_crupier"));
            c.setNombre(rs.getString("nombre_crupier"));
            c.setDni_crupier(rs.getString("dni_crupier"));
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return c; 
    }
    
    
    
    
    
    public DataBaseManager(){
        try{
            con = DriverManager.getConnection(url,user,pass); 
            
        }catch(SQLException e){
            
        }
    }
    
    
    
    
    
    
    public void addClientes(List<Cliente> clientes){
        try{
            
            pt = con.prepareStatement("SELECT * FROM cliente"); 
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                
                c = getCliente(rs); 
                clientes.add(c); 
                //System.out.println(c);
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void addCrupiers(ArrayList<Crupier> crupier){
        try{
            
            pt = con.prepareStatement("SELECT * FROM crupier"); 
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                
                cr = getCrupier(rs); 
                crupier.add(cr); 
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void addJuegos(ArrayList<Juego> juegos){
        try{
            
            pt = con.prepareStatement("SELECT * FROM juego"); 
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                
                j = getJuego(rs); 
                juegos.add(j); 
                System.out.println(j);
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void addClienteJuego(ArrayList<ClienteJuego> clientes){
        try{
            
            pt = con.prepareStatement("SELECT * FROM clienteJuego"); 
            rs = pt.executeQuery(); 
            
            while(rs.next()){
                
                cj = getClienteJuego(rs); 
                clientes.add(cj); 
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    
   
    
}