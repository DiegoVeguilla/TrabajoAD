package com.example.application.clases;

import java.util.ArrayList;

public class Equipo {

    //atributos
    private int numPersonajes;
    private ArrayList<Personaje> miembrosEquipo;

    //constructor
    public Equipo(int numPersonajes) {
        this.numPersonajes = numPersonajes;
        miembrosEquipo = new ArrayList<>();
    }

    //metodos
    public void addPersonaje(Personaje personaje) {
        miembrosEquipo.add(personaje);
    }
    public ArrayList<String> comprimirEquipo(){
        ArrayList<String> equipoComprimido = new ArrayList<>();
        for (Personaje personaje:miembrosEquipo) {
            equipoComprimido.add(personaje.getIdentificador());
        }
        return equipoComprimido;
    }
    public boolean estamosVivos() {
        //comprueba si hay algún personaje vivo en el equipo
        for (Personaje personaje : miembrosEquipo) {
            if (personaje.estoyVivo()) {
                return true;
            }
        }
        return false;
    }
    public boolean tenemosMovimientos() {
        //comprueba si hay algún personaje con energía
        int energia=0;
        for (Personaje personaje : miembrosEquipo) {
            energia += personaje.getNumMovimientos();
        }
        if (energia != 0){
            return true;
        }
        return false;
    }
    public void setDatos(Escenario escenario){
        for (Personaje personaje : miembrosEquipo) {
            personaje.setEnergiaVital(escenario.getEnergiaVitalPersonaje());
            personaje.setNumMovimientos(escenario.getNumMovimientos());
        }
    }
    //getters && setters
    public int getNumPersonajes() {
        return numPersonajes;
    }

    public void setNumPersonajes(int numPersonajes) {
        this.numPersonajes = numPersonajes;
    }

    public ArrayList<Personaje> getMiembrosEquipo() {
        return miembrosEquipo;
    }

    public void setMiembrosEquipo(ArrayList<Personaje> miembrosEquipo) {
        this.miembrosEquipo = miembrosEquipo;
    }
}