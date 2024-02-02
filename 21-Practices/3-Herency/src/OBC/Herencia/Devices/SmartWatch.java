package OBC.Herencia.Devices;
import OBC.Herencia.SmartDevice;

/**
 * Clase de SmartWatch, con algunos atributos unicos.
 */
public class SmartWatch extends SmartDevice {
    //Atributos
    String watchBraceletColor;
    boolean fitnessWatch;
    boolean smallCamera;

    //Constructor
    //public SmartWatch() {}
    public SmartWatch(String cpu, int ram, int diskMemory, boolean bluetooth, boolean wifiConnection, String marca, String modelo, double screenSize, String watchBraceletColor, boolean fitnessWatch, boolean smallCamera) {
        super(cpu, ram, diskMemory, bluetooth, wifiConnection, marca, modelo, screenSize);
        this.watchBraceletColor = watchBraceletColor;
        this.fitnessWatch = fitnessWatch;
        this.smallCamera = smallCamera;
    }

    //Métodos

    @Override
    public String toString() {
        return super.toString()+"SmartWatch{" +
                "watchBraceletColor='" + watchBraceletColor + '\'' +
                ", fitnessWatch=" + fitnessWatch +
                ", smallCamera=" + smallCamera +
                '}';
    }
}
