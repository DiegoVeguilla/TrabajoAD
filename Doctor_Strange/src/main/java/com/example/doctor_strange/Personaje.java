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
    private ArrayList<Integer> poderes = new ArrayList<>();
    private int inteligencia, fuerza, velocidad, resistencia, proyecEnergia, habLucha;
    private Movimiento movimientoActual;
    private boolean vivo;
    FileReader lector = null;

    //constructor
    public Personaje(int id) {
        this.identificador = id-1;
        try {
            File file = new File("src/main/java/com/example/doctor_strange/resources/Personajes.txt");
            String personajes = "";
            int lecturaByte = 0;

            lector = new FileReader(file);
            while ((lecturaByte = lector.read()) != -1) {
                personajes += (char) lecturaByte;
            }
            JSONArray listaPersonajes = new JSONArray(personajes);
            JSONObject personaje = listaPersonajes.getJSONObject(identificador);
            this.alias = personaje.getString("Alias");
            this.identidadSecreta = personaje.getString("IdentidadSecreta");
            this.origen = personaje.getString("Origen");
            this.tipo = personaje.getString("Tipo");
            this.organizacion = personaje.getString("Organizacion");
            JSONArray listaPoderes = personaje.getJSONArray("Poderes");
            JSONObject poderes1 = listaPoderes.getJSONObject(0);
            this.inteligencia = poderes1.getInt("Inteligencia");
            this.fuerza = poderes1.getInt("Fuerza");
            this.velocidad = poderes1.getInt("Velocidad");
            this.resistencia = poderes1.getInt("Resistencia");
            this.proyecEnergia = poderes1.getInt("ProyecEnergia");
            this.habLucha = poderes1.getInt("HabLucha");
            for (int i = 0; i < 6; i++) {
                poderes.add(inteligencia);
                poderes.add(fuerza);
                poderes.add(velocidad);
                poderes.add(resistencia);
                poderes.add(proyecEnergia);
                poderes.add(habLucha);
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
        System.out.println("Organizaci??n: " + organizacion);
        System.out.println("Poderes");
        System.out.println("\t Inteligencia: " + inteligencia);
        System.out.println("\t Fuerza: " + fuerza);
        System.out.println("\t Velocidad: " + velocidad);
        System.out.println("\t Resistencia: " + resistencia);
        System.out.println("\t Proyecci??n de energ??a: " + proyecEnergia);
        System.out.println("\t Habiladad de lucha: " + habLucha);
        System.out.println("Lista de Movimientos: va determinado por el escenario");
        System.out.println("Energ??a vital: va determinado por el escenario");
        System.out.println("Energ??a de lucha: va determinado por el escenario");
    }
    public void mostrarDatos() { //mostramos las caracteristicas iniciales de cada personaje
        System.out.println("Identificador: " + identificador);
        System.out.println("Alias: " + alias);
        System.out.println("Identidad Secreta: " + identidadSecreta);
        System.out.println("Origen: " + origen);
        System.out.println("Tipo: " + tipo);
        System.out.println("Organizaci??n: " + organizacion);
        System.out.println("Poderes");
        System.out.println("\t Inteligencia: " + inteligencia);
        System.out.println("\t Fuerza: " + fuerza);
        System.out.println("\t Velocidad: " + velocidad);
        System.out.println("\t Resistencia: " + resistencia);
        System.out.println("\t Proyecci??n de energ??a: " + proyecEnergia);
        System.out.println("\t Habiladad de lucha: " + habLucha);
    }
    public void setEnergia(Escenario escenario){
        energiaVital = escenario.getEnergiaVitalPersonaje();
        energiaLucha = escenario.getNumMovimientos()*5;
        numMovimientos = escenario.getNumMovimientos();
    }
    public void realizarMovimiento(){
        String tipo = "ataque"; //"ataque" o "defensa"
        //todo pedir por la interfaz el tipo de movimiento y poner energia
        int energia = 0;
        energiaLucha -= energia;
        Movimiento movimiento = new Movimiento(tipo,energia,this );
        if (movimiento.isPosible()){
            numMovimientos --;
            movimientoActual = movimiento;
        }else{
            System.out.println("Este epersonaje no puede realizar ningun movimiento porque la energia de lucha ("+energiaLucha+") es insuficiente");
        }

    }
    public boolean estoyVivo(){
        if (energiaVital == 0){
            return false;
        }
        return true;
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
    public void setEnergiaLucha(int energiaLucha) {
        this.energiaLucha = energiaLucha;
    }
    public int getNumMovimientos() {
        return numMovimientos;
    }
    public void setNumMovimientos(int numMovimientos) {
        this.numMovimientos = numMovimientos;
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
    public Movimiento getMovimientoActual() {
        return movimientoActual;
    }
    public void setMovimientoActual(Movimiento movimientoActual) {
        this.movimientoActual = movimientoActual;
    }
}

