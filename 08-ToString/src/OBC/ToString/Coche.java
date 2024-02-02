package OBC.ToString;

public class Coche {
    //Atributos
    private String marca;
    private String modelo;
    private char ID;
    private double peso;
    private String color;
    private double velocidad;

    //Construtores
    public Coche(){}
    public Coche(String marca, String modelo, char ID, double peso, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.ID = ID;
        this.peso = peso;
        this.color = color;
    }

    //Metodos
    public double acelerar(double km){
        this.velocidad+=km;
        return this.velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ID=" + ID +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
