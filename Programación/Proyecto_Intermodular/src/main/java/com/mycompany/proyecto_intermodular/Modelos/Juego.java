

package com.mycompany.proyecto_intermodular.Modelos;

import java.util.ArrayList;
import java.util.Date;


public class Juego {

    private Long id_cliente; 
    private Long id_juego; 
    private Date fecha; 
    private ArrayList<Cliente> clientes; 
    private ArrayList<Juego> juegos; 
    
    public Juego(){
        this.clientes = new ArrayList<>(); 
        this.juegos = new ArrayList<>(); 
    }
    
    public Juego(Long id_c, Long id_j, Date f) {
        this.id_cliente = id_c; 
        this.id_juego = id_j; 
        this.fecha = f; 
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Long getId_juego() {
        return id_juego;
    }

    public void setId_juego(Long id_juego) {
        this.id_juego = id_juego;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }
    
    public ArrayList<Cliente> getCliente(){
        return this.clientes; 
    }
    
    public void addCliente(Cliente c){
        this.clientes.add(c); 
    }
    
    public void addJuegos(Juego j){
        this.juegos.add(j); 
    }
    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" ID Cliente: ").append(this.id_cliente).append(" ID Juego: ").append(this.id_juego).append(" Fecha: ")
                .append(this.fecha).append("\n"); 
        return sb.toString(); 
    }
    
   
    
    
}
