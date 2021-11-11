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
}