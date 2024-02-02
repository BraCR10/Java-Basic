package OBC.Herencia.Vehiculos;

import OBC.Herencia.Main.Vehiculo;
import OBC.Herencia.Extras.Extras;

public class CocheGas extends Vehiculo {
    //Atributos
    public String combustible;
    //Constructores
    //public CocheGas() {}
    public CocheGas(String marca, String modelo, char ID, int nllantas, double peso, String color, String combustible){
        super(marca, modelo, ID, nllantas, peso, color);
        this.combustible = combustible;
    }
    public CocheGas(String marca, String modelo, char ID, int nllantas, double peso, String color,Extras extras, String combustible){
        super(marca, modelo, ID, nllantas, peso, color,extras);
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
                "CocheGas{" +
                "combustible='" + combustible + '\'' +
                '}';
    }
}
