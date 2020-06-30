import java.util.Arrays;

public class Animals {
    String species; //
    String name; // nazwa
    Double price; // cena zakupu
    String place; // gdzie trzymać
    Double weight; // waga
    Double weightGain; // ile przybiera na wadze
    Integer reproductionAge; // w jakim wieku możę się rozmnażać
    Double foodNeeded; // ilość jedzenia potrzebna na tydzień
    String [] foodName; // nazwa jedzenia, jakie przyjmuje
    Integer reproductionChance; // szansa na rozmnożenie
    Integer growthAge; // ile rośnie
    Boolean pregnant; // czy w ciąży
    Integer birthday; // kiedy urodzi
    Integer litter; // ilość miotu

    Boolean reproductive; // czy może się rozmnażać
    String [] benefit; // Co daje

    public Animals(String spiecies, String name, Double price, String place, String [] benefit, String [] foodName, Integer reproductionAge, Double weight, Double weightGain, Integer growthAge, Double foodNeeded, Integer reproductionChance, Boolean pregnant, Integer birthday, Integer litter, Boolean reproductive){
        this.species = spiecies;
        this.name = name;
        this.price = price;
        this.place = place;
        this.benefit = benefit;
        this.foodName = foodName;
        this.reproductionAge = reproductionAge;
        this.weight = weight;
        this.weightGain = weightGain;
        this.foodNeeded = foodNeeded;
        this.reproductionChance = reproductionChance;
        this.growthAge = growthAge;
        this.pregnant = pregnant;
        this.birthday = birthday;
        this.litter = litter;
        this.reproductive = reproductive;
    }

    @Override
    public String toString() {
        return "Nazwa: " + species +
                "\nCena: " + price +
                "\nGdzie trzymać: " + place +
                "\nCo daje: " + Arrays.toString(benefit) +
                "\nCo je: " + Arrays.toString(foodName) +
                "\nJak długo rośnie: " + reproductionAge;
    }
}
