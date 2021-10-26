package com.example.doctor_strange;

import java.util.Locale;

public class Movimiento {
    //atributos
    Personaje personaje1, personaje2; //jugador1 -> el jugador que realiza el movimiento, jugador2 -> el jugador al que se le realiza el movimiento
    String tipo; //Ataque o defensa
    double energiaInicial, energiaReal;
    //constructor
    public Movimiento(String tipo, Personaje personaje, Personaje personaje2){
        this.tipo = tipo;
        this.personaje1=personaje1;
        this.personaje2=personaje2;
        if (tipo.toLowerCase().equals("ataque")){
            energiaReal=((personaje1.getFuerza()*0.8)+(personaje1.getVelocidad()*0.25)+(personaje1.getHabLucha()*0.75)+(personaje1.getProyecEnergia()*1));
        }else {
            energiaReal=((personaje1.getInteligencia()*1)+(personaje1.getVelocidad()*0.75)+(personaje1.getHabLucha()*0.25)+(personaje1.getFuerza()*0.20));
        }
    }

    //metodos
    //TODO revisar este metodo con diego(encargado del sector partida)

}
