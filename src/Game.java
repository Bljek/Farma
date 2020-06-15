import java.util.Random;
import java.util.Scanner;

public class Game {

    // System objects
    static Scanner in = new Scanner(System.in);
    static Random rand = new Random();
    static Boolean welcome = true;
    static int farmArea = 0;
    static int animalSpecies = 0;
    static int plantSpecies = 0;
    static boolean running = true;

    static Plants rzepak = new Plants("Rzepak",330.0,500.0,42.3,8.0,39,45,350.0,750.0, "silos");
    static Plants pszenica = new Plants("Pszenica",440.0,500.0,41.8,4.2,33,49,350.0,1600.0, "silos");
    static Plants buraki = new Plants("Buraki",550.0,470.,92.3,80,14,22,1000.0,125.0,"pole");
    static Plants bobik = new Plants("Bobik",550.0,400.0,42.7,3.5,10,22,350.0,900.0,"silos");
    static Plants jablka = new Plants("Jabłka",0.0,0.0,0.0,0.0,0,0,0.0,0.0,"stodoła");
    static Plants wisnie = new Plants("Wiśnie",0.0,0.0,0.0,0.0,0,0,0.0,0.0,"stodoła");
    static Animals swinie = new Animals("Świnie",0.0);
    static Animals krowy = new Animals("Krowy",0.0);
    static Animals kozy = new Animals("Kozy",0.0);
    static Animals owce = new Animals("Owce",0.0);
    static Animals konie = new Animals("Konie",0.0);
    static Animals kury = new Animals("Kury",0.0);
    static Animals pszczoly = new Animals("Pszczoły",0.0);
    static Animals psy = new Animals("Psy",0.0);
    static Buildings malyChlew = new Buildings("chlew",5960,"Mały", new String[]{"świnie"},15);
    static Buildings sredniChlew = new Buildings("chlew",10560,"Średni", new String[]{"świnie"},30);
    static Buildings duzyChlew = new Buildings("chlew",23800,"Duży",new String []{"świnie"},90);
    static Buildings malaObora = new Buildings("obora",17360,"Mała",new String []{"krowy"},10);
    static Buildings sredniaObora = new Buildings("obora",32850,"Średnia",new String []{"krowy"},20);
    static Buildings duzaObora = new Buildings("obora",87930,"Duża",new String []{"krowy"},60);
    static Buildings malaKoziarnia = new Buildings("koziarnia",43830,"Mała",new String []{"kozy"},20);
    static Buildings sredniaKoziarnia = new Buildings("koziarnia",64630,"Średnia",new String []{"kozy"},40);
    static Buildings duzaKoziarnia = new Buildings("koziarnia",183680,"Duża",new String []{"kozy"},120);
    static Buildings malaOwczarnia = new Buildings("owczarnia",38930,"Mała",new String []{"owce"},20);
    static Buildings sredniaOwczarnia = new Buildings("owczarnia",63670,"Średnia",new String []{"owce"},40);
    static Buildings duzaOwczarnia = new Buildings("owczarnia",183680,"Duża",new String []{"owce"},120);
    static Buildings malaStajnia = new Buildings("stajnia",37380,"Mała",new String []{"konie"},2);
    static Buildings sredniaStajnia = new Buildings("stajnia",67370,"Średnia",new String []{"konie"},4);
    static Buildings duzaStajnia = new Buildings("stajnia",172360,"Duża",new String []{"konie"},12);
    static Buildings malyKurnik = new Buildings("kurnik",2360,"Mały",new String []{"kury"},20);
    static Buildings sredniKurnik = new Buildings("kurnik",4890,"Średni",new String []{"kury"},40);
    static Buildings duzyKurnik = new Buildings("kurnik",15730,"Duży",new String []{"kury"},120);
    static Buildings pasieka = new Buildings ("pasieka",200,"",new String[]{"psczoły"},1);
    static Buildings malyKojec = new Buildings("kojec",4740,"Mały",new String[]{"psy"},10);
    static Buildings sredniKojec = new Buildings("kojec",9820,"Średni",new String[]{"psy"},20);
    static Buildings duzyKojec = new Buildings("kojec",26730,"Duży",new String[]{"psy"},60);
    static Buildings malySilos = new Buildings("silos",3850,"Mały", new String[]{"rzepak","pszenica","bobik"},15);
    static Buildings sredniSilos = new Buildings("silos",7270,"Średni", new String[]{"rzepak", "pszenica","bobik"},30);
    static Buildings duzySilos = new Buildings("silos",17320,"Duży", new String[]{"rzepak","pszenica","bobik"},90);
    static Buildings malaStodola = new Buildings("stodoła",6340,"Mała", new String[]{"jabłka","wiśnie"},25);
    static Buildings sredniaStodola = new Buildings("stodoła",9820,"Średnia", new String[]{"jabłka","wiśnie"},50);
    static Buildings duzaStodola = new Buildings("stodoła",25730,"Duża",new String[]{"jabłka","wiśnie"},150);

    static void menu() {

            if (welcome) {
                System.out.println("#######################################################");
                System.out.println("\t\t\t  Witaj na gospodarstwie!");
                welcome = false;
            }
        int menuOption;
        do {
            System.out.println("#######################################################");
            System.out.println("1. Start gry \n2. Cel gry \n3. Katalog \n4. Wyjście");
            while(!in.hasNextInt())
            {
                in.nextLine();
                System.out.println("Proszę wprowadzić cyfrę");
            }
            menuOption = in.nextInt();
            if (menuOption > 4){
                System.out.println("Proszę wybrać poprawną opcje");
            }else {
                switch (menuOption) {
                    case 1:
                        startGry();
                        break;
                    case 2:
                        System.out.println("#######################################################");
                        System.out.println("\n Twoim celem jest rozbudować Twoje gospodarstwo tak, \naby posiadać 20 ha ziemi, 5 różnych rodzajów zwierząt \n\t  oraz zasianych 5 różnych rodzajów roślin. \n\n\t\t\t\t  Powodzenia!\n");
                        break;
                    case 3:
                        katalog();
                        break;
                }
            }
        }
        while (menuOption != 4);

    }


    public static void main(String[] args) {
        menu();


    }

    static void startGry() {

        // Game variables
        int year = 2020;
        int week = 1;
        int priceForHa = 44000;


        //Player variables
        double Cash = 120000.0;


        //Starting farm variables
        int maxStartingFarmArea = 2;
        String[] startingBuildings = {"brak","mały chlew","mały kurnik","mały silos","mała stodoła"};

        // Farm selection
        System.out.println("\nPosiadasz w tym momencie " + Cash + "zł. Wydaj je mądrze!");
        // Farm #1
        int startingFarmArea1 = rand.nextInt(maxStartingFarmArea) + 1;
        String startingBuilding1 = startingBuildings[rand.nextInt(startingBuildings.length)];
        int buildingModifier1;
        System.out.println("\n#######################################################");
        switch (startingBuilding1) {
            case "mały chlew":
                buildingModifier1 = 5960;
                break;
            case "mały kurnik":
                buildingModifier1 = 2360;
                break;
            case "mały silos":
                buildingModifier1 = 3850;
                break;
            case "mała stodoła":
                buildingModifier1 = 6340;
                break;
            default:
                buildingModifier1 = 0;
                break;
        }
        double startingFarmPrice1 = startingFarmArea1 * priceForHa * (90.0 + rand.nextInt(20)) / 100.0 + buildingModifier1;

        System.out.println("Farma numer 1:");
        System.out.println("\t Powierzchnia: " + startingFarmArea1 + "ha");
        System.out.println("\t Startowy budynek: " + startingBuilding1);
        System.out.println("\t Cena: " + startingFarmPrice1);

        // Farm #2
        int startingFarmArea2 = rand.nextInt(maxStartingFarmArea) + 1;
        String startingBuilding2 = startingBuildings[rand.nextInt(startingBuildings.length)];
        int buildingModifier2;
        System.out.println("#######################################################");
        switch (startingBuilding2) {
            case "mały chlew":
                buildingModifier2 = 5960;
                break;
            case "mały kurnik":
                buildingModifier2 = 2360;
                break;
            case "mały silos":
                buildingModifier2 = 3850;
                break;
            case "mała stodoła":
                buildingModifier2 = 6340;
                break;
            default:
                buildingModifier2 = 0;
                break;
        }
        double startingFarmPrice2 = startingFarmArea2 * priceForHa * (90.0 + rand.nextInt(20)) / 100.0 + buildingModifier2;

        System.out.println("Farma numer 2:");
        System.out.println("\t Powierzchnia: " + startingFarmArea2 + "ha");
        System.out.println("\t Startowy budynek: " + startingBuilding2);
        System.out.println("\t Cena: " + startingFarmPrice2);

        // Farm #3
        int startingFarmArea3 = rand.nextInt(maxStartingFarmArea) + 1;
        String startingBuilding3 = startingBuildings[rand.nextInt(startingBuildings.length)];
        int buildingModifier3;
        System.out.println("#######################################################");
        switch (startingBuilding3) {
            case "mały chlew":
                buildingModifier3 = 5960;
                break;
            case "mały kurnik":
                buildingModifier3 = 2360;
                break;
            case "mały silos":
                buildingModifier3 = 3850;
                break;
            case "mała stodoła":
                buildingModifier3 = 6340;
                break;
            default:
                buildingModifier3 = 0;
                break;
        }
        double startingFarmPrice3 = startingFarmArea3 * priceForHa * (90.0 + rand.nextInt(20)) / 100.0 + buildingModifier3;

        System.out.println("Farma numer 3:");
        System.out.println("\t Powierzchnia: " + startingFarmArea3 + "ha");
        System.out.println("\t Startowy budynek: " + startingBuilding3);
        System.out.println("\t Cena: " + startingFarmPrice3);
        System.out.println("#######################################################");


        boolean choseMenu = true;

        while (choseMenu) {
            String farmSelect = in.nextLine();

            switch (farmSelect) {
                case "1":
                    farmArea = startingFarmArea1;
                    Cash -= startingFarmPrice1;
                    System.out.println("#######################################################");
                    System.out.println("Właśnie kupiłeś farmę numer 1! Wydałeś " + startingFarmPrice1 + "zł na ten cel i zostało Ci " + Cash + "zł na pozostałe wydatki!\n");
                    choseMenu = false;
                    break;
                case "2":
                    farmArea = startingFarmArea2;
                    Cash -= startingFarmPrice2;
                    System.out.println("#######################################################");
                    System.out.println("Właśnie kupiłeś farmę numer 2! Wydałeś " + startingFarmPrice2 + "zł na ten cel i zostało Ci " + Cash + "zł na pozostałe wydatki!\n");
                    choseMenu = false;
                    break;
                case "3":
                    farmArea = startingFarmArea3;
                    Cash -= startingFarmPrice3;
                    System.out.println("#######################################################");
                    System.out.println("Właśnie kupiłeś farmę numer 3! Wydałeś " + startingFarmPrice3 + "zł na ten cel i zostało Ci " + Cash + "zł na pozostałe wydatki!\n");
                    choseMenu = false;
                    break;
                default:
                    System.out.println("Wybierz jedną z farm");
                    break;
            }
            }

            while (running){
                System.out.println("#######################################################");
                System.out.println("Data: " + week + " tydzień, " + year);
                System.out.println("Pieniądze: " + Cash + "zł \nPowierzchnia: " + farmArea + "ha");
                check();
                if(week<53){
                    week++;
                }else {
                    week=1;
                    year++;
                }


        }
        System.out.println("#######################################################");
        System.out.println("\t\t\t\t\tGratulacje! \n\t  Udało Ci się zdobyć razem " + farmArea + "ha ziemi, masz \n\t   zasianych " + plantSpecies + " różnych roślin, a w Twoich \n\tbudynkach jest " + animalSpecies + " różnych rodzajów zwierząt! \n\t\t   Zajęło Ci to " + (year-2020) + " lat i " + week + " tygodni!");
        System.out.println("#######################################################");

    }
    static void katalog() {
            int katalogOption;
        System.out.println("#######################################################");
        System.out.println("\n\t\t\t\t Witamy w katalogu! \n\t   Tutaj znajdziesz wszystkie informacje \n\t   o budynkach, zwierzętach i roślinach!\n\n\t\t    O czym chciałbyś poczytać?\n");
        do {
            System.out.println("#######################################################");
            System.out.println("1. Budynki\n2. Zwierzęta\n3. Rośliny\n4. Powrót do MENU");
            while(!in.hasNextInt())
            {
                in.nextLine();
                System.out.println("Proszę wprowadzić cyfrę");
            }
            katalogOption = in.nextInt();
            if (katalogOption > 4){
                System.out.println("Proszę wybrać poprawną opcje");
            }else {
                switch (katalogOption) {
                    case 1:
                        katalogBudynkow();
                        break;
                    case 2:
                        katalogZwierzat();
                        break;
                    case 3:
                        katalogRoslin();
                        break;
                }
            }
        }
        while (katalogOption != 4);

    }
    static void katalogBudynkow(){
            int buildingOptionMenu;
        System.out.println("#######################################################");
        System.out.println("\n\t\t\t Witamy w katalogu budynków\n Tutaj znajdziesz informacje o wszystkich budynkach,\n\tktóre możesz zbudować na swoim gospodarstwie!\n\n\t\tO którym budynku chcesz poczytać teraz?\n");

        do {
            System.out.println("#######################################################");
            System.out.println("1. Chlew\n2. Obora\n3. Koziarnia\n4. Owczarnia\n5. Stajnia\n6. Kurnik\n7. Pasieka\n8. Kojec\n9. Silos\n10. Stodoła\n11. Powrót");
            while (!in.hasNextInt()) {
                in.nextLine();
                System.out.println("Proszę wprowadzić cyfrę");
            }
            buildingOptionMenu = in.nextInt();
            if (buildingOptionMenu > 11) {
                System.out.println("Proszę wybrać poprawną opcje");
            } else switch (buildingOptionMenu) {
                case 1:
                    System.out.println("#######################################################");
                    System.out.println(malyChlew);
                    System.out.println("#######################################################");
                    System.out.println(sredniChlew);
                    System.out.println("#######################################################");
                    System.out.println(duzyChlew);
                    break;
                case 2:
                    System.out.println("#######################################################");
                    System.out.println(malaObora);
                    System.out.println("#######################################################");
                    System.out.println(sredniaObora);
                    System.out.println("#######################################################");
                    System.out.println(duzaObora);
                    break;
                case 3:
                    System.out.println("#######################################################");
                    System.out.println(malaKoziarnia);
                    System.out.println("#######################################################");
                    System.out.println(sredniaKoziarnia);
                    System.out.println("#######################################################");
                    System.out.println(duzaKoziarnia);
                    break;
                case 4:
                    System.out.println("#######################################################");
                    System.out.println(malaOwczarnia);
                    System.out.println("#######################################################");
                    System.out.println(sredniaOwczarnia);
                    System.out.println("#######################################################");
                    System.out.println(duzaOwczarnia);
                    break;
                case 5:
                    System.out.println("#######################################################");
                    System.out.println(malaStajnia);
                    System.out.println("#######################################################");
                    System.out.println(sredniaStajnia);
                    System.out.println("#######################################################");
                    System.out.println(duzaStajnia);
                    break;
                case 6:
                    System.out.println("#######################################################");
                    System.out.println(malyKurnik);
                    System.out.println("#######################################################");
                    System.out.println(sredniKurnik);
                    System.out.println("#######################################################");
                    System.out.println(duzyKurnik);
                    break;
                case 7:
                    System.out.println("#######################################################");
                    System.out.println(pasieka);
                    break;
                case 8:
                    System.out.println("#######################################################");
                    System.out.println(malyKojec);
                    System.out.println("#######################################################");
                    System.out.println(sredniKojec);
                    System.out.println("#######################################################");
                    System.out.println(duzyKojec);
                    break;
                case 9:
                    System.out.println("#######################################################");
                    System.out.println(malySilos);
                    System.out.println("#######################################################");
                    System.out.println(sredniSilos);
                    System.out.println("#######################################################");
                    System.out.println(duzySilos);
                    break;
                case 10:
                    System.out.println("#######################################################");
                    System.out.println(malaStodola);
                    System.out.println("#######################################################");
                    System.out.println(sredniaStodola);
                    System.out.println("#######################################################");
                    System.out.println(duzaStodola);
                    break;

            }
        }
        while (buildingOptionMenu != 11);
    }
    static void katalogZwierzat(){
        int animalsOptionMenu;
        System.out.println("#######################################################");
        System.out.println("\n\t\t\t Witamy w katalogu zwierząt\n Tutaj znajdziesz informacje o wszystkich zwierzętach,\n\tktóre możesz chodować na swoim gospodarstwie!\n\n\t\tO którym zwierzęciu chcesz poczytać teraz?\n");
        do {
            System.out.println("#######################################################");
            System.out.println("1. Świnie\n2. Krowy\n3. Kozy\n4. Owce\n5. Konie\n6. Kury\n7. Pszczoły\n8. Psy\n9. Powrót do katalogu głównego");
            while (!in.hasNextInt()) {
                in.nextLine();
                System.out.println("Proszę wprowadzić cyfrę");
            }
            animalsOptionMenu = in.nextInt();
            if (animalsOptionMenu > 9) {
                System.out.println("Proszę wybrać poprawną opcje");
            } else switch (animalsOptionMenu) {
                case 1:
                    System.out.println("#######################################################");
                    System.out.println(swinie);
                    break;
                case 2:
                    System.out.println("#######################################################");
                    System.out.println(krowy);
                    break;
                case 3:
                    System.out.println("#######################################################");
                    System.out.println(kozy);
                    break;
                case 4:
                    System.out.println("#######################################################");
                    System.out.println(owce);
                    break;
                case 5:
                    System.out.println("#######################################################");
                    System.out.println(konie);
                    break;
                case 6:
                    System.out.println("#######################################################");
                    System.out.println(kury);
                    break;
                case 7:
                    System.out.println("#######################################################");
                    System.out.println(pszczoly);
                    break;
                case 8:
                    System.out.println("#######################################################");
                    System.out.println(psy);
                    break;
            }
        }
        while (animalsOptionMenu != 9);
    }
    static void katalogRoslin(){
            int plantOptionMenu;
        System.out.println("#######################################################");
        System.out.println("\n\t\t\t Witamy w katalogu roślin\n Tutaj znajdziesz informacje o wszystkich roślinach,\n\tktóre możesz chodować na swoim gospodarstwie!\n\n\t\tO której roślinie chcesz poczytać teraz?\n");
        do {
            System.out.println("#######################################################");
            System.out.println("1. Rzepak\n2. Pszenica\n3. Buraki\n4. Bobik\n5. Jabłka\n6. Wiśnie\n7. Powrót do katalogu głównego");
            while (!in.hasNextInt()) {
                in.nextLine();
                System.out.println("Proszę wprowadzić cyfrę");
            }
            plantOptionMenu = in.nextInt();
            if (plantOptionMenu > 7) {
                System.out.println("Proszę wybrać poprawną opcje");
            } else switch (plantOptionMenu) {
                case 1:
                    System.out.println("#######################################################");
                    System.out.println(rzepak);
                    break;
                case 2:
                    System.out.println("#######################################################");
                    System.out.println(pszenica);
                    break;
                case 3:
                    System.out.println("#######################################################");
                    System.out.println(buraki);
                    break;
                case 4:
                    System.out.println("#######################################################");
                    System.out.println(bobik);
                    break;
                case 5:
                    System.out.println("#######################################################");
                    System.out.println(jablka);
                    break;
                case 6:
                    System.out.println("#######################################################");
                    System.out.println(wisnie);
                    break;
            }
        }
        while (plantOptionMenu != 7);
    }
    static void check(){
        if (farmArea <20){
            running = true;
            farmArea++;
        }
        else if (plantSpecies <5) {
            running = true;
            plantSpecies++;
        }
        else if (animalSpecies <5) {
            running = true;
            animalSpecies++;
        }else running = false;
    }
}
