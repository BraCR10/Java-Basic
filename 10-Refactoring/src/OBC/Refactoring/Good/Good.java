package OBC.Refactoring.Good;

public class Good {
    //Variables
    public double salary;//Salario extra
    public int seniority;//Si tiene titulos senior
    public int education;//Si tiene varios titulos de educacion
    public int incidents;//Si a tenido incidentes
    public boolean certificaciones;//Si tiene certificaciones
    //Constructores
    public Good(double extraSalary, int seniority, int education, int incidents, boolean certificaciones) {
        this.salary = extraSalary;
        this.seniority = seniority;
        this.education = education;
        this.incidents = incidents;
        this.certificaciones = certificaciones;
    }

    //Funciones o Metodos
   public void calcExtrasSalary(){
       if (!pagoExtras()){salary+=0;}else{
           //Calcula el salario extra
           salary+=50000;//Devuelve el resultado
       }//Verifica sis e debe pagar un salario extra
   }
   //Metodo que mediante boleanos verifica la funcion del salario extra(Refactoring)
    private boolean pagoExtras() {
       boolean academic = seniority>1 || education>1;
       boolean problems = incidents<3;
       boolean certificates = certificaciones;
       return academic && problems || certificates && problems;
    }

    @Override
    public String toString() {
        return "Good{" +
                "extraSalary=" + salary +
                ", seniority=" + seniority +
                ", education=" + education +
                ", incidents=" + incidents +
                ", certificaciones=" + certificaciones +
                '}';
    }

}
