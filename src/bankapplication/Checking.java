package bankapplication;

public class Checking extends  Account{
    int debitNumber;
    int debitCardPin;

    public  Checking(String name, String sSn, int initDeposit){
        super(name, sSn,initDeposit);
        accountNumber="2"+accountNumber;
        setDebitCard();


    }

    @Override
    public void setBaseRate() {
        rate= getBaseRate() * .15;
    }

    private void setDebitCard(){
        debitNumber = (int)(Math.random()*Math.pow(10,12));
        debitCardPin = (int)(Math.random()*Math.pow(10,4));
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: CHECKING"+
        "\n Debit Card Number: "+debitNumber +
        "\n Debit Card Pin Number" + debitCardPin);
    }
}
