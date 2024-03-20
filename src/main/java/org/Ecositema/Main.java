package org.Ecositema;

import org.Ecositema.ModuleladoYSimulaciones.*;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        // Autentificador
        Autentificador();

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

        // Simulamos algunas interacciones
        Interaciones.interactuar(animal1, planta1, aTropical);
        Interaciones.interactuar(animal2, planta2, aDesertico);
        Interaciones.interactuar(animal3, animal1, aTemplado);
        Interaciones.interactuar(animal1, planta1, aFrio);

        }

        public static void Autentificador(){

            String usuarioCorrecto = "admin";
            String passwordCorrecto = "1234";

            System.out.println("Ingrese su usuario");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña");
            String contraseña = sc.nextLine();
            if(usuario.equals(usuarioCorrecto) && contraseña.equals(passwordCorrecto)){
                System.out.println("Bienvenido");
            } else {
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
}