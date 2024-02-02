
public class Main {
    public static void main(String[] args) {
        System.out.println("\nPrimera parte:");
        //Primera parte
        int numeroIf = 5;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo\n\nSegunda parte:");
        } else if (numeroIf == 0) {
            System.out.println("El numero es igual a 0\n\nSegunda parte:");
        } else {
            System.out.println("El numero es negativo\n\nSegunda parte:");
        }
        //Segunda parte
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Cantidad de veces que se ha ejecutado el while:  " + numeroWhile);
        }
        System.out.println("\nTercera parte");
        //Tercera parte
        int numeroDoWhile = 0;
        do {
            numeroDoWhile+=3;
            System.out.println("Cantidad de veces que se ha ejecutado el DoWhile:  " + (numeroDoWhile-2));
        } while (numeroDoWhile < 3);
        System.out.println("\nCuarta parte:");

        //Cuarta  parte
        for (int numeroFor = 0; numeroFor <= 3; numeroFor += 1) {
            System.out.println("Cantidad de veces que se ha ejecutado el For:  " + (numeroFor + 1));
        }
        System.out.println("\nQuinta parte: ");

        //Quinta parte
        var estacion = "Invierno";
        switch(estacion){
            case "Verano":
                System.out.println("Actualmente estamos en la estacion llamada verano.");
                break;
            case "Otoño":
                System.out.println("Actualmente estamos en la estacion llamada otoño.");
                break;
            case "Primavera":
                System.out.println("Actualmente estamos en la estacion llamada primavera.");
                break;
            case "Invierno":
                System.out.println("Actualmente estamos en la estacion llamada invierno.");
                break;
            default:
                System.out.println("Esa estacion no existe.");}
    }
}