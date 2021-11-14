package com.example.doctor_strange;

public class Escenario {
    //atributos
    private String nombre;
    private int id, numPersonajes, numMovimientos, energiaVitalPersonaje;

    //constructor
    public Escenario(int id){
        //TODO crear el json y completamos el constructor
    }

    //getters && setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumPersonajes() {
        return numPersonajes;
    }
    public void setNumPersonajes(int numPersonajes) {
        this.numPersonajes = numPersonajes;
    }
    public int getNumMovimientos() {
        return numMovimientos;
    }
    public void setNumMovimientos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
    }
    public int getEnergiaVitalPersonaje() {
        return energiaVitalPersonaje;
    }
    public void setEnergiaVitalPersonaje(int energiaVitalPersonaje) {
        this.energiaVitalPersonaje = energiaVitalPersonaje;
    }
}