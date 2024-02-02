package OBC.interfaces.SinInterfaces;
import OBC.interfaces.Main.Empleado;
import java.util.List;
import java.util.ArrayList;
//Ya no se usa debido a que hay version 2
/**
 * Create
 * Read/Retrieve
 * Update
 * Delete
 * La lista de datos es una base de datos ficticia
 */
public class EmpleadosCRUD_Version1 {
    //Atributos
    //Creamos una lista con el tipo de dato de la clase Empleados, la cual funciona como base de datos ficticia, almacena los objeto que se creen usando esa clase.
    private static List<Empleado> BaseDatosEmpleados = new ArrayList<>();//No se que es final
    //Constructores

    //Métodos
    //Guardar un empleado en la base de datos ficticia
    public static void guardar(Empleado empleado){
        BaseDatosEmpleados.add(empleado);
    }
    //Mostrar datos
    public static void mostrarTodo(){
        List<Empleado> lector = BaseDatosEmpleados;
        System.out.println(lector);
    }
}
