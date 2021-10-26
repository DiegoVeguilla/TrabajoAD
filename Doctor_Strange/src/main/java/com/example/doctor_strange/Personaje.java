package com.example.doctor_strange;

import java.util.ArrayList;

public class Personaje {
    //atributos
    int identificador, coste, recompensa, inteligencia, fuerza, velocidad, resistencia, habLucha, proyecEnergia;
    String origen;
    String alias, identidadSecreta, organizacion;
    ArrayList<Movimiento> listaMovimientos = null;
    double energiaVital, energiaLucha;

    //constructor
    public Personaje(){}
    //metodos

    //getters && setters
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getCoste() {
        return coste;
    }
    public void setCoste(int coste) {
        this.coste = coste;
    }
    public int getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }
    public int getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getHabLucha() {
        return habLucha;
    }
    public void setHabLucha(int habLucha) {
        this.habLucha = habLucha;
    }
    public int getProyecEnergia() {
        return proyecEnergia;
    }
    public void setProyecEnergia(int proyecEnergia) {
        this.proyecEnergia = proyecEnergia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getIdentidadSecreta() {
        return identidadSecreta;
    }
    public void setIdentidadSecreta(String identidadSecreta) {
        this.identidadSecreta = identidadSecreta;
    }
    public String getOrganizacion() {
        return organizacion;
    }
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
    public double getEnergiaVital() {
        return energiaVital;
    }
    public void setEnergiaVital(double energiaVital) {
        this.energiaVital = energiaVital;
    }
    public double getEnergiaLucha() {
        return energiaLucha;
    }
    public void setEnergiaLucha(double energiaLucha) {
        this.energiaLucha = energiaLucha;
    }

    //peronsajes
    Personaje doctorStrange = new Personaje();
}
