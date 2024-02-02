public class Main {
    public static void main(String[] args) {
    //Try catch se usa para exeptuar errores y que el programa siga trabajando,uns msnera de gestionar errores
       try {
           int operacion = 5/0;
       }catch (Exception e){
           e.printStackTrace();//Esto avisa del fallo si se quita no avisa
           //Aqui se hace lo que se considere necesario
           System.out.println("Se jodio todo");
       }finally {
           System.out.println("Cierre de recursos");/*Finally siempre se ejecuta, se podria usar para ponertodo como estaba*/
       }
        System.out.println("Fin del Operacion");
    }
}