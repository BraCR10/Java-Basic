package OBC.Map;

public class Coche extends Vehiculo{
    //Atributos
    public String combustible;
    //Constructores
    //public Coche() {}
    public Coche(String marca, String modelo, int nllantas, double peso, String color,String combustible){
        super(marca, modelo, nllantas, peso, color);
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
                "Coche{" +
                "combustible='" + combustible + '\'' +
                '}';
    }
}
