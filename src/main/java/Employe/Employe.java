package Employe;
import IGR.IGR;

public class Employe {
    private String cin;
    private float salaireBrutMensuel;
    protected IGR igr;

    public Employe(String cin,float salaireBrutMensuel){
        this.cin=cin;
        this.salaireBrutMensuel=salaireBrutMensuel;
    }

    public double calculerIGR(){
        float salaireBrutAnuel= salaireBrutMensuel*12;
        double taux=this.igr.calucleSalaire(salaireBrutAnuel);

        return salaireBrutAnuel*taux/100;
    }
    public double getSalaireBrutMensuel(){
        double igr=calculerIGR();
        double salaireNetAnuel = salaireBrutMensuel*12-igr;
        return salaireNetAnuel/12;
    }

    public String getCin() {
        return cin;
    }


    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setIGR(IGR igr) {
        this.igr = igr;
    }



}
