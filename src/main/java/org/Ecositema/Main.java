package org.Ecositema;

import org.Ecositema.ModuleladoYSimulaciones.*;
public class Main {
    public static void main(String[] args) {

        // Cremos algunos ambientes
        Ambiente aTropical = new Ambiente("Primavera", "Selva", 100);
        Ambiente aDesertico = new Ambiente("Verano", "Desierto", 70);
        Ambiente aTemplado = new Ambiente("Otoño", "Bosque", 80);
        Ambiente aFrio = new Ambiente("Invierno", "Montaña", 90);

        // Creamos algunos organismos
        Animal animal1 = new Animal(100, 2, true, 5);
        Animal animal2 = new Animal(100, 3, true, 10);
        Planta planta1 = new Planta(100, 4, true, 10);
        Planta planta2 = new Planta(100, 2, true, 10);
        Animal animal3 = new Animal(100, 2, true, 5);




        }
}