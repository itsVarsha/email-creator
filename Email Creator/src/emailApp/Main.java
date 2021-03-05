package emailApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first and last name: ");
        Email email = new Email(scanner.next(), scanner.next());
        email.setAlternateEmail("REM@gmad.cm");
        email.changePassword("PASSWORD");
        System.out.println(email.displayInfo());
    }


}
