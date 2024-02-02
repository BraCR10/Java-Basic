package OBC.Refactoring;

import OBC.Refactoring.Bad.Bad;
import OBC.Refactoring.Good.Good;

public class Main {
    public static void main(String[] args) {
        Good ejemploGood = new Good(120000,2,1,1,false);//Debe resivir el extra
        Good ejemploGood2 = new Good(120000,1,1,4,true);//No debe resivir el extra
        Good ejemploGood3 = new Good(120000,1,2,1,true);//Debe resivir el extra
        Bad ejemploBad = new Bad(70000,2,1,1,true);
        Bad ejemploBad2 = new Bad(70000,1,1,1,true);
        Bad ejemploBad3 = new Bad(70000,1,1,1,true);
        ejemploGood.calcExtrasSalary();
        ejemploGood2.calcExtrasSalary();
        ejemploGood3.calcExtrasSalary();
        ejemploBad.calcExtrasSalary();
        ejemploBad2.calcExtrasSalary();
        ejemploBad3.calcExtrasSalary();

        System.out.println(ejemploGood);
        System.out.println(ejemploGood2);
        System.out.println(ejemploGood3);
        System.out.println(ejemploBad);
        System.out.println(ejemploBad2);
        System.out.println(ejemploBad3);
    }
}
