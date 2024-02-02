package OBC.interfaces.ConInterfaces;

import OBC.interfaces.Main.Empleado;
import java.util.ArrayList;
import java.util.List;
//Version actual
/**
 * Create
 * Read/Retrieve
 * Update
 * Delete
 * La lista de datos es una base de datos ficticia
 */

public class EmpleadosCRUDImpl implements EmpleadosCRUD {
    //Atributos
    private  List<Empleado> BaseDatosEmpleados = new ArrayList<>();//Base de datos ficticia
    //Constructores//No se que es final

    //Métodos
    //Guardar un empleado en la base de datos ficticia
    @Override
    public void save(Empleado empleado) {
        BaseDatosEmpleados.add(empleado);
    }
    //Mostrar datos
    @Override
    public void showAll() {
        List<Empleado> lector = BaseDatosEmpleados;
        System.out.println(lector);
    }

    //Borrar datos
    @Override
    public void delete(Empleado empleado) {
        BaseDatosEmpleados.remove(empleado);
    }

    //Actualizar datos
    //En este caso el id es el index en la List, lo pongo de manera manual en el main
    public void update(int id, Empleado empleado) {
        BaseDatosEmpleados.remove(id);
        BaseDatosEmpleados.add(id, empleado);
    }
}
