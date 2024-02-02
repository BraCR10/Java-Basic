package OBC.ToString;

public class CocheMain {
    public static void main(String[] args) {
        Coche civic = new Coche("Honda","Civic",'1',1485.26,"Azul");
        civic.acelerar(45.32);
        civic.acelerar(258.32);
        System.out.println(civic);
    }
}
