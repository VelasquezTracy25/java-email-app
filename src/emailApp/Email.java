package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500_000;
    private int defaultPasswordLength = 12;
    private String email;
    private String alternateEmail;
    private String companyWebsite = "mycompany.com";

    public Email(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

        this.alternateEmail = setAltEmail();

        this.department = setDepartment();

        this.password = randomPassword(defaultPasswordLength);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companyWebsite;

        showInfo();
    }

    private String setDepartment() {
        System.out.println("Enter the employee's department \n" +
                "DEPARTMENT CODES: \n" +
                "1 for Sale \n" +
                "2 for Development \n" +
                "3 for Account\n" +
                "0 for none");
        int input = new Scanner(System.in).nextInt();
        switch (input) {
            case 1:
                return "sales";
            case 2:
                return "dev";
            case 3:
                return "accounting";
            default:
                return "";
        }
    }

    private String setAltEmail() {
        System.out.println("Enter your personal email: ");
        String personalEm = new Scanner(System.in).nextLine();
        return personalEm;
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void showInfo() {
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName);
        System.out.println("PERSONAL EMAIL: " + alternateEmail);
        System.out.println("COMPANY EMAIL: " + email);
        System.out.println("YOUR PASSWORD: " + password);
        System.out.println("MAILBOX CAPACITY:" + mailboxCapacity + " mb ");
    }

}