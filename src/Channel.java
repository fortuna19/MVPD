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


    public Channel(String domain_name, String redirect_url, String requestor_id) {
        setDomain_name(domain_name);
        setRedirect_url(redirect_url);
        setRequestor_id(requestor_id);

    }


    public static void chooseChannel(int ch) {
        switch (ch) {
            case 1:
                Channel abc = new Channel("abc.com", "https%3A//abc.com/activate-congrats", "ABC");
                break;
            case 2:
                Channel ng = new Channel("ngtvfeqa.com", "https%3A//ngtvfeqa.com/activate-congrats", "dtci");
                break;
            case 3:
                Channel fx = new Channel("fxtvfeqa.com", "https%3A//fxtvfeqa.com/activate-congrats", "dtci");
                break;
            default:
                System.out.println("Choose valid item");
        }
    }
}
