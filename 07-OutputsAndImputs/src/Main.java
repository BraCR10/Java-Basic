import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");//salida

        Scanner scanner = new Scanner(System.in);//Objeto para leer de la entrada(input)

        System.out.println("Escribe un nombre:");
        String nombre = scanner.nextLine();
        System.out.println("El nombre es: " + nombre);

        System.out.println("Escribe un valor:");
        int valor = scanner.nextInt();
        System.out.println("El valor es: " + valor);

    }
}