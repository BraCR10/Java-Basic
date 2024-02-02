package OBC.Herencia.Devices;
import OBC.Herencia.SmartDevice;

/**
 * Clase de SmartPhones, con algunos atributos unicos.
 */
public class SmartPhone extends SmartDevice {
    //Atributos
    int quantityMegaPixeles;
    int quantityLenses;
    String backColor;

    //Constructores
   // public SmartPhone() {}

    public SmartPhone(String cpu, int ram, int diskMemory, boolean bluetooth, boolean wifiConnection, String marca, String modelo, double screenSize, int quantityMegaPixeles, int quantityLenses, String backColor) {
        super(cpu, ram, diskMemory, bluetooth, wifiConnection, marca, modelo, screenSize);
        this.quantityMegaPixeles = quantityMegaPixeles;
        this.quantityLenses = quantityLenses;
        this.backColor = backColor;
    }

    //Métodos

    @Override
    public String toString() {
        return super.toString()+ "SmartPhone{" +
                "quantityMegaPixeles=" + quantityMegaPixeles +
                ", quantityLenses=" + quantityLenses +
                ", backColor='" + backColor + '\'' +
                '}';
    }
}
