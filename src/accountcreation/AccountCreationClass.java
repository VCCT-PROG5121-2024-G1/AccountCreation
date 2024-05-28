/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountcreation;

/**
 *
 * @author lab_services_student
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

// This class handles user account creation functionalities
public class AccountCreationClass {
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";

    private String capturedUsername;
    private String capturedPassword;
    private String capturedFname;
    private String capturedSname;

    // Check if the entered username meets the criteria
    public String CheckUsername(String username) {
        boolean usernameCheck = true;

        while (usernameCheck) {
            if (username.contains("_") && username.length() <= 5) {
                usernameCheck = false;
                capturedUsername = username;
                System.out.println(GREEN + "Username successfully captured" + RESET);
                return "Username successfully captured";
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println(RED + "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length." + RESET);
                System.out.print("Enter Username: ");
                username = scanner.nextLine();
            }
        }
        return "";
    }

    // Check if the entered password meets the criteria
    public String CheckPassword(String password) {
        boolean passwordCheck = true;

        while (passwordCheck) {
            if (password.length() >= 8 &&
                    password.matches(".*[A-Z].*") &&
                    password.matches(".*[0-9].*") &&
                    password.matches(".*[@#$%^&+=_-].*")) {
                passwordCheck = false;
                capturedPassword = password;
                System.out.println(GREEN + "Password successfully captured" + RESET);
                return "Password successfully captured";
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println(RED + "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character." + RESET);
                System.out.print("Enter Password: ");
                password = scanner.nextLine();
            }
        }
        return "";
    }

    // Check if the entered first name is provided
    public String CheckFname(String Fname) {
        boolean FnameCheck = true;

        while (FnameCheck) {
            if (Fname != null && !Fname.trim().isEmpty()) {
                FnameCheck = false;
                capturedFname = Fname;
                System.out.println(GREEN + "First Name captured" + RESET);
                return "First Name captured";
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println(RED + "Please enter a First Name" + RESET);
                System.out.print("Enter First Name: ");
                Fname = scanner.nextLine();
            }
        }
        return "";
    }

    // Check if the entered surname is provided
    public String CheckSname(String Sname) {
        boolean SnameCheck = true;

        while (SnameCheck) {
            if (Sname != null && !Sname.trim().isEmpty()) {
                SnameCheck = false;
                capturedSname = Sname;
                System.out.println(GREEN + "Surname captured" + RESET);
                return "Surname captured";
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println(RED + "Please enter a Surname" + RESET);
                System.out.print("Enter Surname: ");
                Sname = scanner.nextLine();
            }
        }
        return "";
    }

    // Display registration confirmation message
    public void RegConfirmation(String username) {
        System.out.println("\n----------------------------------------------");
        System.out.println(YELLOW + "Thank you for registering!" + RESET);
        System.out.println(YELLOW + "Please log in with the following credentials:" + RESET);
        System.out.println(YELLOW + "Username: " + username + RESET);
    }

    // Handle user login
    public void Login(String Fname, String password) {
        Scanner scanner = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println(YELLOW + "Welcome, " + Fname + RESET);
                loggedIn = true;
            } else {
                System.out.println(RED + "Incorrect password. Please try again." + RESET);
            }
        }
        scanner.close();
    }

    // Check user inputs for account creation
    public void CheckUser() 
    {
//        try (Scanner scanner = new Scanner(System.in))
//        {
//            System.out.print("Enter Username: ");
//            String username = scanner.nextLine();
//            CheckUsername(username);
//            
//            System.out.print("Enter Password: ");
//            String password = scanner.nextLine();
//            CheckPassword(password);
//            
//            System.out.print("Enter First Name: ");
//            String Fname = scanner.nextLine();
//            CheckFname(Fname);
//            
//            System.out.print("Enter Surname: ");
//            String Sname = scanner.nextLine();
//            CheckSname(Sname);
//            
//            RegConfirmation(username);
//            
//            // Login with captured details
//            Login(capturedFname, capturedPassword);
//        }

        //System.out.println("User registration completed.");
        
         Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();
            CheckUsername(username);
            
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            CheckPassword(password);
            
            System.out.print("Enter First Name: ");
            String Fname = scanner.nextLine();
            CheckFname(Fname);
            
            System.out.print("Enter Surname: ");
            String Sname = scanner.nextLine();
            CheckSname(Sname);
            
            RegConfirmation(username);
            
            // Login with captured details
            Login(capturedFname, capturedPassword);
        

        System.out.println("User registration completed.");

    }
}
//-----------------------------------------------------MAR26ENDOFFILE______________________________