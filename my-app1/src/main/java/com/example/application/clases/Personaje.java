package com.example.application.clases;

public class Personaje {
    //atributos
    private String identificador;
    private int energiaVital, numMovimientos;
    private String alias, identidadSecreta, organizacion, tipo, origen, url;
    private int inteligencia, fuerza, velocidad, resistencia, proyecEnergia, habLucha;
    private Movimiento movimientoActual;
    private boolean vivo = true;

    //constructor
    public Personaje(String identificador, String alias, String identidadSecreta, String organizacion, String tipo, String origen, String url, int inteligencia, int fuerza, int velocidad, int resistencia, int proyecEnergia, int habLucha) {
        this.identificador = identificador;
        this.alias = alias;
        this.identidadSecreta = identidadSecreta;
        this.organizacion = organizacion;
        this.tipo = tipo;
        this.origen = origen;
        this.url = url;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.proyecEnergia = proyecEnergia;
        this.habLucha = habLucha;
    }

    //metodos
    public void mostrarDatosPartida() {

        //mostramos las caracteristicas relevantes durante la partida del personaje selecionado

        System.out.println("Alias: " + alias);
        System.out.println("Energía: " + numMovimientos);
        System.out.println("Energía vital: " + energiaVital);
    }

    public void mostrarDatos() {

        //mostramos las caracteristicas relevantes durante del personaje selecionado cuando la partida aun no esta iniciada

        System.out.println("Identificador: " + identificador);
        System.out.println("Alias: " + alias);
        System.out.println("Identidad Secreta: " + identidadSecreta);
        System.out.println("Origen: " + origen);
        System.out.println("Organización: " + organizacion);
        System.out.println("Poderes");
        System.out.println("\t Inteligencia: " + inteligencia);
        System.out.println("\t Fuerza: " + fuerza);
        System.out.println("\t Velocidad: " + velocidad);
        System.out.println("\t Resistencia: " + resistencia);
        System.out.println("\t Proyección de energía: " + proyecEnergia);
        System.out.println("\t Habiladad de lucha: " + habLucha);
    }

    public void setEnergia(Escenario escenario) {

        //definimos la energiaVital, la energiaLucha y el numMovimientos del personaje ya que estos datos los determina el escenario

        energiaVital = escenario.getEnergiaVitalPersonaje();
        numMovimientos = escenario.getNumMovimientos();
    }

    /*public void realizarMovimiento(String tipo, int energia) {

        //ejecuta el movimiento realizado por el personaje segun determine el jugador siempre y cuando tenga energia suficiente

        //Movimiento movimiento = new Movimiento(tipo, energia, this);
        if (movimiento.isPosible()) {
            numMovimientos--;
            movimientoActual = movimiento;
        } else {
            //System.out.println("Este epersonaje no puede realizar ningun movimiento porque la energia de lucha (" + energiaLucha + ") es insuficiente");
        }

    }*/

    public boolean estoyVivo() {
        //muestra si el personaje esta vivo o muerto segun la energia vital que tenga
        if (energiaVital <= 0) {
            vivo = false;
            return false;
        }
        vivo = true;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public int getEnergiaVital() {
        return energiaVital;
    }

    public void setEnergiaVital(int energiaVital) {
        this.energiaVital = energiaVital;
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

    public Movimiento getMovimientoActual() {
        return movimientoActual;
    }

    public void setMovimientoActual(Movimiento movimientoActual) {
        this.movimientoActual = movimientoActual;
    }
}

