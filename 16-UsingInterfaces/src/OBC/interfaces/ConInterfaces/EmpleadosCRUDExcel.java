package OBC.interfaces.ConInterfaces;

import OBC.interfaces.Main.Empleado;

public class EmpleadosCRUDExcel implements EmpleadosCRUD {
    @Override
    public void save(Empleado empleado) {
        System.out.println("Excel save");
    }

    @Override
    public void showAll() {
        System.out.println("Excel showAll");
    }

    @Override
    public void delete(Empleado empleado) {
        System.out.println("Excel delete");
    }

    @Override
    public void update(int id, Empleado empleado) {
        System.out.println("Excel update");
    }
    //Es un ejemplo vacio, se explica el proposito de la clase en la informacion del package.
}
