package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Sandeep","Kumar");
        email.setAlternateMail("Sandeep@gmail.com");
        System.out.println("ALTERNATE EMAIL: " + email.getAlternateMail());
    }
}
