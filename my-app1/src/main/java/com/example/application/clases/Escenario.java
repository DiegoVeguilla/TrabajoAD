package com.example.application.clases;

public class Escenario {
    //atributos
    private String nombre, id,url;
    private int numPersonajes, numMovimientos, energiaVitalPersonaje, monedas;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //constructor
    public Escenario(String id, String nombre, int numPersonajes, int numMovimientos, int energiaVitalPersonaje, String url, int monedas) {
        this.nombre = nombre;
        this.id = id;
        this.numPersonajes = numPersonajes;
        this.numMovimientos = numMovimientos;
        this.energiaVitalPersonaje = energiaVitalPersonaje;
        this.url = url;
        this.monedas = monedas;
    }

    //metodos
    public void mostrarDatos() {
        System.out.println("Identificador: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Numero de personajes: " + numPersonajes);
        System.out.println("Numero de movimientos: " + numMovimientos);
        System.out.println("Energia Vital del personaje: " + energiaVitalPersonaje);
    }

    //getters && setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
}