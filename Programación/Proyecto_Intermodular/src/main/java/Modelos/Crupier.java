

package Modelos;


public class Crupier {

    private Long id_crupier; 
    private String nombre; 
    private String dni_crupier; 
    private Long id_fkjuego; 
    
    
    public Crupier(){}
    public Crupier(Long id, String n, String d, Long id_fk){
        this(); 
        this.id_crupier = id; 
        this.nombre = n; 
        this.dni_crupier = d; 
        this.id_fkjuego = id_fk; 
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

    public Long getId_fkjuego() {
        return id_fkjuego;
    }

    public void setId_fkjuego(Long id_fkjuego) {
        this.id_fkjuego = id_fkjuego;
    }
    
    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder(); 
        sb.append(" ID Crupier: ").append(this.id_crupier).append(" Nombre Crupier: ").append(this.nombre).append(" DNI Crupier: ").append(this.dni_crupier)
                .append(" ID Juego: ").append(this.id_fkjuego).append("|n"); 
        return sb.toString(); 
    }
    
}
