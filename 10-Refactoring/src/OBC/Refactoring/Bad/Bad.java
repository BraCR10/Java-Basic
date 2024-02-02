package OBC.Refactoring.Bad;

public class Bad {
    //Variables
    public double salary;//Salario extra
    public int seniority;//Si tiene titulos senior
    public int education;//Si tiene varios titulos de educacion
    public int incidents;//Si a tenido incidentes
    public boolean certificaciones;//Si tiene certificaciones
    //Constructor
    public Bad(double salary, int seniority, int education, int incidents, boolean certificaciones) {
        this.salary = salary;
        this.seniority = seniority;
        this.education = education;
        this.incidents = incidents;
        this.certificaciones = certificaciones;
    }

    //Funciones
   public double calcExtrasSalary(){
       double result = salary;//Resultado del salario extra
       if (seniority>1){result+=50000;}//Verifica si tiene derecho a un extra
       if (education>1){result+=50000;}//Verifica si tiene derecho a un extra
       if (incidents<10){result+=50000;}//Verifica si tiene derecho a un extra
       if (certificaciones){result+=50000;}//Verifica si tiene derecho a un extra
       return result;
   }

    @Override
    public String toString() {
        return "Bad{" +
                "extraSalary=" + salary +
                ", seniority=" + seniority +
                ", education=" + education +
                ", incidents=" + incidents +
                ", certificaciones=" + certificaciones +
                '}';
    }
}
