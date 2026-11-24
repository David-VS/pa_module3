package oefeningen;

public class Calculator {

    public final static float pi = 3.1415f;

    public static int macht(int grondtal, int exponent){
        int resultaat = grondtal;
        for(int i = 1; i < exponent; i++){
            resultaat *= grondtal;
        }
        return resultaat;
    }
}
