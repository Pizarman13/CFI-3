package org.Ecositema.ModuleladoEntidades;

public class Interaciones {

    public void interactuar(Organismo organismo1, Organismo organismo2, Ambiente ambiente) {
        if (organismo1.getPosicion() == organismo2.getPosicion()) {
            if (organismo1 instanceof Animal && organismo2 instanceof Animal) {
                System.out.println("Los animales se atacan");
                organismo1.setSalud(organismo1.getSalud() - 10);
                organismo2.setSalud(organismo2.getSalud() - 10);
            } else if (organismo1 instanceof Planta && organismo2 instanceof Planta) {
                System.out.println("Las plantas compiten por la luz");
                organismo1.setSalud(organismo1.getSalud() - 10);
                organismo2.setSalud(organismo2.getSalud() - 10);
            } else if (organismo1 instanceof Animal && organismo2 instanceof Planta) {
                System.out.println("El animal se alimenta de la planta");
                organismo1.setSalud(organismo1.getSalud() + 10);
                organismo2.setSalud(organismo2.getSalud() - 10);
            } else if (organismo1 instanceof Planta && organismo2 instanceof Animal) {
                System.out.println("La planta polinizo al animal mientras se alimenta de ella");
                organismo1.setSalud(organismo1.getSalud() - 10);
                organismo2.setSalud(organismo2.getSalud() + 10);
            }
        }

        organismo1.envejecer();
        organismo2.envejecer();

        if(organismo1.getSalud() <= 0){
            organismo1.morir();
        }

        if(organismo2.getSalud() <= 0){
            organismo2.morir();
        }

        if(organismo1.getEdad() > 10 && organismo1 instanceof Animal){
            organismo1.reproducirse();
        }

        if(organismo2.getEdad() > 10 && organismo2 instanceof Animal){
            organismo2.reproducirse();
        }

        if(organismo1.getEdad() > 10 && organismo1 instanceof Planta){
            organismo1.reproducirse();
        }

        if(organismo2.getEdad() > 10 && organismo2 instanceof Planta){
            organismo2.reproducirse();
        }

        if(ambiente.getRecursosDisponibles() <= 0){
            System.out.println("El ambiente se ha degradado");
            organismo1.setSalud(organismo1.getSalud() - 10);
            organismo2.setSalud(organismo2.getSalud() - 10);


        }

        if(ambiente.getClima().equals("Primavera")) {
            ambiente.primavera();
        }

        if(ambiente.getClima().equals("Invierno")) {
            ambiente.invierno();
        }

        if(ambiente.getClima().equals("Verano")) {
            ambiente.verano();
        }

        if(ambiente.getClima().equals("Otoño")) {
            ambiente.otono();
        }

        if(ambiente.getTerreno().equals("Desierto")) {
            ambiente.desierto();
        }

        if(ambiente.getTerreno().equals("Bosque")) {
            ambiente.bosque();
        }

        if(ambiente.getTerreno().equals("Montaña")) {
            ambiente.montana();
        }

        if(ambiente.getTerreno().equals("Selva")) {
            ambiente.selva();
        }

        int numeroAleatorio = (int) (Math.random() * 5);

        if(numeroAleatorio == 0){
            ambiente.setClima("Primavera");
            System.out.println("Debido al cambio climatico el clima ha cambiado a primavera");
            ambiente.primavera();
        } else if(numeroAleatorio == 1){
            ambiente.setClima("Invierno");
            System.out.println("Debido al cambio climatico el clima ha cambiado a invierno");
            ambiente.invierno();
        } else if(numeroAleatorio == 2){
            System.out.println("Una enfermedad ha afectado a los organismos");
            organismo1.setSalud(organismo1.getSalud() - 10);
            organismo2.setSalud(organismo2.getSalud() - 10);
        } else if(numeroAleatorio == 3){
            System.out.println("Una plaga ha afectado a los organismos");
            organismo1.setSalud(organismo1.getSalud() - 10);
            organismo2.setSalud(organismo2.getSalud() - 10);
            ambiente.setRecursosDisponibles(ambiente.getRecursosDisponibles() - 10);
        } else if(numeroAleatorio == 4){
            System.out.println("Un incendio ha afectado a los organismos y al terreno");
            organismo1.setSalud(organismo1.getSalud() - 10);
            organismo2.setSalud(organismo2.getSalud() - 10);
            ambiente.desierto();
        }

    }

}
