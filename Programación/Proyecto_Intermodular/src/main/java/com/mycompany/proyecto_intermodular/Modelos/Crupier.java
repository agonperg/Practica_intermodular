package com.mycompany.proyecto_intermodular.Modelos;




public class Crupier {

    private Long id_crupier; 
    private String nombre; 
    private String dni_crupier; 

    
    public Crupier(){}
    public Crupier(Long id, String n, String d){
        this.id_crupier = id; 
        this.nombre = n; 
        this.dni_crupier = d; 
    }

    public Long getId_crupier() {
        return id_crupier;
    }

    public void setId_crupier(Long id_crupier) {
        this.id_crupier = id_crupier;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni_crupier() {
        return dni_crupier;
    }

    public void setDni_crupier(String dni_crupier) {
        this.dni_crupier = dni_crupier;
    }

    
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" ID Crupier: ").append(this.id_crupier).append(" Nombre Crupier: ").append(this.nombre).append(" DNI Crupier: ").append(this.dni_crupier)
                .append("\n"); 
        return sb.toString(); 
    }
}
