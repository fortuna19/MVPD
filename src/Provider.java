import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Provider {
    static String mso_id;
    static String login;
    static String password;

    public static String getMso_id() {
        return mso_id;
    }
    public static String getLogin() {
        return login;
    }
    public static String getPassword() {
        return password;
    }

    public static void setMso_id(String value) {
        mso_id = value;
    }
    public static void setLogin(String value) {
        login = value;
    }
    public static void setPassword(String value) {
        password = value;
    }


    public Provider(String mso_id, String login, String password) {
        setMso_id(mso_id);
        setLogin(login);
        setPassword(password);
    }

    public Provider(String mso_id) {
        setMso_id(mso_id);
    }

    public static void chooseProvider() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tvProvider = Integer.parseInt(reader.readLine());
        boolean notExit = true;
        while (notExit) {
            switch (tvProvider) {
                case 1:
                    Provider grande = new Provider("Grande", "tve11prim", "tve11prim"); //1
                    notExit = false;
                    break;
                case 2:
                    Provider spectrum = new Provider("Spectrum", "TestAccGoldtd6@charter.net", "P@ssw0rd"); //2
                    notExit = false;
                    break;
                case 3:
                    Provider cox = new Provider("Cox", "whorley", "reins808"); //3
                    notExit = false;
                    break;
                case 4:
                    Provider cablevision = new Provider("Cablevision", "research1001", "support1001"); //4
                    notExit = false;
                    break;
                case 5:
                    Provider verizon = new Provider("Verizon", "telcouser1", "Emergence"); //5
                    notExit = false;
                    break;
                case 6:
                    Provider dtv = new Provider("DTV", "denm_test5@directv.com", "p@ssword"); //6
                    notExit = false;
                    break;
                case 7:
                    Provider rcn = new Provider("RCN", "dtci_all_pass", "dtci!RCN1"); //7
                    notExit = false;
                    break;
                case 8:
                    Provider hulu = new Provider("Hulu", "huluTVE_linetv@hulu.com", "hulu1234"); //8
                    notExit = false;
                    break;
                case 9:
                    Provider att = new Provider("ATTOTT", "att8970@att.net", "test_572019"); //9
                    notExit = false;
                    break;
                case 10:
                    Provider disney = new Provider("WatchABC"); //10
                    notExit = false;
                    break;
                default:
                    System.out.println("Choose valid item");
                    tvProvider = Integer.parseInt(reader.readLine());
                    break;
            }
        }
    }
}
