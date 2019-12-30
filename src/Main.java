import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    static String noflash = "true";
    static String no_iframe = "true";
    static String reg_code = "";

    public static void setReg_code(String value) {
        reg_code = value;
    }
    public static String getReg_code() {
        return reg_code;
    }
    public static String getUrl() {
        String url = "https://sp.auth.adobe.com/api/v1/authenticate?";
        return url;
    }

    public static String getNoflash() {
        return noflash;
    }
    public static String getNo_iframe() {
        return no_iframe;
    }

    ////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) throws IOException {

        Menu.showChannels(); //Вывод на экран меню для выбора одного из трех каналов

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int channel = Integer.parseInt(s);

        Channel.chooseChannel(channel);

        Menu.enterCode();//Вывод на экран меню для ввода кода

        reg_code = reader.readLine().toUpperCase();//Приведение кода к верхнему регистру
        Main.setReg_code(reg_code);

        Menu.showTvProviders(); //Вывод на экран меню для выбора списка из 10 ТВ провайдеров

        int tvProvider = Integer.parseInt(reader.readLine());
        Provider.chooseProvider(tvProvider);

        System.out.println();

        //String newLink = url + "requestor_id=" + requestor_id + "&" + "mso_id=" + mso_id + "&" + "domain_name=" + domain_name + "&" + "reg_code=" + reg_code + "&" + "noflash=" + noflash + "&" + "no_iframe=" + no_iframe + "&" + "redirect_url=" + redirect_url;

        /*OOP*/
        String newLink = Main.getUrl() + "requestor_id=" + Channel.getRequestor_id() + "&" + "mso_id=" + Provider.getMso_id() + "&" + "domain_name=" + Channel.getDomain_name() + "&" + "reg_code=" + Main.getReg_code() + "&" + "noflash=" + Main.getNoflash() + "&" + "no_iframe=" + Main.getNo_iframe() + "&" + "redirect_url=" + Channel.getRedirect_url();
        System.out.println(newLink);
        //openInBrowser(newLink);//Открываем линку в дефолтном браузере

        showLogin();

    }

    public static void openInBrowser(String link) {
        java.net.URI uri;
        try {
            uri = new URI(link);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }

    public static void showLogin() {
        if (Provider.getLogin() == null) {
            System.out.println("Login and password are not set for chosen TV provider");
        }
        else {
            System.out.println();
            System.out.println("Login is:");
            System.out.println(Provider.getLogin());
            System.out.println();
            System.out.println("Password is:");
            System.out.println(Provider.getPassword());
        }
    }
}


