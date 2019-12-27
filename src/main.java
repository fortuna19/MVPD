import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


public class main {
    public static void main(String[] args) throws IOException {

        String url = "https://sp.auth.adobe.com/api/v1/authenticate?";
        String requestor_id = "";
        String mso_id = "";
        String domain_name = "";
        String reg_code = "";
        String noflash = "true";
        String no_iframe = "true";
        String redirect_url = "";

        String login = "";
        String password = "";


        System.out.println("Please choose a channel:");
        System.out.println("1. ABC");
        System.out.println("2. National Geographic");
        System.out.println("3. FX");


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int channel = Integer.parseInt(reader.readLine());

        if (channel == 1) {
            domain_name = "abc.com";
            redirect_url = "https%3A//abc.com/activate-congrats";
            requestor_id = "ABC";
        }
        if (channel == 2) {
            domain_name = "ngtvfeqa.com";
            redirect_url = "https%3A//ngtvfeqa.com/activate-congrats";
            requestor_id = "dtci";
        }
        if (channel == 3) {
            domain_name = "fxtvfeqa.com";
            redirect_url = "https%3A//fxtvfeqa.com/activate-congrats";
            requestor_id = "dtci";
        }

        System.out.println();
        System.out.println("Enter the code (Register does not matter)");
        reg_code = reader.readLine().toUpperCase();

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

        int tvProvider = Integer.parseInt(reader.readLine());
        if (tvProvider == 1) {
            mso_id = "Grande";
            login = "tve11prim";
            password = "tve11prim";
        }
        if (tvProvider == 2) {
            mso_id = "Spectrum";
            login = "TestAccGoldtd6@charter.net";
            password = "P@ssw0rd";
        }
        if (tvProvider == 3) {
            mso_id = "Cox";
            login = "whorley"; //access to 1 channel
            password = "reins808";
        }
        if (tvProvider == 4) {
            mso_id = "Cablevision";
            login = "research1001";
            password = "support1001";
        }
        if (tvProvider == 5) {
            mso_id = "Verizon";
            login = "telcouser1";
            password = "Emergence";
        }
        if (tvProvider == 6) {
            mso_id = "DTV";
            login = "denm_test5@directv.com";
            password = "p@ssword";
        }
        if (tvProvider == 7) {
            mso_id = "RCN";
            login = "dtci_all_pass";
            password = "dtci!RCN1";
        }
        if (tvProvider == 8) {
            mso_id = "Hulu";
            login = "huluTVE_linetv@hulu.com";
            password = "hulu1234";
        }
        if (tvProvider == 9) {
            mso_id = "ATTOTT";
            login = "att8970@att.net";
            password = "test_572019";
        }
        if (tvProvider == 10) {
            mso_id = "WatchABC";
            login = "";
            password = "";
        }


       /* while (true) {
            int channel = Integer.parseInt(reader.readLine());
            if (channel < 1 || channel > 3) {
                System.out.println("You are mistaken. Select channel from 1 to 3");
            } else {
                break;
            }

        }*/

        System.out.println();
        //System.out.println("Link is:");
        String newLink = url + "requestor_id=" + requestor_id + "&" + "mso_id=" + mso_id + "&" + "domain_name=" + domain_name + "&" + "reg_code=" + reg_code + "&" + "noflash=" + noflash + "&" + "no_iframe=" + no_iframe + "&" + "redirect_url=" + redirect_url;

        java.net.URI uri;
        try {
            uri = new URI(newLink);
            java.awt.Desktop.getDesktop().browse(uri);

        } catch (IOException ex) {
            ex.printStackTrace();
        }  catch (URISyntaxException ex) {
            ex.printStackTrace();
        }



        if(!login.isEmpty()) {
            System.out.println();
            System.out.println("Login is:");
            System.out.println(login);
            System.out.println();
            System.out.println("Password is:");
            System.out.println(password);
        }


    }




}
