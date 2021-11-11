package com.example.doctor_strange;

import java.util.Scanner;

public class Partida {
    //atributos
    private Scanner teclado = new Scanner(System.in);
    private int id;
    private Jugador jugador1, jugador2, ganador;
    private Escenario escenario;

    //constructor
    public Partida(Jugador jugador1, Jugador jugador2, Escenario escenario) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.escenario = escenario;
    }

    //metodos
    public void jugarPartida(){
        generarEquipo(escenario,jugador1); //generamos el equipo del jugador 1
        generarEquipo(escenario,jugador2); //generamos el equipo del jugador 2
    }
    public void generarEquipo(Escenario escenario, Jugador jugador){
        jugador.crearEquipo(escenario.getNumPersonajes());
    }
}
