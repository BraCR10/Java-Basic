package OBC.Interfaces;

public abstract class Vehiculo implements FunMotor {
    //Atributos
    public String marca;
    public String modelo;
    public char ID;
    public double peso;
    public String color;
    public double velocidad;
    public int nllantas;
    public String combustible;

    //Construtores
    //public Vehiculo(){}
    public Vehiculo(String marca, String modelo, char ID,int nllantas ,double peso, String color,String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.nllantas=nllantas;
        this.peso = peso;
        this.color = color;
        this.combustible=combustible;
    }

    //Metodos
    @Override
    public abstract void acelerar(double km);
    @Override
    public abstract void frenar(double km);
    //ToString
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
                ", combustible='" + combustible + '\'' +
                '}';
    }
}



