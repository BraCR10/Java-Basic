package Main;

import Classes.coche;

import static Funtions.sum.suma;

public class main {
    public static void main(String[] args) {
        //Resultado de la la funcion sum
        System.out.println("La suma es: " + suma(30,50,60));

        //Resultado de la clase coche
        coche elCoche = new coche();
        elCoche.agregarPuertas();
        elCoche.agregarPuertas();
        elCoche.agregarPuertas();
        elCoche.agregarPuertas();
        System.out.println("El coche actualmente tiene: " + elCoche.puertas);}
}

