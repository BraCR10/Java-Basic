public class Main {
    public static void main(String[] args) {
        //Llamada al cliente
        Cliente cliente = new Cliente(30, "Marco Lopez", "8754-6298", 874546.54);
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad()+" años");
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        //Llamada al trabajador
        Trabajador trabajador = new Trabajador(45, "Juan Gomez", "8745-1259", 789554.55);
        trabajador.setEdad(90);//Ejemplo de lo que hace set
        System.out.println("\nNombre del trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad()+" años");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
//Clase persona
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    // Constructor
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
//Clase cliente que hereda de persona
class Cliente extends Persona {
    private double credito;

    //Constructor
    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono); // llamada al constructor de la clase padre
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}
//Clase trabajador que hereda de persona
class Trabajador extends Persona{
    private double salario;
    //Constructor
    public Trabajador(int edad, String nombre, String telefono, double salario){
        super(edad,nombre,telefono);//llama a el constructor del padre
        this.salario=salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}


