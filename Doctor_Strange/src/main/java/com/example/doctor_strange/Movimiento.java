package com.example.doctor_strange;

import java.util.Locale;

public class Movimiento {
    //atributos
    private Personaje personaje;
    private double energiaReal, energiaFinal;

    //constructor
    public Movimiento(int energiaReal, int energiaFinal) {
        this.energiaReal = ((personaje.getFuerza()*0.8)+(personaje.getVelocidad()*0.25)+(personaje.getHabLucha()*0.75)+(personaje.getProyecEnergia()*1));;
        this.energiaFinal = ((personaje.getInteligencia()*1)+(personaje.getVelocidad()*0.75)+(personaje.getHabLucha()*0.25)+(personaje.getFuerza()*0.20));
    }
}
