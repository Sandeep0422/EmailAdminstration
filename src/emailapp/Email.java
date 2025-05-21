package emailapp;

import java.util.Scanner;

public class Email {

    private  String firstname;
    private  String lastname;
    private  String department;
    private  String password;
    private int defaultPasswordLength = 10;
    private String companySuffix = "@ey.gs.com";
    private  String mailBoxCapacity;
    private  String alternateMail;
    // Constructor to receive the first name and last name

    public Email(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("NAME : " +this.firstname +" "+this.lastname);
        this.department = setDepartment();
        System.out.println(" DEPARTMENT : " + this.department);
        this.password = setPassword(defaultPasswordLength);
        System.out.println("PASSWORD: " +this.password);
        System.out.println("EMAIL CREATED : " +this.firstname+"."+this.lastname+"."+department +companySuffix);
    }

    private String setDepartment() {
        System.out.print("Department are : \n 1.Sales \n 2.Development \n 3.Accounting \n Please enter the code for the department : ");
        Scanner scanner = new Scanner(System.in);
        int dept = scanner.nextInt();
        if (dept == 1) {return "Sales";}
        else if(dept == 2) {return "Development";}
        else if (dept==3) {return  "Accounting";}
        else{return "No department";}
    }

    private  String setPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789#$@";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int ran =  (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(ran);
        }
        return new String(password);
    }
    //set mail box capacity

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = mailBoxCapacity;
    }
    // alt mail
    public void  setAlternateMail(String alternateMail){
        this.alternateMail = alternateMail;
    }
    //change password
    public void  setPassword(String password){
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateMail() {
        return alternateMail;
    }
}
