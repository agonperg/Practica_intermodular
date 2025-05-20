/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_intermodular;

import java.util.Scanner;

/**
 *
 * @author PC220
 */
public class Proyecto_Intermodular {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String opcion = ""; 
        
        do{
            System.out.println("[1] Ver los datos de los clientes. ");
            System.out.println("[2] Seleccione una de las listas. ");
            System.out.println("[3] Ver las entidades secundarias. ");
            System.out.println("[0] Salir. ");
            opcion = sc.nextLine(); 
            
            
            
            
        }while(!(opcion.equals("0"))); 
        
        
        
    }
}
