package oefeningen;

public class Auto {
    public int kilometerstand;
    public float brandstoftank;
    //verbruik is hoeveel liter per 100km
    public float verbruik;
    public static int aantalGemaakteAutos;

    public Auto() {
        this.kilometerstand = 0;
        this.brandstoftank = 30;
        this.verbruik = 5;
        Auto.aantalGemaakteAutos++;
    }

    public Auto(int kilometerstand,
                float brandstoftank,
                float verbruik) {
        this.kilometerstand = kilometerstand;
        this.brandstoftank = brandstoftank;
        this.verbruik = verbruik;
        Auto.aantalGemaakteAutos++;
    }
}
