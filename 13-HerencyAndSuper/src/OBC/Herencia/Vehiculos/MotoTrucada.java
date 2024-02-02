package OBC.Herencia.Vehiculos;

public class MotoTrucada extends Moto{
    //Atributos

    //Constructores
    //public MotoTrucada() {}
    public MotoTrucada(String marca, String modelo, char ID,int nllantas, double peso, String color,String combustible){
        super(marca, modelo, ID, nllantas, peso, color,combustible);
    }
    //Metodo
    //Sobrescribe la funcion de acelerar de la moto y le agragamos cosas adicionales a la original
    @Override
    public double acelerar(double km) {
        km*=2;
        return super.acelerar(km);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
