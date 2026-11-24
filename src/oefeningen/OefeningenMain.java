package oefeningen;

public class OefeningenMain {


    static void main(String[] args) {

        Auto a1 = new Auto();
        Auto a2 = new Auto(12465, 40, 5.5f);

        System.out.println(Auto.aantalGemaakteAutos);

        //iets static spreek je aan op de class
        //niet op een instance van een class
        float oppervlakte = 5 * 5 * Calculator.pi;
        System.out.println(oppervlakte);


        //2 tot de 3de = 8
        System.out.println(Calculator.macht(2, 4));
    }
}
