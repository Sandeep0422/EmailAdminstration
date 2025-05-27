package bankapplication;

import java.util.Random;

public abstract class Account implements IRate {
    //List of common Properties of Saving and Checking
    String name;
    String sSN;
    double balance;
    String accountNumber;
    double rate;
    static int index =1000;



    // Constructor to set base properties and initialize the account


    //List of common methods

    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("Deposit: "+amount);
    }
    public  void withdraw(double amount){
        balance = balance-amount;
        System.out.println("Withdrawal: "+balance);
    }
    public void transfer(String toWhere, double amount){
        balance = balance -amount;
        System.out.println("Transferring "+ amount+ "to"+ toWhere);
    }
    public void toPrintBalance(){
        System.out.println("Your balance is now : "+balance);
    }

    public Account(String name,String sSn, int initDeposit){
        this.name = name;
        this.sSN = sSn;
        balance = initDeposit;
       // System.out.println("NAME: "+name +"\n" + "sSn: " +sSn +"\n" +"balance: " + initDeposit);
        index++;
        this.accountNumber = setAccountNumber();
        setBaseRate();

    }

    public void compound(){
        double compoundInterest = balance*(rate/100);
        balance = balance+ compoundInterest;
        System.out.println(compoundInterest);
        toPrintBalance();
    }

    public abstract void setBaseRate();

    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
        int uniqueID = index;
        Random random = new Random();
        int ran3code = 100+ random.nextInt(900);
        return  lastTwoOfSSN + uniqueID +ran3code;

    }

    public void showInfo(){
        System.out.println(
                "Name: " +name+
                        "\nACCOUNT NUMBER: " +accountNumber +
                        "\nBALANCE: " +balance+
                        "\n Rate: " +rate
        );
    }
}
