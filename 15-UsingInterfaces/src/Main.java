public class Main {
    public static void main(String[] args) {
        //Instancia del carro y la moto
        Carro carro=new Carro();
        Moto moto = new Moto();
        //Ejecuta los datos de ambos
        EjecutaAcelerar(carro);
        EjecutaFrenar(carro);
        EjecutaAcelerar(moto);
        EjecutaFrenar(moto);

        //Recurcividad
        System.out.println("\n"+factorial(11));

    }
    //Define cuanto valen los parametros de la interfas Vehiculo
    public static void EjecutaAcelerar(Vehiculo acelerador){
        acelerador.Acelerar(15);
    }
    public static void EjecutaFrenar(Vehiculo frenos){
        frenos.Frenar(-12);
    }
    //Recursividad otro tema, esto es como un bucle pero la misma funcion se invoca a ella misma hasta llegar a un resultado
    public static int factorial(int num){
        int resultado;
        if(num == 1){
            return 1;
        }
        resultado =factorial(num-1)*num;
        return resultado;
    }
}
interface Vehiculo{
    void Acelerar (int Velocidad);
    void Frenar (int Velocidad);
}
class Carro implements Vehiculo{
    int Velocidad=30;
    public void Acelerar(int Velocidad){
        this.Velocidad=this.Velocidad+Velocidad;
        System.out.println("La velocidad actual cuando acelera el carro es de "+this.Velocidad);
    }
    public void Frenar(int Velocidad){
        this.Velocidad=this.Velocidad+Velocidad;
        System.out.println("La velocidad actual cuando frena el carro es de " +this.Velocidad);
    }
}
class Moto implements Vehiculo{
    int Velocidad=15;
    @Override
    public void Acelerar(int Velocidad) {
        this.Velocidad=this.Velocidad+Velocidad;
        System.out.println("\nLa velocidad actual cuando acelera la moto es de "+this.Velocidad);
    }

    @Override
    public void Frenar(int Velocidad) {
        this.Velocidad=this.Velocidad+Velocidad;
        System.out.println("La velocidad actual cuando frena la moto es de "+this.Velocidad);
    }
}