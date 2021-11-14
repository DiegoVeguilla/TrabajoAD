package com.example.doctor_strange;

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
    public void addPersonaje(int id){
        miembrosEquipo.add(new Personaje(id));
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