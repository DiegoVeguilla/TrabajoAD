package com.example.doctor_strange;

import java.util.ArrayList;

public class Personaje {
    //atributos
    int identificador, coste, recompensa;
    ArrayList<Integer> Poderes = new ArrayList();//, inteligencia, fuerza, velocidad, resistencia, habLucha, proyecEnergia
    String origen, tipo;
    String alias, identidadSecreta, organizacion;
    ArrayList<Movimiento> listaMovimientos = null;
    double energiaVital, energiaLucha;
    //constructor

    public Personaje() {}

    //metodos

    //getters && setter
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

}
