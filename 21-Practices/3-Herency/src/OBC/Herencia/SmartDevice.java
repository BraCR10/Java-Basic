package OBC.Herencia;

/**
 * Clase sobre atributos comunes de SmartDevices
 * No se puede hacer objetos con ella.
 */
public abstract class SmartDevice {
    //Atributos
    String cpu;
    int ram;
    int diskMemory;
    boolean bluetooth;
    boolean wifiConnection;
    String marca;
    String modelo;
    double screenSize;

    //Constructores
    public SmartDevice() {}
    public SmartDevice(String cpu, int ram, int diskMemory, boolean bluetooth, boolean wifiConnection, String marca, String modelo, double screenSize) {
        this.cpu = cpu;
        this.ram = ram;
        this.diskMemory = diskMemory;
        this.bluetooth = bluetooth;
        this.wifiConnection = wifiConnection;
        this.marca = marca;
        this.modelo = modelo;
        this.screenSize = screenSize;
    }

    //Métodos

    @Override
    public String toString() {
        return "SmartDevice{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", diskMemory=" + diskMemory +
                ", bluetooth=" + bluetooth +
                ", wifiConnection=" + wifiConnection +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
