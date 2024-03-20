package org.Ecositema.ModuleladoEntidades;

public class Animal extends Organismo {


    public Animal(int salud, int edad, boolean estadoReproductivo, int posicion) {
        super(salud, edad, estadoReproductivo, posicion);
    }

    public void mover(int nuevaPosicion) {
        this.posicion = nuevaPosicion;
    }

    @Override
    public void reproducirse() {
        if (estadoReproductivo && Math.random() < 0.4) { // Probabilidad de reproducción
            System.out.println("El animal se ha reproducido");
            Animal nuevoAnimal = new Animal(100, 1, false, 0);
        } else {
            System.out.println("El animal no se pudo reproducir");
        }
    }

    public void alimentarse() {
        salud += 10;

        if (salud > 100) {
            salud = 100;
        }
    }




}
