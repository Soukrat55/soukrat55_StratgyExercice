package IGR;

public class IGR_Maroc implements IGR{
    @Override
    public double calucleSalaire(float salaire) {
        double igr=0;
        System.out.println("Maroc");
        if(salaire>40000) igr=0.05;
        else if (salaire>40000 && salaire<120000) igr=0.2;
        else if (salaire>120000) igr=0.42;

        System.out.println("son taux est: "+igr);
        return igr;
    }
}
