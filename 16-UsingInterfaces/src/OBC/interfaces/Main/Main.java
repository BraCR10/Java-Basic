package OBC.interfaces.Main;
import OBC.interfaces.ConInterfaces.*;
import OBC.interfaces.SinInterfaces.EmpleadosCRUD_Version1;
import OBC.interfaces.SinInterfaces.EmpleadosCRUD_Version2;

/**
 * El objetivo de este ejemplo es ver que sin interfaces, la actualizacion del codigo es mas dificil, tediosa y poco productiva
 * --------------------------------
 * En le primer Main se usa la primera version de EmpleadosCRUD_Version1 cual esta desactualizada y ya no se usa porque ya existe la V2
 * En el segundo Main se usa la version de EmpleadosCRUD_Version2 la cual es la ultima y la mas actializada.
 * --------------------------------
 * Si comparamos un Main con otro, podemos ver el monton de cambios que tenemos que hacer para adaptar un Main a la nueva actualizacion, ya que no usamos interfaces
 */
class MainVersion1 {
    public static void main(String[] args) {
        //Generando empleados
        Empleado jose = new Empleado("Jose","Gutierrez",26,"8888-9999",250000.0);
        Empleado michael = new Empleado("Michael","Gomez",26,"8888-9999",258000.0);
        Empleado johann = new Empleado("Johann","Lopez",26,"8888-9999",250000.0);
        System.out.println("\nEste es con la version1\n");
        //Guardando en la base de datos ficticia
        EmpleadosCRUD_Version1.guardar(jose);
        EmpleadosCRUD_Version1.guardar(michael);
        EmpleadosCRUD_Version1.guardar(johann);

        //Mostrar la base de datos
        EmpleadosCRUD_Version1.mostrarTodo();

    }}
class MainVersion2{
    public static void main(String[] args) {
        //Generando empleados
        Empleado jose = new Empleado("Jose","Gutierrez",26,"8888-9999",250000.0);
        Empleado michael = new Empleado("Michael","Gomez",26,"8888-9999",258000.0);
        Empleado johann = new Empleado("Johann","Lopez",26,"8888-9999",250000.0);
        System.out.println("\nEste es con la version2\n");
        //Guardando en la base de datos ficticia
        EmpleadosCRUD_Version2.save(jose);
        EmpleadosCRUD_Version2.save(michael);
        EmpleadosCRUD_Version2.save(johann);
        //Mostrar la base de datos despues de agregar los 3 empleados
        EmpleadosCRUD_Version2.showAll();
        System.out.println("\n");
        //Elimina un empleado
        EmpleadosCRUD_Version2.delete(jose);
        //Mostrar la base de datos despues de eliminar a Jose
        EmpleadosCRUD_Version2.showAll();
    }
}

/**
 * En este ejemplo si usamos una interface para optimizar las actualizaciones.
 * --------------------------------
 * Para usar una interfaces, la forma correcta es hacer una instancia fuera del main en el cual vamos a usar la interface
 * con la palabara static
 * --------------------------------
 * De esta forma podemos instanciar clases mediante interfaces de manera mas facil
 * --------------------------------
 * Esto se usa para cuando trabajamos con base de datos.
 */
class MainWithInterface{
    /*La instancia de una clase con interface es muy similar a las demas,
    * Prinmero la palabra static para indicar que es propia de esa clase
    * Despues el tipo de dato que seria el nombre de la interface
    * El nombre de la variable,
    * Despues el = mas new mas la clase que vamos a instanciar con ()
    */
    static EmpleadosCRUD empleadosCrudImpl = new EmpleadosCRUDImpl();/*Si cambiamos EmpleadosCRUDImpl por EmpleadosCRUDMySQL o EmpleadosCRUDExcel
    el programa va a ejecutar esa clase sin tener que cambiar nada en el main*/
    public static void main(String[] args) {
        //Generando empleados
        Empleado jose = new Empleado("Jose","Gutierrez",26,"8888-9999",250000.0);
        Empleado michael = new Empleado("Michael","Gomez",26,"8888-9999",258000.0);
        Empleado johann = new Empleado("Johann","Lopez",26,"8888-9999",250000.0);
        System.out.println("\nEste es con interface\n");

        //Guardando en la base de datos ficticia
        empleadosCrudImpl.save(jose);
        empleadosCrudImpl.save(michael);
        empleadosCrudImpl.save(johann);
        //Mostrar la base de datos despues de agregar los 3 empleados
        empleadosCrudImpl.showAll();
        System.out.println("\n");

        //Elimina un empleado
        empleadosCrudImpl.delete(jose);
        //Mostrar la base de datos despues de eliminar a Jose
        empleadosCrudImpl.showAll();
        System.out.println("\n");

        //Actualiza datos
        johann= new Empleado("Johann","Lopez",28,"8888-9999",250000.0);
        empleadosCrudImpl.update(1,johann);
        //Mostrar la base de datos despues de actualizar a Johann
        empleadosCrudImpl.showAll();
    }}

