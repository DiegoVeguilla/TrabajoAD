package com.example.doctor_strange;

public class Jugador {
    //atributos
    String usuario, contrasenia, organizacion;
    int monedas;
    int[] gemas = new int[6];
    //ArrayList<Personajes> personajes = null;
    //TODO crear las clases de los personajes

    //constructor
    public Jugador(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public Jugador(){}

    //métodos


    //getters && setters
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getOrganizacion() {
        return organizacion;
    }
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
    public int getMonedas() {
        return monedas;
    }
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
    public int[] getGemas() {
        return gemas;
    }
    public void setGemas(int[] gemas) {
        this.gemas = gemas;
    }
}
