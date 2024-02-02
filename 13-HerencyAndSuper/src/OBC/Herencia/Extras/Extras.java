package OBC.Herencia.Extras;

public class Extras {
    //Atributos
     boolean arosLujo;
     boolean quemaCocos;
     boolean alojenos;
     boolean fenosABS;

    //Constructores
    //public Extras() {}

    public Extras(boolean arosLujo, boolean quemaCocos, boolean alojenos, boolean fenosABS) {
        this.arosLujo = arosLujo;
        this.quemaCocos = quemaCocos;
        this.alojenos = alojenos;
        this.fenosABS = fenosABS;
    }

    @Override
    public String toString() {
        return "Extras{" +
                "arosLujo=" + arosLujo +
                ", quemaCocos=" + quemaCocos +
                ", alojenos=" + alojenos +
                ", fenosABS=" + fenosABS +
                '}';
    }
}
