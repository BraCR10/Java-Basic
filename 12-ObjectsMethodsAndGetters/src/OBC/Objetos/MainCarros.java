package OBC.Objetos;

public class MainCarros {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda", "Civic", 4, 880, "Rojo", "Gris", 2019);
        String colorNuevo = carro1.cambiarColorExt("Amarelo");
        System.out.println("\nLas caracteristicas del carro 1:  ");
        System.out.println("Marca: "+ carro1.getMarca());
        System.out.println("Modelos: "+ carro1.getModelo());
        System.out.println("Puertas: "+ carro1.getPuertas());
        System.out.println("Peso: "+ carro1.getPeso()+"Kg");
        System.out.println("Color exterior: "+ carro1.getColorExt());
        System.out.println("Color interior: "+ carro1.getColorInt());
        System.out.println("Año de fabricacion: "+ carro1.getAñoFabricacion());
        double aceleracion = carro1.aceleracion(150);
        System.out.println("El vehiculo va a " + aceleracion + " km/h");

        Carro carro2 = new Carro("Toyota", "Yaris", 4, 500, "Rojo", "Negro", 2001);
        System.out.println("\nLas caracteristicas del carro 2:  ");
        System.out.println("Marca: "+ carro2.getMarca());
        System.out.println("Modelos: "+ carro2.getModelo());
        System.out.println("Puertas: "+ carro2.getPuertas());
        System.out.println("Peso: "+ carro2.getPeso()+"Kg");
        System.out.println("Color exterior: "+ carro2.getColorExt());
        System.out.println("Color interior: "+ carro2.getColorInt());
        System.out.println("Año de fabricacion: "+ carro2.getAñoFabricacion());
        double aceleracion2 = carro2.aceleracion(250);
        System.out.println("El vehiculo va a " + aceleracion2 + " km/h");

        Carro carro3 = new Carro("Chevrolet", "Camaro", 5, 1000, "Azul", "Azul Oscuro", 2023);
        System.out.println("\nLas caracteristicas del carro 3:  ");
        String colorNuevo3 = carro3.cambiarColorExt("Gris Plata");
        System.out.println("Marca: "+ carro3.getMarca());
        System.out.println("Modelos: "+ carro3.getModelo());
        System.out.println("Puertas: "+ carro3.getPuertas());
        System.out.println("Peso: "+ carro3.getPeso()+"Kg");
        System.out.println("Color exterior: "+ carro3.getColorExt());
        System.out.println("Color interior: "+ carro3.getColorInt());
        System.out.println("Año de fabricacion: "+ carro3.getAñoFabricacion());
        double aceleracion3 = carro3.aceleracion(80.3);
        System.out.println("El vehiculo va a " + aceleracion3 + " km/h");

        Carro carro4 = new Carro("Chevrolet", "Camaro", 5, 1000, "Azul", "Azul Oscuro", 2023);
        System.out.println("\nLas caracteristicas del carro 3:  ");
        String colorNuevo4 = carro4.cambiarColorExt("Gris Plata");
        System.out.println("Marca: "+ carro4.getMarca());
        System.out.println("Modelos: "+ carro4.getModelo());
        System.out.println("Puertas: "+ carro4.getPuertas());
        System.out.println("Peso: "+ carro4.getPeso()+"Kg");
        System.out.println("Color exterior: "+ carro4.getColorExt());
        System.out.println("Color interior: "+ carro4.getColorInt());
        System.out.println("Año de fabricacion: "+ carro4.getAñoFabricacion());
        double aceleracion4 = carro4.aceleracion(80.3);
        System.out.println("El vehiculo va a " + aceleracion4 + " km/h");
    }
}
