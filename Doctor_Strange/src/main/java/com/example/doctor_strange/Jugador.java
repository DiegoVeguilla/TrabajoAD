package com.example.doctor_strange;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    //atributos
    Scanner teclado = new Scanner(System.in);
    private String usario, contrasenia, organizacion;
    private int monedas, victorias;
    private ArrayList<Integer> personajes;
    private Equipo equipo;
    private int[] gemas;

    //constructor
    public Jugador(String usario, String contrasenia, String organizacion) {
        this.usario = usario;
        this.contrasenia = contrasenia;
        this.organizacion = organizacion;
        personajes = new ArrayList<>();
        gemas = new int[5];
        if(organizacion.toLowerCase().equals("avengers")){
            for (int i : new int[]{3, 6, 7, 13, 1, 5, 14, 15, 16, 17}) {
                personajes.add(i);
            }
        }else{
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
            equipo.addPersonaje(teclado.nextInt());
        }
    }

    //getters && setters
    public String getUsario() {
        return usario;
    }
    public void setUsario(String usario) {
        this.usario = usario;
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
}
