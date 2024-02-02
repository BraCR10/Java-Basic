import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       //Sintaxis tipoDato[] identificadores = new tipoDato[numero de elemetos]
        String[] nombres = new String[3];
        nombres[0] = "Jose";
        nombres[1] = "Michael";
        nombres[2] = "Lorenzo";
        for (int i = 0; i < nombres.length; i++)
            System.out.println(nombres[i]);

        String Jose="Jose";
        String Michael="Michael";
        String Lorenzo="Lorenzo";
        String[] nombres2 = new String[]{Jose, Michael, Lorenzo};
        for (int i = 0; i < nombres2.length; i++)
            System.out.println(nombres2[i]);
    }
}