package OBC.List;

import java.util.ArrayList;
import java.util.List;
public class ListMain {
    public static void main(String[] args) {
    List<String> nombre = new ArrayList<>();/*Forma de crear una lista, primero el
    comando List<tipo dato>,identificador,=,new, ArrayList<>();*/

        //Ejemplo uno
        nombre.add("Jose");
        nombre.add("Jose");
        nombre.add("Jose");
        nombre.add("Jose");
        System.out.println("\n"+nombre);

        //Ejemplo dos
        nombre.remove(2);
        System.out.println("\n"+nombre+"\n");

        //Ejemplo tres
        //como hacer un for each
        //La variable temporal pasa por la lista
        for (String nombres /*Esta variable se crea solo para este for*/:nombre) System.out.println(nombres);

        //Ejemplo Cuatro
        List<Coche> garaje = new ArrayList<>();
        garaje.add(new Coche("Lamborgini","Aventador",'5',4,1852.95d,"Azul","Gasolina"));
        garaje.add(new Coche("Honda","Acura",'7',4,1252.95d,"Verde","Gasolina"));
        System.out.println("\nEscojiendo todos los indices: "+ garaje);
        System.out.println("\nSolo escojiendo el indice 1: "+ garaje.get(1));

        //Ejemplo Cinco
        List<Coche> garajeDos = new ArrayList<>();
        garajeDos.add(new Coche("Lamborgini","Aventador",'5',4,1852.95d,"Azul","Gasolina"));
        garajeDos.add(new Coche("Honda","Acura",'7',4,1252.95d,"Verde","Gasolina"));
        //Usamos for each para cambia la velocidad usando el metodo acelerar a cada objeto en la lista
        for (Coche coche : garajeDos){//coche recorre la lista garajeDos y practicamenta vale lo mismo que el valor de la lista
            switch (coche.getMarca()) {//Usamos el metodo getMarca para verificarla con los datos del constructor
                case "Lamborgini" -> coche.acelerar(120.25d);
                case "Honda" -> coche.acelerar(100.74d);
                //En este caso no usamos break porque ocupamos que a ambos sse aceleren, es mas eficaz usar swicth en este caso
            }
        }

        System.out.println("\nEscojiendo todos los indices con la velocidad modificada: "+ garajeDos);
    }
}
