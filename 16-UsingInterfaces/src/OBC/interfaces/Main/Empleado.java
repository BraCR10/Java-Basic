package OBC.interfaces.Main;

public class Empleado {
    //Atributos
    //No se que es final
    private String Nombre;
    private String Apellidos;
    private int edad;
    private String telefono;
    private double salario;
    //Constructor
    //public Empleado() {}

    public Empleado(String nombre, String apellidos, int edad, String telefono, double salario) {
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
    }

    //Metodos
    @Override
    public String toString() {
        return "Empleados{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", salario=" + salario +
                '}';
    }
}
