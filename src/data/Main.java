package uitvoer;

import data.Person;

public class Main {

    //hier voeren we dingen uit
    static void main(String[] args) {
        //primitive types
        int a = 5;
        char c = 'A';

        //Object types
        String tekst = "tekst";
        String[] lijst = new String[5];

        Person mijneerstePersoon = new Person(); //maakt instance
        System.out.println(mijneerstePersoon);

        Person mijnTweedePersoon = new Person("David", "Van Steertegem");
        System.out.println(mijneerstePersoon.getFirstname());
        System.out.println(mijnTweedePersoon);

    }
}
