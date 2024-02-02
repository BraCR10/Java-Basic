package OBC.Map;
import java.util.Map;
import java.util.HashMap;
//Los mapas guardan datos con una clave
public class MapMain {
    public static void main(String[] args) {
        //Ejemplo 1
        Map<String, String> personas = new HashMap<>();/*Forma de crear un mapa, primero el
    comando Map<tipo dato,tipo dato>,identificador,=,new, HashMap<>();*/
        personas.put("key1", "Jose Hernadez");
        personas.put("key2", "Mauricio Alvarez");
        System.out.println("\n"+personas);

        //Solo imprime las claves
        for (String key : personas.keySet()) System.out.println("\n"+key);

        //Solo imprime los valores
        for (String values : personas.values()) System.out.println("\n"+values);

        //Solo imprime una clave con su valor
        for (Map.Entry<String,String> pair:personas.entrySet()) System.out.println("\n"+pair.getKey() + " " + pair.getValue());

        //Ejemplo 2
        Map<String,Coche> garaje = new HashMap<>();
        garaje.put("LS15", new Coche("Lamborgini","Aventador",'5',1852.95d,"Azul","Gasolina"));
        garaje.put("LS16", new Coche("Honda","Acura",'7',1252.95d,"Verde","Gasolina"));
        System.out.println("\n"+garaje);
    }
}
