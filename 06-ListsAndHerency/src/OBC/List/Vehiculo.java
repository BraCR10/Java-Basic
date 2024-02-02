package OBC.List;


public abstract class Vehiculo {
    //Atributos
    public String marca;
    public String modelo;
    public char ID;
    public double peso;
    public String color;
    public double velocidad;
    public int nllantas;

    //Construtores
    //public Vehiculo(){}
    public Vehiculo(String marca, String modelo, char ID,int nllantas ,double peso, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.nllantas=nllantas;
        this.peso = peso;
        this.color = color;
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
                '}';
    }
}
