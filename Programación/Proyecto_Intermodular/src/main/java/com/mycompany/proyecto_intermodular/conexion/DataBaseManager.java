

package com.mycompany.proyecto_intermodular.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBaseManager {
    
    private static String url ="jdbc:mysql://database.c1qy2c4wwbk2.eu-north-1.rds.amazonaws.com:3306/monopoly?serverTimezone=UTC" ; 
    private static String user = "root"; 
    private static String pass = "pablongo03"; 
    private static Connection con; 
    
    
    public DataBaseManager(){
        try{
            con = DriverManager.getConnection(url,user,pass); 
        }catch(SQLException e){
            
        }
    }
    
    public 
    
   
    
}
