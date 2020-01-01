public class Menu {
    public static void showEnvironment(){
        System.out.println("1. QA");
        System.out.println("2. Prod");
    }

    public static void showChannels() {
        System.out.println("Please choose a channel:");
        System.out.println("*******************MVPD***********************");
        System.out.println("1. ABC");
        System.out.println("2. National Geographic");
        System.out.println("3. FX");
        System.out.println("******************OneID***********************");
        System.out.println("4. ABC QA Env.");
        System.out.println("5. NG  QA Env.");
        System.out.println("6. FX  QA Env.");
        System.out.println("7. ABC Prod Env.");
        System.out.println("8. NG  Prod Env.");
        System.out.println("9. FX  Prod Env.");

    }

    public static void enterCode() {
        System.out.println();
        System.out.println("Enter the code (Register does not matter)");
    }

    public static void showTvProviders() {
        System.out.println();
        System.out.println("Please choose a TV provider:");
        System.out.println("1. Grande");
        System.out.println("2. Spectrum");
        System.out.println("3. Cox");
        System.out.println("4. Optimum");
        System.out.println("5. Verizon");
        System.out.println("6. Direct TV");
        System.out.println("7. RCN");
        System.out.println("8. Hulu");
        System.out.println("9. AT&T (temporarily is not working)");
        System.out.println("10. The Walt Disney Company");
    }
}
