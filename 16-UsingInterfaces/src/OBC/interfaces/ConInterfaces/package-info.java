package OBC.interfaces.ConInterfaces;
/*
 * Este es un ejemplo de como implemetar una interface buena manera
 * --------------------------------
 * Si ocupamos hacer una actualizacion no se necesita hacer una nueva clase como en el ejemplo sin interface,
 * simplemente lo que se tiene que hacer es agregar la actualizacion a la interface para que todas las clases que las implementan
 * se vean obligadas a usarlas, de esta manera hacemos  "algo estandar" que todas las clases deben seguir y de esa manera el main
 * trabajara bien con cualquier clase, solo instanciando la clase como esta en el MainWithInterface.
 * --------------------------------
 * En este caso tanto lo de excel como MySQL no tiene nada importante solo imprimen por pantalla que metodo estan usando,
 * es importante entender que si quisieranos hacer una base de datos en excel o cualquier plataforma, lo tenemos que hacer con
 * interface para que no sea dificil de atualizar el codigo
 * --------------------------------
 *Toda clase que implemente la interface esta obligado a usar sus metodos pero perfectamente podemos no usar el metodo de esa clase,
 * el objetivo de esto es que el Main tenga una "garantia" de que los metodos que llame los tengan todas las clases y no de error al corre
 * el programa.
 * --------------------------------
 * Las clases puede tener muchos mas metodos que los de las interfaces que implemente
 * --------------------------------
 * Una clase puede tener varias interfaces pero es complicado de entender.
 */