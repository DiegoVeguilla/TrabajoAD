package com.example.doctor_strange;

import java.util.Scanner;

public class Partida {
    //atributos
    private Scanner teclado = new Scanner(System.in);
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

    //metodos
    public void jugarPartida(){
        generarEquipo(escenario,jugador1); //generamos el equipo del jugador 1
        generarEquipo(escenario,jugador2); //generamos el equipo del jugador 2
        combate();
        if (!empate){
            ganador.sumarMonedas(150);
        }else{
            jugador1.sumarMonedas(50);
            jugador2.sumarMonedas(50);
        }
    }
    private void generarEquipo(Escenario escenario, Jugador jugador){
        jugador.crearEquipo(escenario.getNumPersonajes());
    }
    private void combate(){
        do{
            selecionarPersonaje(jugador1);//cada jugador elije un personaje
            selecionarPersonaje(jugador2);//cada jugador elije un personaje
            enfrentamiento();
        }while(!finCombate());

    }
    private void selecionarPersonaje(Jugador jugador){
        int id1 = 0;
        boolean seguir;
        do {
            if (jugador.getEquipo().getMiembrosEquipo().get(id1).estoyVivo()){
                jugador.setPersonajeActual(jugador.getEquipo().getMiembrosEquipo().get(0)); //todo meter un menu con los personajes del array y seleccionarlo por la posicion en el array
                seguir = true;
            }else{
                System.out.println("El jugador esta eliminado");
                seguir = false;
            }
        }while(!seguir);
    }
    private void enfrentamiento(){
        //el modo de lucha de este juego se basa en realizar dos movimientos y comparar las energias vitales de ambos.
        //si la energiaReal del personaje del jugador 1 es mayor que la del segundo se le restara a la energiaVital del segundo la energiaReal del primero menos la del segundo.
        //si ambas energias reales son iguales el moviiento se realizara pero no se restara energiaVital a ningun personaje.
        if (jugador1.getPersonajeActual().getMovimientoActual().getEnergiaReal()>jugador2.getPersonajeActual().getMovimientoActual().getEnergiaReal()){
            System.out.println("Ronda ganada por "+jugador1.getUsuario());
            jugador2.getPersonajeActual().setEnergiaVital(jugador2.getPersonajeActual().getEnergiaVital()-(jugador1.getPersonajeActual().getMovimientoActual().getEnergiaReal()-jugador2.getPersonajeActual().getMovimientoActual().getEnergiaReal()));
        }else if (jugador1.getPersonajeActual().getMovimientoActual().getEnergiaReal()<jugador2.getPersonajeActual().getMovimientoActual().getEnergiaReal()) {
            System.out.println("Ronda ganada por "+jugador2.getUsuario());
            jugador1.getPersonajeActual().setEnergiaVital(jugador1.getPersonajeActual().getEnergiaVital()-(jugador2.getPersonajeActual().getMovimientoActual().getEnergiaReal()-jugador1.getPersonajeActual().getMovimientoActual().getEnergiaReal()));
        }else {
            System.out.println("Empate");
        }

    }
    private boolean finCombate(){
        if(!jugador1.getEquipo().estamosVivos()&&!jugador2.getEquipo().estamosVivos()){
            empate = true;
            return true;
        }else if (!jugador1.getEquipo().estamosVivos()){
            ganador = jugador2;
            return true;
        } else if (!jugador2.getEquipo().estamosVivos()){
            ganador = jugador1;
            return true;
        }else{
            return false;
        }
    }


}
