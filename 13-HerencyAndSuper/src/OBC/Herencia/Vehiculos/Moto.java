package OBC.Herencia.Vehiculos;

import OBC.Herencia.Main.Vehiculo;

public class Moto extends Vehiculo {
    //Atributos
    String combustible;
    //public String combustible;
    //Constructores
    //public Moto() {}
    public Moto(String marca, String modelo, char ID,int nllantas, double peso, String color,String combustible){
        super(marca, modelo, ID, nllantas, peso, color);
        this.combustible = combustible;
    }
    //Metodo astracto
    public double acelerar(double km) {
        this.velocidad+=km;
        return this.velocidad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Moto{" +
                "combustible='" + combustible + '\'' +
                '}';
    }
}
