package OBC.Herencia.Main;

import OBC.Herencia.Vehiculos.*;
import OBC.Herencia.Extras.*;

public class VehiculoMain {
    public static void main(String[] args) {
        //Instancia de extras, la cual despues vamos a usar en honda civic
        Extras extrasCivic = new Extras(true,false,true,true);
        //Instancia Coche hereda de Vehiculo
        Coche civic = new Coche("Honda","Civic",'1',4,1485.26d,"Azul",extrasCivic,"Gasolina");
        civic.acelerar(45.32d);
        civic.acelerar(258.32d);
        //Instancia Coche hereda de Vehiculo
        Coche montero = new Coche("Mitsubichi","Montero",'5',4,2600.54d,"Verde Oscuro","Diesel");
        montero.acelerar(89.20d);
        montero.acelerar(120d);
        //Instancia CocheElectrico hereda de Vehiculo
        CocheElectrico modelS = new CocheElectrico("Tesla","Model S",'8',4,1885.26d,"Rojo","Electrico");
        modelS.acelerar(102.32d);
        modelS.acelerar(287.32d);
        //Instancia Moto hereda de Vehiculo
        Moto sportZS =new Moto("Freedom","Sport ZS",'3',2,800.23d,"Blanco","Gasolina");
        sportZS.acelerar(98.45d);
        sportZS.acelerar(222.32d);
        //Instancia MotoTrucada hereda de Moto
        MotoTrucada smx200 = new MotoTrucada("Katana","SMX 200",'6',2,750.2d,"Marron","Gasolina con aceite");
        smx200.acelerar(75d);
        smx200.acelerar(80.2d);
        //Instancia de extras, la cual despues vamos a usar en hyundai accent
        Extras extrasAccent = new Extras(true,true,true,true);
        //Instancia CocheGas hereda de Vehiculo
        CocheGas accent = new CocheGas("Hyundai","Accent",'7',4,1685.26d,"Amarillo",extrasAccent,"Gas");
        accent.acelerar(45.32d);
        accent.acelerar(258.32d);


        System.out.println(civic+"\n");
        System.out.println(montero+"\n");
        System.out.println(modelS+"\n");
        System.out.println(sportZS+"\n");
        System.out.println(smx200+"\n");
        System.out.println(accent+"\n");
    }
}
