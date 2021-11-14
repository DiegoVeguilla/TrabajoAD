package com.example.doctor_strange;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    //atributos
    Scanner teclado = new Scanner(System.in);
    private String usuario, contrasenia, organizacion;
    private int monedas, victorias;
    private ArrayList<Integer> personajes;
    private Equipo equipo;
    private Personaje personajeActual;
    private int[] gemas;

    //constructor
    public Jugador(String usario, String contrasenia, String organizacion){
        this.usuario = usario;
        this.contrasenia = contrasenia;
        this.organizacion = organizacion;
        personajes = new ArrayList<>();
        gemas = new int[5];
        if(organizacion.toLowerCase().equals("avengers")){
            for (int i : new int[]{3, 6, 7, 13, 1, 5, 14, 15, 16, 17}) {
                personajes.add(i);
            }
        }else if (organizacion.toLowerCase().equals("x-men")){
            for (int i : new int[]{8, 9, 10, 11, 1, 5, 14, 15, 16, 17}) {
                personajes.add(i);
            }
        }
    }

    //metodos
    public void sumarMonedas (int addMonedas){
        monedas =+ addMonedas;
    }
    private void añadirPersonaje (int id){
        personajes.add(id);
    }
    public void crearEquipo(int nPersonajes) {
        for (int i = 0; i < nPersonajes ; i++) {
            System.out.println("Introduzca la id del personaje");
            int id =12;
            //todo añadir comprobacion el id debe estar en personajes y que no se repitan
            equipo.addPersonaje(id);
        }
    }

    //getters && setters
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getContrasenia() {
        return contrasenia;
    }
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public String getOrganizacion() {
        return organizacion;
    }
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
    public int getMonedas() {
        return monedas;
    }
    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
    public int getVictorias() {
        return victorias;
    }
    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    public int[] getGemas() {
        return gemas;
    }
    public void setGemas(int[] gemas) {
        this.gemas = gemas;
    }
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public Personaje getPersonajeActual() {
        return personajeActual;
    }
    public void setPersonajeActual(Personaje personajeActual) {
        this.personajeActual = personajeActual;
    }
}
