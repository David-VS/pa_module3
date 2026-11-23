package data;

import oefeningen.Adres;
import oefeningen.Cirkel;

import java.time.LocalDate;

public class Main {

    //hier voeren we dingen uit
    static void main(String[] args) {

        Cirkel mCirkel = new Cirkel("blauw",5);
        System.out.println(mCirkel);
        mCirkel.setKleur("bruin");
        System.out.println(mCirkel);
        System.out.println("oppervlakte: " + mCirkel.geefOppervlakte());

        Adres mijnAdres = new Adres("Nijverheidskaai",
                "170",
                "",
                "Anderlecht",
                1070);

        System.out.println(mijnAdres);

        /*
        //primitive types
        int a = 5;
        char c = 'A';

        //Object types
        String tekst = "tekst";
        String[] lijst = new String[5];

        Person mijneerstePersoon = new Person(); //maakt instance
        System.out.println(mijneerstePersoon);

        Person mijnTweedePersoon = new Person("David", "Van Steertegem");
        System.out.println(mijnTweedePersoon.getFirstname());
        mijnTweedePersoon.setFirstname("Geoff");
        System.out.println(mijnTweedePersoon);

        //type variabele, naam variabele = new conctructor();
        Cat mijnKat = new Cat("Filou",
                5,
                132456,
                "Britisch shorthair",
                mijnTweedePersoon);

        System.out.println(mijnKat);


        Calculator calc = new Calculator(5, 9);
        System.out.println(calc.sum());

        LocalDate d = LocalDate.now();

*/
    }
}