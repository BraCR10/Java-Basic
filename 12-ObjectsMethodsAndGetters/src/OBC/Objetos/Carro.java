package OBC.Objetos;

public class Carro {
    String marca;
    String modelo;
    double velocidad;
    int puertas;
    double peso;
    String colorExt;
    String colorInt;
    Integer añoFabricacion;

    //Constructor
    public Carro(String marca, String modelo, int puertas, double peso, String colorExt, String colorInt, Integer añoFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.peso = peso;
        this.colorExt = colorExt;
        this.colorInt = colorInt;
        this.añoFabricacion = añoFabricacion;
    }

    //Getters para usar las variables en el MainCarros
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public double getPeso() {
        return peso;
    }

    public String getColorExt() {
        return colorExt;
    }

    public String getColorInt() {
        return colorInt;
    }

    public Integer getAñoFabricacion() {
        return añoFabricacion;
    }

    //Metodos
    public double aceleracion(double km) {
        if (km > 0 && km < 500) {
            this.velocidad += km;
            return this.velocidad;
        }else {return 0;}
    }
    public String cambiarColorExt(String color) {
        return this.colorExt=color;
    }

}
