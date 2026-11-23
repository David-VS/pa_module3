package data;

import java.time.LocalDate;

//nieuw datatype
public class Person {

    //fields -> eigenschappen van een persoon
    //datamember, variabele -> allemaal synoniemen
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;


    //methods
    //constructor -> how to make a person
    //default constructor -> standaardwaarden
    public Person(){
        this.firstname = "John";
        this.lastname = "Doe";
        this.dateOfBirth = LocalDate.now();
    }

    //specific constructor
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = LocalDate.now();
    }

    //we bepalen wat we kunnen aanpassen of opvragen
    //opvragen doen we via een getter (accesor)
    public String getFirstname(){
        return this.firstname;
    }

    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    //aanpassen van een waarde via setter (mutator)
    public void setFirstname(String nieuweNaam){
        this.firstname = nieuweNaam;
    }

    //nuttig voor bv. println() of waarden te controleren
    public String toString(){
        return this.firstname + " " + this.lastname
                + " " + this.dateOfBirth;
    }
}
