package DatosAvanzados;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String cadena = "Cadena de texto";

        //Longitud
        int cadenaLen = cadena.length();
        System.out.println("La cadena mide " + cadenaLen);

        //Minusculas
        String cadenaMin = cadena.toLowerCase();
        System.out.println("La cadena esta en minuscula  "+cadenaMin);

        //Mayusculas
        String cadenaMayus = cadena.toUpperCase();
        System.out.println("La cadena esta en mayusculas "+cadenaMayus);

        //Comprobar si la cadena empieza con algunas letras
        boolean cadenaInicio = cadena.startsWith("Cons");
        if (cadenaInicio){System.out.println("Si inicia");}else{System.out.println("No inicia");}

        //Comprobar si la cadena termina con algunas letras
        boolean cadenaFinal = cadena.endsWith("xto");
        if (cadenaFinal){System.out.println("Si termina");}else{System.out.println("No termina");}

        //Como saber que caracter esta en una posicion
        char letra = cadena.charAt(5);
        System.out.println("La letra en esa posicion es: "+letra);

        //Recorer una cadena
        for (int i = 0; i < cadenaLen;i++){System.out.println("El caracter es: "+ cadena.charAt(i)+"\n");}
        String cadenaJunta = "";
        for (int i = 0; i < cadenaLen;i++){cadenaJunta+=cadena.charAt(i);}
        System.out.println("El cadena junta es: "+cadenaJunta);
        //Darle vuelta a una cadena
//        for (int i = cadenaLen; i != 0;i--){System.out.println("El caracter es: "+ cadena.charAt(i)+"\n");}
        String cadenaInvertida = "";
        for(int i = cadena.length()-1; i >= 0; i--) {cadenaInvertida += cadena.charAt(i);}
        System.out.println("La cadena alrevez es: "+cadenaInvertida);
    }
}
