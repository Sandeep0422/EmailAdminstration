package bankapplication;

public abstract class Account implements IRate {
    //List of common Properties of Saving and Checking
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;


    // Constructor to set base properties and initialize the account


    //List of common methods

    public Account(String name,String sSn, int initDeposit){
        this.name = name;
        this.sSN = sSn;
        balance = initDeposit;
        System.out.println("NAME: "+name + "sSn: "+sSn +"balance: "+initDeposit);
    }
}
