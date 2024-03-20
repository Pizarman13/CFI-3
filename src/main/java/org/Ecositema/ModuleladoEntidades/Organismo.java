package org.Ecositema.ModuleladoEntidades;

public class Organismo {

    protected int salud;
    protected int edad;
    protected boolean estadoReproductivo;
    protected int posicion;

    // constructor vacio
    public Organismo() {

    }

    public Organismo(int salud, int edad, boolean estadoReproductivo, int posicion) {
        this.salud = salud;
        this.edad = edad;
        this.estadoReproductivo = estadoReproductivo;
        this.posicion = posicion;
    }

    // getters
    public int getSalud() {
        return salud;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getEstadoReproductivo() {
        return estadoReproductivo;
    }

    public int getPosicion() {
        return posicion;
    }

    // setters
    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstadoReproductivo(boolean estadoReproductivo) {
        this.estadoReproductivo = estadoReproductivo;
    }

    public void setPosicion(int posicion) {
        this.edad = posicion;
    }

    public void reproducirse() {

    }

    public void envejecer() {
        edad++;
        if (edad > 3) {
            salud -= 10;
        }
    }

    public void morir() {
        if (salud <= 0 || edad > 15) {
            System.out.println("Ha muerto");
        }
    }

    }
