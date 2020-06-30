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
    String[] petNames = {"Elsa", "Timon", "Pumba", "Odie", "Nela", "Reksio", "Krecik", "Snoopy", "Lassie", "Balto", "Pankracy", "Piorun", "Dzwonnik", "Pat", "Kibic", "Peppa", "Tarzan", "Simba", "Tramp", "Shang", "Gaston", "Megara", "Milo", "Bambi", "Bernard", "Lilo", "Stich", "Chudy", "Buzz", "Andy", "Rex", "Nemo", "Dory", "Olaf", "Zazu", "Klakier", "Toudie", "Pracuś", "Diego", "Sid", "Bolek", "Lolek", "Yogi", "Doris", "Pluto", "Gucio", "Shrek", "Mat", "Ciastek", "Kojot", "Kermit", "Pigi", "Fred", "Wilma", "Barney", "Eddie", "Loudie", "Plastuś", "Alex", "Tweety", "Roger", "Ważniak", "Pirat", "Arielka", "Śnieżka", "Migotka", "Kopciuszek", "Bella", "Smerf", "Jerry", "Tom", "Herkules", "Bowie", "Salma", "JuliaRoberts", "Pink", "Biber", "JohnWayne", "WoodyAllen", "Justin", "Leonardo", "Clooney", "LadyGaga", "Mendes", "Fergie", "Jay-Z", "SnoopDogg", "ChuckNorris", "Doda", "IceCube", "Fatboy", "Douglas", "Twiggy", "Akon", "Kora", "JohnnyDeep", "SandraBullock", "MarylStreep", "MorganFreeman", "TomHanks", "Hilton", "Ariana", "NicoleKidman", "Newton", "Einstein", "Orange", "Rainbow", "Weekend", "Stone", "Latte", "Coffee", "Sky", "Tuesday", "Note", "Cloud", "Apple", "Hotdog", "Burger", "Shadow", "Monday", "Shy", "Forest", "Pillow", "Doll", "Ball", "Dress", "Lucky", "Shine", "Tomato", "Winter", "Summer", "Spring", "Flower", "Clover", "Mind", "Violet", "Blue", "Green", "Yellow", "Honey", "Sun", "Jelly", "Fair", "Fire", "Amour", "Mall", "Czikita", "Tornado", "Sztanga", "Rewolwer", "Bandzior", "Flądra", "Burza", "Tajfun", "Szeryf", "Fosa", "Szaman", "Oliwka", "Sajgonka", "Bagietka", "Boczek", "Sushi", "Mecenas", "Prawnik", "Tuńczyk", "Budyń", "Parasol", "Spacja", "Fotka", "Akapit", "Mamrot", "Demon", "Bajzel", "Pasztet", "Zamek", "Szkoła", "Taniec", "Tango", "Bukiet", "Bigos", "Laluś", "Torpeda", "Pędziwiatr", "Ostoja", "Miseczka", "Sarenka", "Patyk", "Sfinx", "Pazurek", "Ogonek", "Ciapek", "Łapek", "Krawacik", "Prążek", "Biszkopt", "Wesołek", "Śliniak", "Brutal", "Skoczek", "Szef", "Kierownik", "Łapacz", "Aport", "Konik", "Kleks"};
    static Plants rzepak = new Plants("Rzepak",330.0,500.0,42.3,8.0,39,45,350.0,750.0, "silos", false, 0,0,0);
    static Plants pszenica = new Plants("Pszenica",440.0,500.0,41.8,4.2,33,49,350.0,1600.0, "silos", false, 0,0,0);
    static Plants buraki = new Plants("Buraki",550.0,470.,92.3,80,14,22,1000.0,125.0,"pole", false, 0,0,0);
    static Plants bobik = new Plants("Bobik",550.0,400.0,42.7,3.5,10,22,350.0,900.0,"silos", false, 0,0,0);
    static Plants jablka = new Plants("Jabłka",800.0,720.0,40.3,25,16,326,850.0,1020.0,"stodoła", false, 0,0,0);
    static Plants wisnie = new Plants("Wiśnie",600.0,670.0,23.5,20.0,12,332,700.0,700.0,"stodoła", false, 0,0,0);
    static Animals swinie = new Animals("Świnia","",700.0, "chlew", new String [] {"wieprzowina"}, new String []{"pasza","pszenica","trawa"},23 ,25.0,13.4, 27,3.5,5,false, 16,10,false);
    static Animals krowy = new Animals("Krowa","",1500.0, "obora", new String[] {"wołowina", "krowie mleko"}, new String []{"pasza","pszenica","trawa"},27,70.0,6.7,103,110.0,5,false,40,1,false);
    static Animals kozy = new Animals("Koza","",500.0,"koziarnia",new String[]{"kozina","kozie mleko"}, new String[]{"trawa","owoce","śruta"},34,3.5,5.6,25,15.1,5,false,22,2,false);
    static Animals owce = new Animals("Owca","",450.0,"owczarnia",new String[]{"baranina","owcze mleko","wełna"},new String[]{"nasiona","tarwa","ziemniaki","marchew"},37,3.5,5.4, 27, 15.2, 5, false,21,2,false);
    static Animals konie = new Animals("Koń","",6200.0,"stajnia",new String[]{"jazda konna"}, new String[]{"siano","warzywa","owoce"},67,60.0,11.3,73,55.0,5,false,47,1,false);
    static Animals kury = new Animals("Kura","",30.0,"kurnik",new String[]{"jajka","mięso drobiowe"},new String[]{"pszenica"},20,0.85,0.4,8,10.0,5,false,3,8,false);
    static Animals pszczoly = new Animals("Pszczoła","",400.0,"pasieka",new String[]{"miód"},new String[]{""},0,0.0,0.0,0,0.0,0,false,0,0,false);
    static Animals psy = new Animals("Pies","",2000.0,"kojec",new String[]{"szczeniaki"},new String[]{"karma"},52,4.0,0.5,52,3.0,5,false,9,8,false);
    static Buildings malyChlew = new Buildings("chlew",5960,"Mały", new String[]{"świnie"},15,false,0);
    static Buildings sredniChlew = new Buildings("chlew",10560,"Średni", new String[]{"świnie"},30,false,0);
    static Buildings duzyChlew = new Buildings("chlew",23800,"Duży",new String []{"świnie"},90,false,0);
    static Buildings malaObora = new Buildings("obora",17360,"Mała",new String []{"krowy"},10,false,0);
    static Buildings sredniaObora = new Buildings("obora",32850,"Średnia",new String []{"krowy"},20,false,0);
    static Buildings duzaObora = new Buildings("obora",87930,"Duża",new String []{"krowy"},60,false,0);
    static Buildings malaKoziarnia = new Buildings("koziarnia",43830,"Mała",new String []{"kozy"},20,false,0);
    static Buildings sredniaKoziarnia = new Buildings("koziarnia",64630,"Średnia",new String []{"kozy"},40,false,0);
    static Buildings duzaKoziarnia = new Buildings("koziarnia",183680,"Duża",new String []{"kozy"},120,false,0);
    static Buildings malaOwczarnia = new Buildings("owczarnia",38930,"Mała",new String []{"owce"},20,false,0);
    static Buildings sredniaOwczarnia = new Buildings("owczarnia",63670,"Średnia",new String []{"owce"},40,false,0);
    static Buildings duzaOwczarnia = new Buildings("owczarnia",183680,"Duża",new String []{"owce"},120,false,0);
    static Buildings malaStajnia = new Buildings("stajnia",37380,"Mała",new String []{"konie"},2,false,0);
    static Buildings sredniaStajnia = new Buildings("stajnia",67370,"Średnia",new String []{"konie"},4,false,0);
    static Buildings duzaStajnia = new Buildings("stajnia",172360,"Duża",new String []{"konie"},12,false,0);
    static Buildings malyKurnik = new Buildings("kurnik",2360,"Mały",new String []{"kury"},20,false,0);
    static Buildings sredniKurnik = new Buildings("kurnik",4890,"Średni",new String []{"kury"},40,false,0);
    static Buildings duzyKurnik = new Buildings("kurnik",15730,"Duży",new String []{"kury"},120,false,0);
    static Buildings pasieka = new Buildings ("pasieka",200,"",new String[]{"psczoły"},1,false,0);
    static Buildings malyKojec = new Buildings("kojec",4740,"Mały",new String[]{"psy"},10,false,0);
    static Buildings sredniKojec = new Buildings("kojec",9820,"Średni",new String[]{"psy"},20,false,0);
    static Buildings duzyKojec = new Buildings("kojec",26730,"Duży",new String[]{"psy"},60,false,0);
    static Buildings malySilos = new Buildings("silos",3850,"Mały", new String[]{"rzepak","pszenica","bobik"},15,false,0);
    static Buildings sredniSilos = new Buildings("silos",7270,"Średni", new String[]{"rzepak", "pszenica","bobik"},30,false,0);
    static Buildings duzySilos = new Buildings("silos",17320,"Duży", new String[]{"rzepak","pszenica","bobik"},90,false,0);
    static Buildings malaStodola = new Buildings("stodoła",6340,"Mała", new String[]{"jabłka","wiśnie"},25,false,0);
    static Buildings sredniaStodola = new Buildings("stodoła",9820,"Średnia", new String[]{"jabłka","wiśnie"},50,false,0);
    static Buildings duzaStodola = new Buildings("stodoła",25730,"Duża",new String[]{"jabłka","wiśnie"},150, false, 0);

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
                    switch (startingBuilding1) {
                        case "mały chlew":
                            malyChlew.built = true;
                            malyChlew.buildCount++;
                            break;
                        case "mały kurnik":
                            malyKurnik.built = true;
                            malyKurnik.buildCount++;
                            break;
                        case "mały silos":
                            malySilos.built = true;
                            malySilos.buildCount++;
                            break;
                        case "mała stodoła":
                            malaStodola.built = true;
                            malaStodola.buildCount++;
                            break;
                    }
                    break;
                case "2":
                    farmArea = startingFarmArea2;
                    Cash -= startingFarmPrice2;
                    System.out.println("#######################################################");
                    System.out.println("Właśnie kupiłeś farmę numer 2! Wydałeś " + startingFarmPrice2 + "zł na ten cel i zostało Ci " + Cash + "zł na pozostałe wydatki!\n");
                    choseMenu = false;
                    switch (startingBuilding2) {
                        case "mały chlew":
                            malyChlew.built = true;
                            malyChlew.buildCount++;
                            break;
                        case "mały kurnik":
                            malyKurnik.built = true;
                            malyKurnik.buildCount++;
                            break;
                        case "mały silos":
                            malySilos.built = true;
                            malySilos.buildCount++;
                            break;
                        case "mała stodoła":
                            malaStodola.built = true;
                            malaStodola.buildCount++;
                            break;
                    }
                    break;
                case "3":
                    farmArea = startingFarmArea3;
                    Cash -= startingFarmPrice3;
                    System.out.println("#######################################################");
                    System.out.println("Właśnie kupiłeś farmę numer 3! Wydałeś " + startingFarmPrice3 + "zł na ten cel i zostało Ci " + Cash + "zł na pozostałe wydatki!\n");
                    choseMenu = false;
                    switch (startingBuilding3) {
                        case "mały chlew":
                            malyChlew.built = true;
                            malyChlew.buildCount++;
                            break;
                        case "mały kurnik":
                            malyKurnik.built = true;
                            malyKurnik.buildCount++;
                            break;
                        case "mały silos":
                            malySilos.built = true;
                            malySilos.buildCount++;
                            break;
                        case "mała stodoła":
                            malaStodola.built = true;
                            malaStodola.buildCount++;
                            break;
                    }
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
                // GAME MENU
                int gameMenuChoice;
                double salePrice = 40000 * (90.0 + rand.nextInt(20)) / 100.0;
                double buyPrice = 44000 * (90.0 + rand.nextInt(20)) / 100.0;
                if (buyPrice < salePrice){
                    buyPrice = salePrice + (2000 * (100.0 + rand.nextInt(10)) / 100.0);
                }
                System.out.println("Co chciałbyś zrobić?");
                do {
                    System.out.println("#######################################################");
                    System.out.println("1. Zakup/Sprzedaż ziemi\n2. Zakup budynków\n3. Zakup/Sprzedaż zwierząt\n4. Zakup roślin\n5. Sianie roślin\n6. Zbiory\n7. Stan zapasów\n8. Stan zwierząt\n9. Stan roślin\n0. Pomiń tydzień");
                    while(!in.hasNextInt())
                    {
                        in.nextLine();
                        System.out.println("Proszę wprowadzić cyfrę");
                    }
                    gameMenuChoice = in.nextInt();
                    if (gameMenuChoice > 9 || gameMenuChoice < 1){
                        System.out.println("Proszę wybrać poprawną opcje");
                    }else {
                        switch (gameMenuChoice) {
                            case 1:
                                int fieldSaleMenu;
                                int fieldSaleCounter;
                                int fieldBuyCounter;
                                System.out.println("#######################################################");
                                System.out.println("Witamy w naszym sklepie, gdzie możesz kupić i sprzedać ziemie! \n1 ha ziemi możesz kupić za:"+ buyPrice + "zł, a sprzedać za "+salePrice+"zł");
                                System.out.println("1. Kup ziemie\n2. Sprzedaj ziemie\n3. Powrót");
                                while(!in.hasNextInt())
                                {
                                    in.nextLine();
                                    System.out.println("Proszę wprowadzić cyfrę");
                                }
                                fieldSaleMenu = in.nextInt();
                                if (fieldSaleMenu > 3){
                                    System.out.println("Proszę wybrać poprawną opcje");
                                }else {
                                    switch (fieldSaleMenu){
                                        case 1:
                                        System.out.println("Ile hektarów chcesz kupić?");
                                        while(!in.hasNextInt())
                                        {
                                            in.nextLine();
                                            System.out.println("Proszę wprowadzić cyfrę");
                                        }
                                        fieldBuyCounter = in.nextInt();
                                        if (fieldBuyCounter*buyPrice > Cash)
                                            System.out.println("Nie stać Cię");
                                        else {
                                            Cash = Cash - (fieldBuyCounter * buyPrice);
                                            farmArea = farmArea + fieldBuyCounter;
                                            System.out.println("Właśnie kupiłeś " + fieldBuyCounter + "ha ziemi za " + (fieldBuyCounter * buyPrice) + "zł. Masz teraz " + farmArea + "ha i " + Cash + "zł.");
                                        gameMenuChoice = 0;
                                        }
                                        break;
                                        case 2:
                                            System.out.println("Ile hektarów chcesz sprzedać?");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            fieldSaleCounter = in.nextInt();
                                            if (farmArea < fieldSaleCounter)
                                                System.out.println("Nie masz tyle ziemi");
                                            else {
                                                Cash = Cash + (fieldSaleCounter * salePrice);
                                                farmArea = farmArea - fieldSaleCounter;
                                                System.out.println("Właśnie sprzedałeś " + fieldSaleCounter + "ha ziemi za " + (fieldSaleCounter * salePrice) + "zł. Masz teraz " + farmArea + "ha i " + Cash + "zł.");
                                            gameMenuChoice = 0;
                                            }
                                            break;
                                    }
                                }

                                break;
                            case 2:
                                int buildingSaleMenu;
                                int buildingTypeMenu;
                                System.out.println("#######################################################");
                                System.out.println("Witamy w sklepie Boba Budowniczego, gdzie możesz kupić najróżniejsze budynki!\nJaki budynek chciałbyś kupić?");
                                System.out.println("1. Przejrzyj katalog budynków\n2. Chlew\n3. Obora\n4. Koziarnia\n5. Owczarnia\n6. Stajnia\n7. Kurnik\n8. Pasieka\n9. Kojec\n10. Silos\n11. Stodoła\n12. Powrót");
                                while(!in.hasNextInt())
                                {
                                    in.nextLine();
                                    System.out.println("Proszę wprowadzić cyfrę");
                                }
                                buildingSaleMenu = in.nextInt();
                                if (buildingSaleMenu > 12){
                                    System.out.println("Proszę wybrać poprawną opcje");
                                }else {
                                    switch (buildingSaleMenu){
                                        case 1:
                                            katalogBudynkow();
                                            break;
                                        case 2:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mały chlew\n2. Średni chlew\n3. Duży chlew \n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malyChlew.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malyChlew.price;
                                                            malyChlew.built=true;
                                                            malyChlew.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malyChlew.size+" "+malyChlew.type+" za "+malyChlew.price+"zł. Łączna ilość tego budynku wynosi "+malyChlew.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }
                                                        break;
                                                    case 2:
                                                        if (sredniChlew.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniChlew.price;
                                                            sredniChlew.built=true;
                                                            sredniChlew.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniChlew.size+" "+sredniChlew.type+" za "+sredniChlew.price+"zł. Łączna ilość tego budynku wynosi "+sredniChlew.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzyChlew.price>Cash){
                                                        System.out.println("Nie stać Cię");
                                                    }else {
                                                        Cash = Cash-duzyChlew.price;
                                                        duzyChlew.built=true;
                                                        duzyChlew.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzyChlew.size+" "+duzyChlew.type+" za "+duzyChlew.price+"zł. Łączna ilość tego budynku wynosi "+duzyChlew.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;

                                        case 3:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mała obora\n2. Średnia obora\n3. Duża obora\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malaObora.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malaObora.price;
                                                            malaObora.built=true;
                                                            malaObora.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malaObora.size+" "+ malaObora.type+" za "+malaObora.price+"zł. Łączna ilość tego budynku wynosi "+malaObora.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }
                                                        break;
                                                    case 2:
                                                        if (sredniaObora.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniaObora.price;
                                                            sredniaObora.built=true;
                                                            sredniaObora.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniaObora.size+" "+sredniaObora.type+" za "+sredniaObora.price+"zł. Łączna ilość tego budynku wynosi "+sredniaObora.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzaObora.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzaObora.price;
                                                            duzaObora.built=true;
                                                            duzaObora.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzaObora.size+" "+duzaObora.type+" za "+duzaObora.price+"zł. Łączna ilość tego budynku wynosi "+duzaObora.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mała koziarnia\n2. Średnia koziarnia\n3. Duża koziarnia \n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malaKoziarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malaKoziarnia.price;
                                                            malaKoziarnia.built=true;
                                                            malaKoziarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malaKoziarnia.size+" "+ malaKoziarnia.type+" za "+malaKoziarnia.price+"zł. Łączna ilość tego budynku wynosi "+malaKoziarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniaKoziarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniaKoziarnia.price;
                                                            sredniaKoziarnia.built=true;
                                                            sredniaKoziarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniaKoziarnia.size+" "+sredniaKoziarnia.type+" za "+sredniaKoziarnia.price+"zł. Łączna ilość tego budynku wynosi "+sredniaKoziarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzaKoziarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzaKoziarnia.price;
                                                            duzaKoziarnia.built=true;
                                                            duzaKoziarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzaKoziarnia.size+" "+duzaKoziarnia.type+" za "+duzaKoziarnia.price+"zł. Łączna ilość tego budynku wynosi "+duzaKoziarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 5:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mała owczarnia\n2. Średnia owczarnia\n3. Duża owczarnia\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malaOwczarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malaOwczarnia.price;
                                                            malaOwczarnia.built=true;
                                                            malaOwczarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malaOwczarnia.size+" "+ malaOwczarnia.type+" za "+malaOwczarnia.price+"zł. Łączna ilość tego budynku wynosi "+malaOwczarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniaOwczarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniaOwczarnia.price;
                                                            sredniaOwczarnia.built=true;
                                                            sredniaOwczarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniaOwczarnia.size+" "+sredniaOwczarnia.type+" za "+sredniaOwczarnia.price+"zł. Łączna ilość tego budynku wynosi "+sredniaOwczarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzaOwczarnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzaOwczarnia.price;
                                                            duzaOwczarnia.built=true;
                                                            duzaOwczarnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzaOwczarnia.size+" "+duzaOwczarnia.type+" za "+duzaOwczarnia.price+"zł. Łączna ilość tego budynku wynosi "+duzaOwczarnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 6:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mała stajnia\n2. Średnia stajnia\n3. Duża stajnia\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malaStajnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malaStajnia.price;
                                                            malaStajnia.built=true;
                                                            malaStajnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malaStajnia.size+" "+ malaStajnia.type+" za "+malaStajnia.price+"zł. Łączna ilość tego budynku wynosi "+malaStajnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniaStajnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniaStajnia.price;
                                                            sredniaStajnia.built=true;
                                                            sredniaStajnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniaStajnia.size+" "+sredniaStajnia.type+" za "+sredniaStajnia.price+"zł. Łączna ilość tego budynku wynosi "+sredniaStajnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzaStajnia.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzaStajnia.price;
                                                            duzaStajnia.built=true;
                                                            duzaStajnia.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzaStajnia.size+" "+duzaStajnia.type+" za "+duzaStajnia.price+"zł. Łączna ilość tego budynku wynosi "+duzaStajnia.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 7:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mały kurnik\n2. Średni kurnik\n3. Duży kurnik\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malyKurnik.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malyKurnik.price;
                                                            malyKurnik.built=true;
                                                            malyKurnik.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malyKurnik.size+" "+ malyKurnik.type+" za "+malyKurnik.price+"zł. Łączna ilość tego budynku wynosi "+malyKurnik.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniKurnik.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniKurnik.price;
                                                            sredniKurnik.built=true;
                                                            sredniKurnik.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniKurnik.size+" "+sredniKurnik.type+" za "+sredniKurnik.price+"zł. Łączna ilość tego budynku wynosi "+sredniKurnik.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzyKurnik.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzyKurnik.price;
                                                            duzyKurnik.built=true;
                                                            duzyKurnik.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzyKurnik.size+" "+duzyKurnik.type+" za "+duzyKurnik.price+"zł. Łączna ilość tego budynku wynosi "+duzyKurnik.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 8:

                                            if (pasieka.price>Cash){
                                                System.out.println("Nie stać Cię");
                                            }else {
                                                Cash = Cash-pasieka.price;
                                                pasieka.built=true;
                                                pasieka.buildCount++;
                                                System.out.println("Właśnie kupiłeś "+ pasieka.type+" za "+pasieka.price+"zł. Łączna ilość tego budynku wynosi "+pasieka.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                            }
                                            break;
                                        case 9:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mały kojec\n2. Średni kojec\n3. Duży kojec\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malyKojec.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malyKojec.price;
                                                            malyKojec.built=true;
                                                            malyKojec.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malyKojec.size+" "+ malyKojec.type+" za "+malyKojec.price+"zł. Łączna ilość tego budynku wynosi "+malyKojec.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniKojec.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniKojec.price;
                                                            sredniKojec.built=true;
                                                            sredniKojec.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniKojec.size+" "+sredniKojec.type+" za "+sredniKojec.price+"zł. Łączna ilość tego budynku wynosi "+sredniKojec.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzyKojec.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzyKojec.price;
                                                            duzyKojec.built=true;
                                                            duzyKojec.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzyKojec.size+" "+duzyKojec.type+" za "+duzyKojec.price+"zł. Łączna ilość tego budynku wynosi "+duzyKojec.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 10:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mały silos\n2. Średni silos\n3. Duży silos\n4. Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malySilos.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malySilos.price;
                                                            malySilos.built=true;
                                                            malySilos.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malySilos.size+" "+ malySilos.type+" za "+malySilos.price+"zł. Łączna ilość tego budynku wynosi "+malySilos.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniSilos.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniSilos.price;
                                                            sredniSilos.built=true;
                                                            sredniSilos.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniSilos.size+" "+sredniSilos.type+" za "+sredniSilos.price+"zł. Łączna ilość tego budynku wynosi "+sredniSilos.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzySilos.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzySilos.price;
                                                            duzySilos.built=true;
                                                            duzySilos.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzySilos.size+" "+duzySilos.type+" za "+duzySilos.price+"zł. Łączna ilość tego budynku wynosi "+duzySilos.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                        case 11:
                                            System.out.println("Jaki dokładnie budynek chciałbyś kupić?\n1. Mała stodoła\n2. Średnia stodoła\n3. Duża stodoła\n 4.Powrót");
                                            while(!in.hasNextInt())
                                            {
                                                in.nextLine();
                                                System.out.println("Proszę wprowadzić cyfrę");
                                            }
                                            buildingTypeMenu = in.nextInt();
                                            if (buildingTypeMenu > 3) {
                                                System.out.println("Proszę wybrać poprawną opcje");
                                            }else {
                                                switch (buildingTypeMenu) {
                                                    case 1:
                                                        if (malaStodola.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-malaStodola.price;
                                                            malaStodola.built=true;
                                                            malaStodola.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+malaStodola.size+" "+ malaStodola.type+" za "+malaStodola.price+"zł. Łączna ilość tego budynku wynosi "+malaStodola.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 2:
                                                        if (sredniaStodola.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-sredniaStodola.price;
                                                            sredniaStodola.built=true;
                                                            sredniaStodola.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+sredniaStodola.size+" "+sredniaStodola.type+" za "+sredniaStodola.price+"zł. Łączna ilość tego budynku wynosi "+sredniaStodola.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;
                                                    case 3:
                                                        if (duzaStodola.price>Cash){
                                                            System.out.println("Nie stać Cię");
                                                        }else {
                                                            Cash = Cash-duzaStodola.price;
                                                            duzaStodola.built=true;
                                                            duzaStodola.buildCount++;
                                                            System.out.println("Właśnie kupiłeś "+duzaStodola.size+" "+duzaStodola.type+" za "+duzaStodola.price+"zł. Łączna ilość tego budynku wynosi "+duzaStodola.buildCount+"\nPosiadasz w tym momencie "+Cash);
                                                        }break;


                                                }
                                            }
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Zakup/Sprzedaż zwierząt");
                                break;
                            case 4:
                                System.out.println("Zakup roślin");
                                break;
                            case 5:
                                System.out.println("Sianie roślin");
                                break;
                            case 6:
                                if(rzepak.readyToHarvest || pszenica.readyToHarvest || buraki.readyToHarvest ||bobik.readyToHarvest ||jablka.readyToHarvest || wisnie.readyToHarvest){
                                    System.out.println("Możesz zebrać:");
                                    if (rzepak.readyToHarvest){System.out.println("rzepak");}
                                    if (pszenica.readyToHarvest){System.out.println("pszenicę");}
                                    if (buraki.readyToHarvest){System.out.println("buraki");}
                                    if (bobik.readyToHarvest){System.out.println("bobik");}
                                    if (jablka.readyToHarvest){System.out.println("jabłka");}
                                    if (wisnie.readyToHarvest){System.out.println("wiśnie");}
                                }
                                else {
                                    System.out.println("Chcesz żąć tam, gdzie nie posiałeś, i zbierać tam, gdzieś nie rozsypał");
                                }
                                break;
                            case 7:
                                System.out.println("Stan zapasów");
                                break;
                            case 8:
                                System.out.println("Stan zwierząt");
                                break;
                            case 9:
                                System.out.println("Stan roślin");
                                break;
                        }
                    }
                }
                while (gameMenuChoice != 0);
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
        running = !(farmArea >= 20 & plantSpecies >= 5 & animalSpecies >= 5);
    }
}
