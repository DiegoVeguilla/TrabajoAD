package com.example.doctor_strange;

public class Escenario {
    //atributos
    String nombre;
    int numPersonajes, numMonedas, numMovimientos;

    //constructor
    public Escenario() {}

    //métodos

    //getters && sertters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumPersonajes() {
        return numPersonajes;
    }
    public void setNumPersonajes(int numPersonajes) {
        this.numPersonajes = numPersonajes;
    }
    public int getNumMonedas() {
        return numMonedas;
    }
    public void setNumMonedas(int numMonedas) {
        this.numMonedas = numMonedas;
    }
    public int getNumMovimientos() {
        return numMovimientos;
    }
    public void setNumMovimientos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
    }
}