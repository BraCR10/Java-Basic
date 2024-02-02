package OBC.Arrays;
import java.util.Scanner;

//Usos avanzados del array
public class Main {
    public static void main(String[] args) {
        //Se debe definir el tipo de dato de array
        int arrayUno[] = new int[10]; //Indicamos el maximo de elementos en el array
        // Como almacenar los datos en array
        for (int i = 0; i < 10; i++) {
            arrayUno[i] = i + 1;
        }
        //Con un for podemos iterar y alamcenar los 10 numeros
        //Lo podemos hacer manualmente
        int arrayDos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //Vamos a imprimir
        for (int i : arrayUno) {
            System.out.println(i);
        }
        for (int i : arrayDos) {
            System.out.println(i);
        }
        //midamos los arrays
        System.out.println("\nLongitud = "+ arrayUno.length);
        System.out.println("\nLongitud = "+ arrayDos.length);

        //Array bidimencional matriz
        int arrayBidim[][] = new int[2][4];//Dos filas y cuatro columnas
        arrayBidim[0][0] = 1;//Primera fila primera columna = 1
        arrayBidim[0][1] = 2;//Primera fila segunda columna = 2
        arrayBidim[0][2] = 3;//Primera fila tercera columna = 3
        arrayBidim[0][3] = 4;//Primera fila cuarta columna = 4

        arrayBidim[1][0] = 10;//Segunda fila primera columna = 1
        arrayBidim[1][1] = 20;//Segunda fila segunda columna = 2
        arrayBidim[1][2] = 30;//Segunda fila tercera columna = 3
        arrayBidim[1][3] = 40;//Segunda fila cuarta columna = 4

        //Para iterar hay que usar dos for o for each
        for (int i=0;i<arrayBidim.length;i++) {
            System.out.println("\n");
            for (int j=0;j<arrayBidim[i].length;j++) {System.out.println("Todos los datos de la matriz: "+ arrayBidim[i][j]);}
        }//Primero iteramos en las filas y luego en las columnas
        //Array bidimencional abreviado
        int arrayBidimAbv[][]={
            {1, 2, 3, 4}, {10, 20, 30, 40}};
        //Para iterar hay que usar dos for o for each
        for (int i=0;i<arrayBidimAbv.length;i++) {
            System.out.println("\n");
            for (int j=0;j<arrayBidimAbv[i].length;j++) {System.out.println("Todos los datos de la matriz: "+ arrayBidimAbv[i][j]);}
        }

    }
}