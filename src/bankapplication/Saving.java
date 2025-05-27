package bankapplication;

public class Saving extends  Account {
    int safetyDepositBoxId;
    int safetyDepositBoxKey;
    // List of properties specific to the Saving Account

    //Contructor to intialize setting for the Saving properties
    public Saving(String name,String sSn, int initDeposit){
        super(name,sSn,initDeposit);
        System.out.println("NEW SAVING ACCOUNT CHECKING");
    }

    //List of any methods specific to saving accounts
}
