package OBC.Bucles;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase main tiene dos bucles uno foreach y otro while
 * El bucle while pone los nombres en una lista
 * El bucle for imprime los nombres de esa lista de manera concatenada con un espacio
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Objeto para leer de la entrada(input)
        List<String> nombres = new ArrayList<>();//Creamos la lista
        System.out.println("Anote cuantos nombres quieres concatenar: ");
        int cantNombres=input.nextInt();//Recibe cuantos nombres

        System.out.println("Escriba los nombres uno por uno, cada vez que escriba uno, pulse enter:");
        int cont = 0;
        while (cont<cantNombres){//Recibe los nombres
            String nombre = input.next();
            nombres.add(nombre);
            cont++;}

        StringBuilder concatenate = new StringBuilder();//Variable que se utiliza para concatenar
        for (String s : nombres) {//Concatena los nombres
            concatenate.append(s);
            concatenate.append(" ");}

        System.out.println(concatenate);}}