package com.example.doctor_strange;

public class Movimiento {
    //atributos
    private Personaje personaje;
    private String tipo; //ataque o defensa
    private int energiaReal;
    private boolean posible;

    //constructor
    public Movimiento(String tipo, int energia, Personaje personaje) {
        do {
            if (tipo.toLowerCase().equals("ataque")){
                energiaReal = (int)((personaje.getFuerza()*0.8)+(personaje.getVelocidad()*0.25)+(personaje.getHabLucha()*0.75)+(personaje.getProyecEnergia()*1))*energia;
            }else{
                energiaReal = (int)((personaje.getInteligencia()*1)+(personaje.getVelocidad()*0.75)+(personaje.getHabLucha()*0.25)+(personaje.getFuerza()*0.20))*energia;
            }
            if (personaje.getEnergiaLucha()>personaje.getEnergiaLucha() || personaje.getEnergiaLucha() == energiaReal){
                posible = true;
            }else{
                posible = false;
                energia--;
                if (energia== 0){
                    System.out.println("Energía insuficiente para realizar un movimiento");
                    break;
                }
            }
        }while(posible==true);
    }
    //metodos
    //getters && setters
    public Personaje getPersonaje() {
        return personaje;
    }
    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getEnergiaReal() {
        return energiaReal;
    }
    public void setEnergiaReal(int energiaReal) {
        this.energiaReal = energiaReal;
    }
    public boolean isPosible() {
        return posible;
    }
    public void setPosible(boolean posible) {
        this.posible = posible;
    }
}

