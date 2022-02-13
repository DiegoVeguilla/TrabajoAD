package com.example.application.clases;

public class Movimiento {
    //atributos
    private Personaje personaje;
    private int tipo; //ataque o defensa
    private int energiaReal;
    private boolean posible;

    //constructor
    public Movimiento(int tipo, int energia, Personaje personaje) {
        if (tipo == 0){
            energiaReal = (int)((personaje.getInteligencia()*1)+(personaje.getVelocidad()*0.75)+(personaje.getHabLucha()*0.25)+(personaje.getFuerza()*0.20))*energia;
        }else{
            energiaReal = (int)((personaje.getFuerza()*0.8)+(personaje.getVelocidad()*0.25)+(personaje.getHabLucha()*0.75)+(personaje.getProyecEnergia()*1))*energia;
        }
    }
    //metodos
    //getters && setters
    public Personaje getPersonaje() {
        return personaje;
    }
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEnergiaReal() {
        return energiaReal;
    }
    public void setEnergiaReal(int energiaReal) {
        this.energiaReal = energiaReal;
    }
    public boolean isPosible() {
        return posible;
    }
    public void setPosible(boolean posible) {
        this.posible = posible;
    }
}

