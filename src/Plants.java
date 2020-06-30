public class Plants {
    final String name; // nazwa rośliny
    Double seedPrice; // cena zakupu
    Double tillageCost; // cena zasiania
    Double protectionCost; // koszt uprawy
    Double yield; // ilość plonów
    Integer sowingTime; // kiedy zbierać
    Integer timeNeeded; // długość rośnięcia
    Double harvestCost; // koszt zbioru
    Double sellingPrice; // cena skupu
    Boolean readyToHarvest; // czy gotów do zbioru
    Integer whenToHarvest; // kiedy zbierać
    String warehouse; // gdzie trzymać

    public Plants(String name, double seedPrice, double tillageCost, double protectionCost, double yield, int sowingTime, int timeNeeded, double harvestCost, double sellingPrice, String warehouse, Boolean readyToHarvest, Integer whenToHarvest) {
        this.name = name;
        this.seedPrice = seedPrice;
        this.tillageCost = tillageCost;
        this.protectionCost = protectionCost;
        this.yield = yield;
        this.sowingTime = sowingTime;
        this.timeNeeded = timeNeeded;
        this.harvestCost = harvestCost;
        this.sellingPrice = sellingPrice;
        this.warehouse = warehouse;
        this.readyToHarvest = readyToHarvest;
        this.whenToHarvest = whenToHarvest;

    }
    public String toString(){
        return "Nazwa: " + name + "\nCena nasion: " +seedPrice+"zł\nKoszt zasiania: " + tillageCost + "zł\nKoszt uprawy: " + protectionCost + "zł/tydzień\nWydajność plonów: " + yield + "t\nW którym tygodniu siać: " + sowingTime + "\nDługośc wzrostu: " + timeNeeded +" tygodni\nKoszt zebrania: "+harvestCost+"zł\nCena skupu: "+sellingPrice+"zł/t\nMiejsce składowania: "+warehouse;
    }

}
