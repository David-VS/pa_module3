package data;

public class Cat {

    //properties, eigenschappen
    private String name;
    private float weight;
    private int registrationnumber;
    private String breed;
    private Person owner;


    //methods
    public Cat() {
        this.name = "Loulou";
        this.weight = 5.63f;
        this.breed = "Calico";
    }

    public Cat(String name, float weight, int registrationnumber, String breed, Person owner) {
        this.name = name;
        this.weight = weight;
        this.registrationnumber = registrationnumber;
        this.breed = breed;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public float getWeight() {
        return weight;
    }

    public Person getOwner() {
        return owner;
    }

    public int getRegistrationnumber() {
        return registrationnumber;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "breed= " + breed +
                ", registrationnumber=" + registrationnumber +
                '}';
    }
}