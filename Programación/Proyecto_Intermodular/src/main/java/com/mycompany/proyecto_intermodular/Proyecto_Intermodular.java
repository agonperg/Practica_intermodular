/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_intermodular;

import com.mycompany.proyecto_intermodular.Modelos.*;
import com.mycompany.proyecto_intermodular.conexion.DataBaseManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC220
 */
public class Proyecto_Intermodular {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String opcion = "";
        String subMenu = ""; 
        
        // Lista con los datos
        List<Cliente> clientes = new ArrayList<>(); 
        ArrayList<ClienteJuego> cliente_juego = new ArrayList<>(); 
        ArrayList<Crupier> crupiers = new ArrayList<>(); 
        ArrayList<Juego> juegos = new ArrayList<>(); 
        
        // Instanciamos la clase "DataBaseManager" 
        DataBaseManager db = new DataBaseManager(); 
        
        
        
        // Cargamos todos los datos dentro de los "Arrays" 
        db.addClientes(clientes);
        db.addJuegos(juegos); 
        db.addCrupiers(crupiers); 
        db.addClienteJuego(cliente_juego); 
        
        //System.out.println(juegos);
        
        do{
            System.out.println("[1] Ver los datos de los clientes. ");
            System.out.println("[2] V. ");
            System.out.println("[3] Ver las entidades secundarias. ");
            System.out.println("[0] Salir. ");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine(); 
            
            
            switch(opcion){
                
                case "1": {
                    do{
                        System.out.println("[1] Buscar usuario por id. ");
                        System.out.println("[2] Buscar usuario por nombre. ");
                        System.out.println("[3] Buscar usuario por dni. ");
                        System.out.println("[0] Salir. ");
                        System.out.print("Eleccion: ");
                        subMenu = sc.nextLine(); 
                        
                        switch(subMenu){
                            case "1" : {
                                Long id = 0L; 
                                Cliente c = null; 
                                
                                System.out.print("Dime el id del cliente: ");
                                id = sc.nextLong(); 
                                
                                
                                Iterator<Cliente> it = clientes.iterator();
                                while(it.hasNext()){
                                    c = it.next(); 
                                    //System.out.println(c);
                                    if(Long.valueOf(c.getId_cliente()).equals(id)){
                                        System.out.println(c);
                                    }
                                }
                                sc.nextLine(); 
                                break; 
                            }
                            
                            case "2": {
                                String n = ""; 
                                Cliente c = null; 
                                
                                System.out.print("Dime el nombre del cliente: ");
                                n = sc.nextLine(); 
                                
                                Iterator<Cliente> it = clientes.iterator(); 
                                while(it.hasNext()){
                                    c = it.next(); 
                                    if(c.getNombre_cliente().equals(n)){
                                        System.out.println(c);
                                    }
                                }
                                break; 
                            }
                            
                            case "3" : {
                                String d = ""; 
                                Cliente c = null; 
                                
                                System.out.print("Dime el dni del cliente: ");
                                d = sc.nextLine(); 
                                
                                Iterator<Cliente> it = clientes.iterator(); 
                                while(it.hasNext()){
                                    c = it.next(); 
                                    if(c.getNombre_cliente().equals(d)){
                                        System.out.println(c);
                                    }
                                }
                                break;
                            }
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                    }while(!(subMenu.equals("0"))); 
                    
                   
                }
                
                
                case "2" : {
                    
                    
                    
                    
                }
                
            }
            
            
            
            
        }while(!(opcion.equals("0"))); 
        
        
        
    }
}
