public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jose Armando");
        persona.setEdad(18);
        persona.setTelefono("8705-6234");
        System.out.println("\nEl nombre de la persona es: "+ persona.getNombre());
        System.out.println("\nLa edad es: "+persona.getEdad());
        System.out.println("\nEl telefono es: "+persona.getTelefono());

        Persona persona2 = new Persona();
        persona2.setNombre("Michael Ortega");
        persona2.setEdad(27);
        persona2.setTelefono("8874-6523");
        System.out.println("\nEl nombre de la persona es: "+ persona2.getNombre());
        System.out.println("\nLa edad es: "+persona2.getEdad());
        System.out.println("\nEl telefono es: "+persona2.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return  this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }
}