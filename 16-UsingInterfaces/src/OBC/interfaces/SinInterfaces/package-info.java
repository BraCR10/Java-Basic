package OBC.interfaces.SinInterfaces;
/*
* Este ejemplo funciona sin embargo es poco practico para futuras actualizaciones.
*--------------------------------
* Las clases EmpleadosCRUDExcel y EmpleadosCRUDMySQL son meramente ejemplos de plataformas de donde se pueden exportar datos no tienen nada.
* --------------------------------
* La clase EmpleadosCRUD_Version1 tiene una List la cual simula una base de datos.
* Esta version de EmpleadosCRUD solo cuenta con 2 metodos, guardar nuevos empleados y mostrar toda la lista(Base de datos ficticia).
*--------------------------------
* La clase EmpleadosCRUD_Version2, es una actualizacion de EmpleadosCRUD_Version1.
* Se agrego un nuevo metodo el cual es elminar a un empleado de la base de datos ficticia.
* Ademas los nombres de los metodos se cambiaron a el idioma Ingles.
* --------------------------------
* El error de este ejemplo es que no se usa una interface, esto es un gran problema ya que en el Main principal hay que hacer muchos cambios
* para adaptar a la nueva version.
* --------------------------------
* En la clase Main del package Main se explica mas el problema.
* */