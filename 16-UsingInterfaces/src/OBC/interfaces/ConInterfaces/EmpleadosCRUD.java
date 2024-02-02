package OBC.interfaces.ConInterfaces;

import OBC.interfaces.Main.Empleado;

/**
 * En la interfaces nada mas se pueden iniciar metodos y asignar atributos
 * Cualquier clase que implemente la interface esta obligada a usar sus metodos pero no sus atributos
 * Al momento en que hago esto no se para que usar los atributos en una interface
 */

public interface EmpleadosCRUD {

    void save(Empleado empleado);
    void showAll();
    void delete(Empleado empleado);
    public void update(int id, Empleado empleado);
}
