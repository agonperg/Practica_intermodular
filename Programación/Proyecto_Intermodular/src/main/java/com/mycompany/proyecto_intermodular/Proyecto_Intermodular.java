/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_intermodular;

import com.mycompany.proyecto_intermodular.Modelos.*;
import com.mycompany.proyecto_intermodular.conexion.DataBaseManager;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC220
 */
public class Proyecto_Intermodular {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String opcion = "";
        
        // Lista con los datos
        ArrayList<Cliente> clientes = new ArrayList<>(); 
        ArrayList<ClienteJuego> cliente_juego = new ArrayList<>(); 
        ArrayList<Crupier> crupiers = new ArrayList<>(); 
        ArrayList<Juego> juegos = new ArrayList<>(); 
        
        // Instanciamos la clase "DataBaseManager" 
        DataBaseManager db = new DataBaseManager(clientes); 
        
        System.out.println(clientes);
        
        do{
            System.out.println("[1] Ver los datos de los clientes. ");
            System.out.println("[2] Seleccione una de las listas. ");
            System.out.println("[3] Ver las entidades secundarias. ");
            System.out.println("[0] Salir. ");
            opcion = sc.nextLine(); 
            
            
            
            
        }while(!(opcion.equals("0"))); 
        
        
        
    }
}
