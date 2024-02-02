package OBC.List;

public class Coche extends Vehiculo{
    //Atributos
    public String combustible;
    //Constructores
    //public Coche() {}
    public Coche(String marca, String modelo, char ID,int nllantas, double peso, String color,String combustible){
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
                "Coche{" +
                "combustible='" + combustible + '\'' +
                '}';
    }
    //Get de marca, esto ayuda a el bucle each en ListMain a cambiar la velocidad a cada coche
    //El atributo marca es de Vehiculo una clase heredada
    public String getMarca() {
        return marca;
    }

}
