package OBC.interfaces.ConInterfaces;

import OBC.interfaces.Main.Empleado;

public class EmpleadosCRUDMySQL implements EmpleadosCRUD {
    @Override
    public void save(Empleado empleado) {
        System.out.println("MySQL save");
    }

    @Override
    public void showAll() {
        System.out.println("MySQL showAll");
    }

    @Override
    public void delete(Empleado empleado) {
        System.out.println("MySQL delete");
    }

    @Override
    public void update(int id, Empleado empleado) {
        System.out.println("MySQL update");
    }
    //Es un ejemplo vacio, se explica el proposito de la clase en la informacion del package.
}
