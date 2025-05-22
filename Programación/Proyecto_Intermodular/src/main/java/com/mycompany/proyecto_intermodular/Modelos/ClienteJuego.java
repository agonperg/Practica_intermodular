

package com.mycompany.proyecto_intermodular.Modelos;

import java.util.Date;


public class ClienteJuego {

    private Long id_cliente; 
    private Long id_juego; 
    private Date fecha; 
    
    public ClienteJuego(){}
    public ClienteJuego(Long id_c, Long id_j, Date f){
        this.id_cliente = id_c; 
        this.id_juego = id_j; 
        this.fecha = fecha; 
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" ID Cliente: ").append(this.id_cliente).append(" ID Juego: ").append(this.id_juego).append(" Fecha: ").append(this.fecha).append("\n"); 
        return sb.toString(); 
    }
    
}
