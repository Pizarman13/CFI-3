package org.Ecositema.ModuleladoEntidades;

public class Ambiente {

    private String clima;
    private String terreno;
    private int recursosDisponibles;

    public Ambiente(String clima, String terreno, int recursosDisponibles) {
        this.clima = clima;
        this.terreno = terreno;
        this.recursosDisponibles = recursosDisponibles;
    }

    // getters y setters

    public int getRecursosDisponibles() {
        return recursosDisponibles;
    }

    public void setRecursosDisponibles(int recursosDisponibles) {
        this.recursosDisponibles = recursosDisponibles;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    public void invierno(){
        System.out.println("Debido al invierno los recursos se han reducido");
        recursosDisponibles -= 10;
    }

    public void primavera(){
        System.out.println("Debido a la primavera los recursos se han incrementado");
        recursosDisponibles += 10;
    }

    public void verano(){
        System.out.println("Debido al verano los recursos se han incrementado");
        recursosDisponibles += 10;
    }

    public void otono(){
        System.out.println("Debido al otoño los recursos se han reducido");
        recursosDisponibles -= 5;
    }

    public void desierto(){
        System.out.println("Debido al desierto los recursos se han reducido");
        recursosDisponibles -= 20;
    }

    public void bosque(){
        System.out.println("Debido al bosque los recursos se han incrementado");
        recursosDisponibles += 15;
    }

    public void montana(){
        System.out.println("Debido a la montaña los recursos se han reducido");
        recursosDisponibles -= 10;
    }

    public void selva(){
        System.out.println("Debido a la selva los recursos se han incrementado");
        recursosDisponibles += 20;
    }



}
