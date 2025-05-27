package bankapplication;

public class Checking extends  Account{
    int debitNumber;
    int debitCardPin;

    public  Checking(String name, String sSn, int initDeposit){
        super(name, sSn,initDeposit);
        System.out.println("New checking account");

    }
}
