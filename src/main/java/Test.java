import Employe.Employe;
import IGR.IGR;
import IGR.IGR_Algery;
import IGR.IGR_Maroc;


public class Test {
    public static void main(String[] args){
        Employe emp=new Employe("FF",6654);
        System.out.println("Employe son cin "+emp.getCin());

        System.out.println("******MAROC********");
        emp.setIGR(new IGR_Maroc());
        System.out.println("son IGR est :"+emp.calculerIGR());
        System.out.println("son salaire brut mensuel est :"+emp.getSalaireBrutMensuel());
        System.out.println("*****ALGERIE*********");
        emp.setIGR(new IGR_Algery());
        System.out.println("son IGR est :"+emp.calculerIGR());
        System.out.println("son salaire brut mensuel est :"+emp.getSalaireBrutMensuel());
        System.out.println("**************");




    }


    }

