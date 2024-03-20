package org.Ecositema.ModuleladoEntidades;

public class Planta extends Organismo{

    public Planta(int salud, int edad, boolean estadoReproductivo, int posicion) {
        super(salud, edad, estadoReproductivo, posicion);
    }

    @Override
    public void reproducirse() {
        if (estadoReproductivo && Math.random() < 0.1) { // Probabilidad de reproducción
            System.out.println("Se ha reproducido");
            Planta nuevaPlanta = new Planta(100, 1, false, 0);
        } else {
            System.out.println("No se pudo reproducir");
        }
    }

    public void alimentarse() {
        salud += 10;

        if (salud > 100) {
            salud = 100;
        }
    }

}
