package oefeningen;

public class Cirkel {

    //datamembers/field -> eigenschappen
    private String kleur = "wit"; //startwaarde of in constructor, of als field
    private double straal = 0;

    //methods -> acties/functies/wat we uitvoeren
    public Cirkel(){
    }

    public Cirkel(String kleur){
        this.kleur = kleur;
    }

    public Cirkel(double straal){
        this.straal = straal;
    }

    public Cirkel(String kleur, double straal){
        this.kleur = kleur;
        this.straal = straal;
    }

    public void setKleur(String kleur){
        this.kleur = kleur;
    }

    public String getKleur(){
        return this.kleur;
    }

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        this.straal = straal;
    }

    public double geefOmtrek(){
        return 2 * Math.PI * this.straal;
    }

    public double geefOppervlakte(){
        return Math.PI * this.straal * this.straal;
    }

    public String toString(){
        return "cirkel met kleur= " + this.kleur + " en straal= " + this.straal;
    }
}