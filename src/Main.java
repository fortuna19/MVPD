import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

import static java.lang.Runtime.getRuntime;

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
        boolean notExit = true;
        while (notExit) {
            Menu.showChannels();
            Channel.chooseChannel();

            Menu.repeat();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int repeat = Integer.parseInt(reader.readLine());
            switch (repeat) {
                case 1:
                    cls();
                    break;
                default:
                    notExit = false;
                    break;
            }
        }

        //Menu.showChannels(); //Вывод на экран меню для выбора одного из трех каналов

        //Channel.chooseChannel();

        //Menu.enterCode();//Вывод на экран меню для ввода кода

        //enterReg_code();// Ввод кода

        //Menu.showTvProviders(); //Вывод на экран меню для выбора списка из 10 ТВ провайдеров

        //Provider.chooseProvider();

        System.out.println();

        //String newLink = Main.getUrl() + "requestor_id=" + Channel.getRequestor_id() + "&" + "mso_id=" + Provider.getMso_id() + "&" + "domain_name=" + Channel.getDomain_name() + "&" + "reg_code=" + Main.getReg_code() + "&" + "noflash=" + Main.getNoflash() + "&" + "no_iframe=" + Main.getNo_iframe() + "&" + "redirect_url=" + Channel.getRedirect_url();
        //System.out.println(newLink);
        //openInBrowser(newLink);//Открываем линку в дефолтном браузере

        //showLogin();

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
        } else {
            System.out.println();
            System.out.println("Login is:");
            System.out.println(Provider.getLogin());
            System.out.println();
            System.out.println("Password is:");
            System.out.println(Provider.getPassword());
        }
    }

    public static void enterReg_code() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        setReg_code(reader.readLine().toUpperCase());//Приведение кода к верхнему регистру
    }

    //Генерим финальную линку
    public static String resultLink() {
        String newLink = Main.getUrl() + "requestor_id=" + Channel.getRequestor_id() + "&" + "mso_id=" + Provider.getMso_id() + "&" + "domain_name=" + Channel.getDomain_name() + "&" + "reg_code=" + Main.getReg_code() + "&" + "noflash=" + Main.getNoflash() + "&" + "no_iframe=" + Main.getNo_iframe() + "&" + "redirect_url=" + Channel.getRedirect_url();
        return newLink;
    }

    //Метод для очистки окна консоли
    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception E) {
            System.out.println(E);
        }
    }
}


