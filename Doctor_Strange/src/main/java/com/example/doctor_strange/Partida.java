package com.example.doctor_strange;

public class Partida {
    //atributos
    int identificador;
    Jugador jugador1, jugador2;
    Escenario escenario;
    //constructor
    public Partida(){}
    public Partida(Jugador jugador1, Jugador jugador2, Escenario escenario) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.escenario = escenario;
    }
    //métodos

    //getters && setters
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public Jugador getJugador1() {
        return jugador1;
    }
    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }
    public Jugador getJugador2() {
        return jugador2;
    }
    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }
    public Escenario getEscenario() {
        return escenario;
    }
    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
}
