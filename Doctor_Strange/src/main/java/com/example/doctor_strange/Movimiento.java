package com.example.doctor_strange;

public class Movimiento {
    //atributos
    Personaje jAtacante, jDefensdor;
    String tipo;
    double energiaInicial, energiaReal;
    //constructor
    public Movimiento(String tipo, Personaje jAtacante, Personaje jDefensdor){
        this.tipo = tipo;
        this.jAtacante = jAtacante;
        this.jDefensdor = jDefensdor;
        if (tipo){}
    }

    //metodos
    public  double calcularEnergiaReal(Personaje personaje);//hay que hacerlo en el constructor

    //TODO revisar este metodo con diego(encargado del sector partida)
    public void ejecutarMovimiento(Personaje personaje) {
        if (personaje.getEnergiaLucha() > energiaReal) {
            personaje.setEnergiaLucha(personaje.getEnergiaLucha() - energiaReal);
        }else if (personaje.getEnergiaLucha()!=0){
            energiaReal = personaje.getEnergiaLucha();
        }else{

        }
    }
}
