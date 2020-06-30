import java.util.Arrays;

public class Buildings {
    String type; // typ budynku
    Integer price; // cena zbudowania
    String size; // powierzchnia budynku
    String [] product; // jakie rośliny można tam przechowywać
    Integer capacity; // ile roślin pomieści
    Boolean built; // czy zbudowany
    Integer buildCount; // ilość budynków

    public Buildings(String type, Integer price, String size, String [] product, Integer capacity, Boolean built, Integer buildCount) {
        this.type = type;
        this.price = price;
        this.size = size;
        this.product = product;
        this.capacity = capacity;
        this.built = built;
        this.buildCount = buildCount;
    }


        @Override
        public String toString() {
           return "Nazwa: " + size + " " + type +
                    "\nCena: " + price +
                    "zł\nCo można trzymać: " + Arrays.toString(product) +
                    "\nIlość przechowywanych zwierząt/roślin: " + capacity;
        }
    }
