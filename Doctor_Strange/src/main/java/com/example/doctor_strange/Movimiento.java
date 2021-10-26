package com.example.doctor_strange;

import java.util.Locale;

public class Movimiento {
    //atributos
    Personaje personaje1, personaje2; //jugador1 -> ejecuta, jugador2 -> recibe
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
    public void quitarEnergia(Movimiento movimiento){
        //modificamos la energiaLucha ejecutor del movimiento
        movimiento.getPersonaje1().setEnergiaLucha(movimiento.getPersonaje1().getEnergiaLucha() - movimiento.getEnergiaReal());
        //modificamos la energiaVital del receptor del movimiento
        movimiento.getPersonaje2().setEnergiaVital(movimiento.getPersonaje2().getEnergiaVital() - movimiento.getEnergiaReal());
    }

    //getters && setters
    public Personaje getPersonaje1() {
        return personaje1;
    }
    public void setPersonaje1(Personaje personaje1) {
        this.personaje1 = personaje1;
    }
    public Personaje getPersonaje2() {
        return personaje2;
    }
    public void setPersonaje2(Personaje personaje2) {
        this.personaje2 = personaje2;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getEnergiaInicial() {
        return energiaInicial;
    }
    public void setEnergiaInicial(double energiaInicial) {
        this.energiaInicial = energiaInicial;
    }
    public double getEnergiaReal() {
        return energiaReal;
    }
    public void setEnergiaReal(double energiaReal) {
        this.energiaReal = energiaReal;
    }
}
