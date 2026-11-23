package oefeningen;

/*
* Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een
*  persoon bijhouden. Een adres bevat minstens de volgende gegevens:

straatnaam
huisnummer (enkel cijfers)
bus
postcode (exact 4 cijfers)
woonplaats
* */

public class Adres {

    private String straatnaam, huisnummer, bus, woonplaats;
    private int postcode;

    public Adres(String straatnaam, String huisnummer, String bus, String woonplaats, int postcode) {
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.bus = bus;
        this.woonplaats = woonplaats;
        if( postcode >= 1000 && postcode <= 9999 ){
            this.postcode = postcode;
        }else{
            System.err.println("Ongeldige postcode");
        }
    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        if( postcode >= 1000 && postcode <= 9999 ){
            this.postcode = postcode;
        }else{
            System.err.println("Ongeldige postcode");
        }

    }

    @Override
    public String toString() {
        return "Adres{" +
                "straatnaam='" + straatnaam + '\'' +
                ", huisnummer='" + huisnummer + '\'' +
                ", bus='" + bus + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", postcode=" + postcode +
                '}';
    }
}
