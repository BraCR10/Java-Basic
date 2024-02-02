package OBC.Interfaces;

public class Coche extends Vehiculo{
    //Atributos
    String fechaFab;
    //Constructores
    //public Coche() {}
    public Coche(String marca, String modelo, char ID,int nllantas ,double peso, String color,String combustible,String fechaFab){
        super(marca,modelo,ID,nllantas,peso,color,combustible);
        this.fechaFab = fechaFab;
    }
    //Metodo de la interfas
    @Override
    public void acelerar(double km) {
        this.velocidad+=km;
    }
    @Override
    public void frenar(double km) {
        this.velocidad-=km;
    }
    //ToString

    @Override
    public String toString() {
        return super.toString() +
                "Coche{" +
                "fechaFab='" + fechaFab + '\'' +
                '}';
    }
}
