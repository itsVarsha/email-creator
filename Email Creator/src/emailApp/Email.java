package emailApp;

import java.util.Scanner;
import java.lang.*;

public class Email {
    Scanner scanner = new Scanner(System.in);
    private String firstName, lastName,password,department,email;
    private int mailBoxCapacity=100;
    private int defaultPasswordLength=10;
    private String alternateEmail,companySuffix = "vs.com";

    //constructor to ask for first and last name.

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email Created: "+this.firstName+this.lastName);

        //call a method asking for a department and return a department.
        this.department = setDepartment();

        //call a method to generate random password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is: "+this.password);
        //combine to generate an email.
        email = firstName.toLowerCase() +"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;


    }

    //ask for department

    private String setDepartment(){
        System.out.print("\n1.Sales\n2.Development\n3.Accounting\n0.None\nEnter the Department: ");
        int deptChoice = scanner.nextInt();
        if (deptChoice==1) return "Sales";
        else if (deptChoice==2) return "Development";
        else if(deptChoice==3) return  "Accounting";
        else return "";
    }

    //generate a random password.

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%";
        char[] password = new char[length];
        for (int i = 1;i<length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }


    //set mailbox capacity.

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;

    }
    //set alternate email.

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    //change the password.
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String displayInfo(){
        return "DISPLAY NAME = "+ firstName+" "+lastName+
                "\nCOMPANY EMAIL: "+email+
                "\nMAILBOX CAPACITY: "+mailBoxCapacity;

    }
}
