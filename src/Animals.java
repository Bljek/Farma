import java.util.Arrays;

public class Animals {
    String name; // nazwa
    Double price; // cena zakupu
    Double weight; // waga
    Double weightGain; // ile przybiera na wadze
    Integer reproductionAge; // w jakim wieku możę się rozmnażać
    Double foodNeeded; // ilość jedzenia potrzebna na tydzień
    String [] foodName; // nazwa jedzenia, jakie przyjmuje
    Integer reproductionChance; // szansa na rozmnożenie
    Boolean reproductive; // czy może się rozmnażać

    public Animals(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name +
                "\nCena: " + price +
                "\nWaga: " + weight +
                "\nweightGain=" + weightGain +
                "\nreproductionAge=" + reproductionAge +
                "\nfoodNeeded=" + foodNeeded +
                "\nfoodName=" + Arrays.toString(foodName) +
                "\nreproductionChance=" + reproductionChance +
                "\nreproductive=" + reproductive;
    }
}
