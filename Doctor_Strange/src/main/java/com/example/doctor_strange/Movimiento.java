package com.example.doctor_strange;

public class Movimiento {
    //atributos
    private Personaje personaje;
    private String tipo;
    private int energiaReal;
    private boolean posible;

    //constructor
    public Movimiento(String tipo, int energia) {
        if (tipo.toLowerCase().equals("ataque")){
            energiaReal = (int)((personaje.getFuerza()*0.8)+(personaje.getVelocidad()*0.25)+(personaje.getHabLucha()*0.75)+(personaje.getProyecEnergia()*1));
        }else{
            energiaReal = (int)((personaje.getInteligencia()*1)+(personaje.getVelocidad()*0.75)+(personaje.getHabLucha()*0.25)+(personaje.getFuerza()*0.20)*100);
        }
        if (personaje.getEnergiaLucha()>energia || personaje.getEnergiaLucha() == energiaReal){
            posible = true;
            personaje.setEnergiaLucha(personaje.getEnergiaLucha()-energiaReal);
            //todo metodos de movimiento ()seguir
        }else{
            posible = false;
        }
    }
}
