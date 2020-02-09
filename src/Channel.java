import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Channel {
    static String domain_name;
    static String redirect_url;
    static String requestor_id;

    public static void setDomain_name(String value) {
        domain_name = value;
    }

    public static void setRedirect_url(String value) {
        redirect_url = value;
    }

    public static void setRequestor_id(String value) {
        requestor_id = value;
    }

    public static String getRequestor_id() {
        return requestor_id;
    }

    public static String getDomain_name() {
        return domain_name;
    }

    public static String getRedirect_url() {
        return redirect_url;
    }


    public Channel(String domain_name, String redirect_url, String requestor_id) throws IOException {
        setDomain_name(domain_name);
        setRedirect_url(redirect_url);
        setRequestor_id(requestor_id);
        allMethods();

    }


    public static void chooseChannel() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int channel;

        try {
            channel = Integer.parseInt(reader.readLine());
            boolean notExit = true;
            while (notExit) {
                switch (channel) {
                    case 1:
                        Channel abc = new Channel("abc.com", "https%3A//abc.com/activate-congrats", "ABC");
                        notExit = false;
                        break;
                    case 2:
                        Channel ng = new Channel("ngtvfeqa.com", "https%3A//ngtvfeqa.com/activate-congrats", "dtci");
                        notExit = false;
                        break;
                    case 3:
                        Channel fx = new Channel("fxtvfeqa.com", "https%3A//fxtvfeqa.com/activate-congrats", "dtci");
                        notExit = false;
                        break;
                    default:
                        System.out.println("Choose valid item");
                        channel = Integer.parseInt(reader.readLine());
                        break;
                }
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Entered data should be numeric. Please choose a channel one more time");
            chooseChannel();
            }
    }
    public static void allMethods() throws IOException {
        Menu.enterCode();//Вывод на экран меню для ввода кода
        Main.enterReg_code();// Ввод кода
        Menu.showTvProviders(); //Вывод на экран меню для выбора списка из 10 ТВ провайдеров
        Provider.chooseProvider();
        Main.openInBrowser(Main.resultLink());
        //System.out.println(Main.resultLink());
        Main.showLogin();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
