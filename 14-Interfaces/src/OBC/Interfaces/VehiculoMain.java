package OBC.Interfaces;

public class VehiculoMain {
    public static void main(String[] args) {
    //Instancia de coche que hereda de Vehiculo y Vehiculo implementa FunMotor
        FunMotor civic = new Coche("Honda","Civic",'1',4,1485.26d,"Azul","Gasolina","10/11/2019");
        civic.acelerar(45.32d);
        civic.acelerar(258.32d);
        civic.frenar(80.32d);
        civic.frenar(40.9d);
        System.out.println(civic+"\n");
    }
}
