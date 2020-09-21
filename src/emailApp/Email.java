package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 12;
    private String email;
    private String alternateEmail;
    private String companyWebsite = "myCompany.com";

    //Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
    //class level var above ("this") = local var (argument);
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

    //call a method asking for dept - return dept
        this.department = setDepartment();
        System.out.println("Department entered" + department);

    //call a method that returns a random password
    this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + password);

    //generate email address firstname.lastname@department.company.com
    this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyWebsite;
        System.out.println(email);
    }

    //Ask for the department

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

    // Generate a random password

    private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

    char[] password = new char[length];
    for (int i=0; i<length; i++){
        int random = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(random);
        }
    return new String(password);
    }

    //Set mailbox capacity

    //Set alternate email

    //Change the password

}