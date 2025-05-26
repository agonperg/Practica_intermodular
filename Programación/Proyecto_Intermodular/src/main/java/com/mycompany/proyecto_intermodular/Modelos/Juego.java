

package com.mycompany.proyecto_intermodular.Modelos;

import java.util.ArrayList;
import java.util.Date;


public class Juego {

    private Long id_juego; 
    private String nombre_juego; 
    private Long id_CrupierAsignado;  
    private ArrayList<Cliente> clientes; 
    private ArrayList<Juego> juegos; 
    
    public Juego(){
        this.clientes = new ArrayList<>(); 
        this.juegos = new ArrayList<>(); 
    }
    
    public Juego (Long id_juego, String nombre, Long idCrupier) {
        this.id_juego = id_juego; 
        this.nombre_juego = nombre; 
        this.id_CrupierAsignado = idCrupier; 
    }

    public Long getId_Juego() {
        return id_juego;
    }

    public void setId_Juego(Long id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public Long getId_CrupierAsignado() {
        return id_CrupierAsignado;
    }

    public void setId_CrupierAsignado(Long id_CrupierAsignado) {
        this.id_CrupierAsignado = id_CrupierAsignado;
    }
    
    
    
    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" ID Juego: ").append(this.id_juego).append(" Nombre: ").append(this.nombre_juego).append(" ID Crupier: ")
                .append(this.id_CrupierAsignado).append("\n"); 
        return sb.toString(); 
    }
    
   
    
    
}
