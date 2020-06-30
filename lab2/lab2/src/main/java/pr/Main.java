package pr;


public class Main {
    public static void main(String[] args) {

        String host = "pop.gmail.com";
        String mailStoreType = "pop3";
        String username = "studentfi171";
        String password = "UtmStudentFI171";
        EmailUtil.check(host, mailStoreType, username, password);
        System.out.println("Sending email...");
        EmailUtil.send(username, password, "dexenftp@gmail.com", "Programarea-in-retea", "Email trimis");

    }
}
