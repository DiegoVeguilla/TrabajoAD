package com.example.doctor_strange;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Personaje {
    //atributos
    private String alias, identidadSecreta, organizacion, tipo, origen;
    private int identificador, coste, energiaVital, energiaLucha, numMovimientos;
    //private ArrayList<Movimiento> movimientos;
    private ArrayList<Integer> poderes;
    private int inteligencia, fuerza, velocidad, resistencia, proyecEnergia, habLucha;
    FileReader lector = null;

    //constructor
    public Personaje(int identificador) {
        this.identificador = identificador;
        try {
            File file = new File("src/resources/Personajes.txt");
            String personajes = "";
            int lecturaByte = 0;


            lector = new FileReader(file);
            while ((lecturaByte = lector.read()) != -1) {
                personajes += (char) lecturaByte;
            }
            JSONArray listaPersonajes = new JSONArray("src/resoures/Personajes.txt");
            JSONObject personaje = listaPersonajes.getJSONObject(identificador);
            this.alias = personaje.getString("Alias");
            this.identidadSecreta = personaje.getString("IdentidadSecreta");
            this.origen = personaje.getString("Origen");
            this.tipo = personaje.getString("Tipo");
            this.organizacion = personaje.getString("Organizacion");
            JSONArray listaPoderes = personaje.getJSONArray("Poderes");
            this.inteligencia = listaPoderes.getInt(0);
            this.fuerza = listaPoderes.getInt(1);
            this.velocidad = listaPoderes.getInt(2);
            this.resistencia = listaPoderes.getInt(3);
            this.proyecEnergia = listaPoderes.getInt(4);
            this.habLucha = listaPoderes.getInt(5);
            for (int i = 0; i < 6; i++) {
                poderes.add(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            System.out.println("Error. Archivo no encontrado");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //metodos
    public void mostrarDatosPartida() { //mostramos las caracteristicas de cada personaje durante la partida
        System.out.println("Identificador: " + identificador);
        System.out.println("Alias: " + alias);
        System.out.println("Identidad Secreta: " + identidadSecreta);
        System.out.println("Origen: " + origen);
        System.out.println("Tipo: " + tipo);
        System.out.println("Organización: " + organizacion);
        System.out.println("Poderes");
        System.out.println("\t Inteligencia: " + inteligencia);
        System.out.println("\t Fuerza: " + fuerza);
        System.out.println("\t Velocidad: " + velocidad);
        System.out.println("\t Resistencia: " + resistencia);
        System.out.println("\t Proyección de energía: " + proyecEnergia);
        System.out.println("\t Habiladad de lucha: " + habLucha);
        System.out.println("Lista de Movimientos: va determinado por el escenario");
        System.out.println("Energía vital: va determinado por el escenario");
        System.out.println("Energía de lucha: va determinado por el escenario");
    }
    public void mostrarDatos() { //mostramos las caracteristicas iniciales de cada personaje
        System.out.println("Identificador: " + identificador);
        System.out.println("Alias: " + alias);
        System.out.println("Identidad Secreta: " + identidadSecreta);
        System.out.println("Origen: " + origen);
        System.out.println("Tipo: " + tipo);
        System.out.println("Organización: " + organizacion);
        System.out.println("Poderes");
        System.out.println("\t Inteligencia: " + inteligencia);
        System.out.println("\t Fuerza: " + fuerza);
        System.out.println("\t Velocidad: " + velocidad);
        System.out.println("\t Resistencia: " + resistencia);
        System.out.println("\t Proyección de energía: " + proyecEnergia);
        System.out.println("\t Habiladad de lucha: " + habLucha);
    }
    public void setEnergia(Escenario escenario){
        energiaVital = escenario.getNumMovimientos()*150;
        energiaLucha = escenario.getNumMovimientos()*150;
        numMovimientos = escenario.getNumMovimientos();
    }

    //getters && setters
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
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
    public int getEnergiaVital() {
        return energiaVital;
    }
    public void setEnergiaVital(int energiaVital) {
        this.energiaVital = energiaVital;
    }
    public int getEnergiaLucha() {
        return energiaLucha;
    }
    public void setEnergiaLucha(int eneregisLucha) {
        this.energiaLucha = eneregisLucha;
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
    public int getProyecEnergia() {
        return proyecEnergia;
    }
    public void setProyecEnergia(int proyecEnergia) {
        this.proyecEnergia = proyecEnergia;
    }
    public int getHabLucha() {
        return habLucha;
    }
    public void setHabLucha(int habLucha) {
        this.habLucha = habLucha;
    }
    public ArrayList<Integer> getPoderes() {
        return poderes;
    }
    public void setPoderes(ArrayList<Integer> poderes) {
        this.poderes = poderes;
    }
}
