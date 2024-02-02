package OBC.Herencia.Vehiculos;

import OBC.Herencia.Main.Vehiculo;

public class CocheElectrico extends Vehiculo {
    //Atributos
    public String combustible;
    //Constructores
    //public CocheElectrico() {}
    public CocheElectrico(String marca, String modelo, char ID,int nllantas, double peso, String color,String combustible){
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
                "CocheElectrico{" +
                "combustible='" + combustible + '\'' +
                '}';
    }
}
