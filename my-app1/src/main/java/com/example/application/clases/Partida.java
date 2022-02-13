package com.example.application.clases;

public class Partida {
    //atributos
    private int id;
    private boolean empate = false;
    private Jugador jugador1, jugador2, ganador;
    private Escenario escenario;

    //constructor
    public Partida(Jugador jugador1, Jugador jugador2, Escenario escenario) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.escenario = escenario;
    }
    public Partida(Jugador Ganador, Jugador perdedor, Equipo equipoGanador, Equipo equipoPerdedor,Escenario escenario, Boolean empate){
        MongoDB mongo = new MongoDB();
        mongo.guardarPartida(ganador,perdedor,equipoGanador,equipoPerdedor,escenario,empate);
    }
    //metodos
    public void iniciarPersonajes(Equipo equipo, Escenario escenario){
        for (Personaje personaje: equipo.getMiembrosEquipo()) {
            personaje.setEnergiaVital(escenario.getEnergiaVitalPersonaje());
            personaje.setNumMovimientos(escenario.getNumMovimientos());
        }
    }
    //getter  setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpate() {
        return empate;
    }

    public void setEmpate(boolean empate) {
        this.empate = empate;
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

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }
}
