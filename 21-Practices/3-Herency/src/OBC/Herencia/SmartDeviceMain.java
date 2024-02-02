package OBC.Herencia;
import OBC.Herencia.Devices.*;

/**
 * Clase con un main que hace objetos de SmartPhone y SmartWatch.
 * Imprime el método toString de cada objeto.
 */
public class SmartDeviceMain {
    public static void main(String[] args) {
        SmartPhone huawei = new SmartPhone("Snapdragon",8,128,true,true,"Huawei","P smart 2023",3.2,12,3,"Blue");
        SmartWatch samsung = new SmartWatch("Snapdragon",4,16,true,true,"Samsung","SW25",1.1,"Red",true,false);

        System.out.println("\n"+huawei+"\n");
        System.out.println("\n"+samsung+"\n");
    }
}
