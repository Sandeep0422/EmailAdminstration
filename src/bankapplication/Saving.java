package bankapplication;

public class Saving extends  Account {
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    // List of properties specific to the Saving Account

    //Contructor to intialize setting for the Saving properties
    public Saving(String name,String sSn, int initDeposit){
        super(name,sSn,initDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setBaseRate() {
       rate =  getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random()*Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random()* Math.pow(10,4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("ACCOUNT TYPE: SAVING" +
                "\n Safety Deposit Box ID: "+safetyDepositBoxId +
                "\n Safety Deposit Box Key: "+safetyDepositBoxKey);
    }

    //List of any methods specific to saving accounts
}
