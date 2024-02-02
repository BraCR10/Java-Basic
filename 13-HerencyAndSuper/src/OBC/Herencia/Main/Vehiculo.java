package OBC.Herencia.Main;
import OBC.Herencia.Extras.Extras;
public abstract class Vehiculo {
    //Atributos
    public String marca;
    public String modelo;
    public char ID;
    public double peso;
    public String color;
    public double velocidad;
    public int nllantas;
    public Extras extras;

    //Constructor
    //public Vehiculo(){}
    public Vehiculo(String marca, String modelo, char ID,int nllantas ,double peso, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.nllantas=nllantas;
        this.peso = peso;
        this.color = color;
    }
    public Vehiculo(String marca, String modelo, char ID,int nllantas ,double peso, String color,Extras extras) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.nllantas=nllantas;
        this.peso = peso;
        this.color = color;
        this.extras = extras;
    }



    //Metodos
    public abstract double acelerar(double km);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ID=" + ID +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                ", nllantas=" + nllantas +
                ", extras=" + extras +
                '}';
    }
}



