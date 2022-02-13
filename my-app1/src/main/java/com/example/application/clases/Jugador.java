package com.example.application.clases;

import java.util.Scanner;

public class Jugador {
    //atributos
    Scanner teclado = new Scanner(System.in);
    private String usuario, correo, contrasenia, genero, pais, edad, telefono;
    private int monedas, victorias;
    private Equipo equipo;
    private Personaje personajeActual;

    //constructor
    public Jugador(String usuario, String correo, String contrasenia, String genero, String pais, String edad, String telefono, int victorias) {
        this.usuario = usuario;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.genero = genero;
        this.pais = pais;
        this.edad = edad;
        this.telefono = telefono;
        this.victorias = victorias;
        equipo = new Equipo(3);
    }

    //metodos

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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Personaje getPersonajeActual() {
        return personajeActual;
    }

    public void setPersonajeActual(Personaje personajeActual) {
        this.personajeActual = personajeActual;
    }
}