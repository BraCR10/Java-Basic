package OBC.Funciones;

/**
 * Esta clase contiene una funcion
 * La funcion recibe dos parametros, el precio y IVA del producto
 * Imprime por pantalla el precio con IVA de cada producto
 */
public class FunMain {
    public static void main(String[] args) {

        double narajas = funPrecio(89.5d);
        System.out.println("El precio de las naranjas es: "+narajas);
        double manzanas = funPrecio(78.2d);
        System.out.println("El precio de las manzanas es: "+manzanas);
    }

     static double funPrecio(double precio) {
        double iva= precio *0.25;//Suponiedo que el IVA equivale a el 25% del valor del producto
        return  iva+precio;
    }
}