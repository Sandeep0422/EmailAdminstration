package bankapplication;

public class BankApplicationApp {
    public static void main(String[] args) {
        Checking checking = new Checking("Sandeep Kumar","45678765",1500);
        Saving saving = new Saving("Ujjwal Kumar","3466424",2000);

        checking.showInfo();
        saving.showInfo();
        //saving.deposit(5000);
        //saving.withdraw(2000);
        //saving.transfer("Brokerage",300);
        saving.compound();
    // Read the csv file and then create a new accounts
    }
}
