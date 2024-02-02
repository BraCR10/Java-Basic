package OBC.Interfaces;
//Funcionan para definir unicamente metodos pero no para usarlos, esto sirve si quiere usar en varios
//objetos las mismas cosas, en lugar de poner en cada objeto lo mismo, solo defines una interfaz
public interface FunMotor {
    void acelerar(double km);
    void frenar(double km);
}
