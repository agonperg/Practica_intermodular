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
            System.out.println("[2] Ver los datos de los juegos. ");
            System.out.println("[3] Ver los datos de el crupier. ");
            System.out.println("[3] Ver los datos de cliente - juego. ");
            System.out.println("[0] Salir. ");
            System.out.print("Eleccion: ");
            opcion = sc.nextLine(); 
            
            
            switch(opcion){
                
                case "1": {
                    do{
                        System.out.println("[1] Buscar cliente por id. ");
                        System.out.println("[2] Buscar cliente por nombre. ");
                        System.out.println("[3] Buscar cliente por dni. ");
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
             
                    
                    do{
                        System.out.println("[1] Buscar juegos. ");
                        System.out.println("[2] Buscar juego por nombre. ");
                        System.out.println("[3] Buscar juego por id crupier. ");
                        System.out.println("[0] Salir. ");
                        System.out.print("Eleccion: ");
                        subMenu = sc.nextLine(); 
                        
                        switch(subMenu){
                            case "1" : {
                                Long id = 0L; 
                                Juego j = null; 
                                
                                System.out.println("============= Crupiers ===============");
                                System.out.println(crupiers);
                                System.out.println("====================================");
                               
                                 
                                Iterator<Juego> it = juegos.iterator();
                                while(it.hasNext()){
                                    j = it.next(); 
                                    //System.out.println(c);
                                    if(Long.valueOf(j.getId_Juego()).equals(id)){
                                        System.out.println(j);
                                    }
                                }
                                sc.nextLine(); 
                                break; 
                            }
                            
                            case "2": {
                                String n = ""; 
                                Juego j = null; 
                                
                                System.out.println("============= Crupiers ===============");
                                System.out.println(crupiers);
                                System.out.println("====================================");
                                
                                System.out.print("Dime el nombre del juego: ");
                                n = sc.nextLine(); 
                                
                                Iterator<Juego> it = juegos.iterator(); 
                                while(it.hasNext()){
                                    j = it.next(); 
                                    if(j.getNombre_juego().equals(n)){
                                        System.out.println(j);
                                    }
                                }
                                break; 
                            }
                            
                            case "3" : {
                                Long id = 0L; 
                                Juego c = null; 
                                
                                System.out.print("Dime el id del juego: ");
                                id = sc.nextLong(); 
                                
                                Iterator<Juego> it = juegos.iterator(); 
                                while(it.hasNext()){
                                    c = it.next(); 
                                    if(c.getId_CrupierAsignado().equals(id)){
                                        System.out.println(c);
                                    }
                                }
                                break;
                            }
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                    }while(!(subMenu.equals("0"))); 
                    
                    
                    
                }
                
                
                
                
                case "3" : {
                    
                    
                    do{
                        System.out.println("[1] Mostrar cupriers. ");
                        System.out.println("[2] Buscar crupier por nombre. ");
                        System.out.println("[3] Buscar cruprier por dni. ");
                        System.out.println("[0] Salir. ");
                        System.out.print("Eleccion: ");
                        subMenu = sc.nextLine(); 
                        
                        switch(subMenu){
                            case "1" : { 
                                
                                System.out.println("============= Crupiers ===============");
                                System.out.println(crupiers);
                                System.out.println("====================================");
                               
                                break; 
                            }
                            
                            case "2": {
                                String n = ""; 
                                Crupier j = null; 
                                
                                
                                System.out.print("Dime el nombre del juego: ");
                                n = sc.nextLine(); 
                                
                                Iterator<Crupier> it = crupiers.iterator(); 
                                while(it.hasNext()){
                                    j = it.next(); 
                                    if(j.getNombre().equals(n)){
                                        System.out.println(j);
                                    }
                                }
                                break; 
                            }
                            
                            case "3" : {
                                Long id = 0L; 
                                Crupier c = null; 
                                
                                System.out.print("Dime el id del crupier: ");
                                id = sc.nextLong(); 
                                
                                Iterator<Crupier> it = crupiers.iterator(); 
                                while(it.hasNext()){
                                    c = it.next(); 
                                    if(c.getId_crupier().equals(id)){
                                        System.out.println(c);
                                    }
                                }
                                sc.nextLine(); 
                                break;
                            }
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                    }while(!(subMenu.equals("0"))); 
                    
                    
                    
                }
                
                
                case "4" : {
                    
                    
                    do{
                        System.out.println("[1] Mostrar cliented - juego. ");
                        System.out.println("[2] Buscar cliente por id. ");
                        System.out.println("[3] Buscar juego por id. ");
                        System.out.println("[0] Salir. ");
                        System.out.print("Eleccion: ");
                        subMenu = sc.nextLine(); 
                        
                        switch(subMenu){
                            case "1" : { 
                                
                                System.out.println("============= Crupiers ===============");
                                System.out.println(cliente_juego);
                                System.out.println("====================================");
                               
                                break; 
                            }
                            
                            case "2": {
                                Long id = 0L; 
                                ClienteJuego j = null; 
                                
                                
                                System.out.print("Dime el id del cliente: ");
                                id = sc.nextLong(); 
                                
                                Iterator<ClienteJuego> it = cliente_juego.iterator(); 
                                while(it.hasNext()){
                                    j = it.next(); 
                                    if(j.getId_cliente().equals(id)){
                                        System.out.println(j);
                                    }
                                }
                                sc.nextLine(); 
                                break; 
                            }
                            
                            case "3" : {
                                Long id = 0L; 
                                ClienteJuego j = null; 
                                
                                
                                System.out.print("Dime el id del juego: ");
                                id = sc.nextLong(); 
                                
                                Iterator<ClienteJuego> it = cliente_juego.iterator(); 
                                while(it.hasNext()){
                                    j = it.next(); 
                                    if(j.getId_juego().equals(id)){
                                        System.out.println(j);
                                    }
                                }
                                sc.nextLine(); 
                                break; 
                            }
                        }
                        
                        
                        
                        
                        
                        
                        
                        
                    }while(!(subMenu.equals("0"))); 
                    
                }
                
            }
            
            
            
            
        }while(!(opcion.equals("0"))); 
        
        
        
    }
}
