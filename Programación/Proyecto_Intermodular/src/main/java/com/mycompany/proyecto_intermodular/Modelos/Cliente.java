package com.mycompany.proyecto_intermodular.Modelos;

import java.sql.Date;

public class Cliente {

    public enum Sexo {
        HOMBRE("Hombre"),
        MUJER("Mujer");

        private String nombre;

        private Sexo(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(" Sexo: ").append(this.nombre);
            return sb.toString();
        }
    }

    private Long id_cliente;
    private String nombre_cliente;
    private String dni_cliente;
    private int edad;
    private boolean tarjeta;
    private double saldo;
    private Sexo sexo;
    private Date fecha;

    public Cliente() {
        // Me da la puta gana
    }

    public Cliente(Long id, String n, String d, int e, boolean t, double s, Sexo sexo, Date f) {
        this();
        this.id_cliente = id;
        this.nombre_cliente = n;
        this.dni_cliente = d;
        this.edad = e;
        this.tarjeta = t;
        this.saldo = s;
        this.sexo = sexo;
        this.fecha = f;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ID -> ").append(this.id_cliente).append(" Nombre -> ").append(this.nombre_cliente).append(" DNI -> ").append(this.dni_cliente)
                .append(" Edad -> ").append(this.edad).append(" Tarjeta -> ").append(this.tarjeta).append(" Saldo -> ").append(this.saldo).append(this.sexo.toString())
                .append(" Fecha -> ").append(this.fecha).append("\n");
        return sb.toString();
    }
}
