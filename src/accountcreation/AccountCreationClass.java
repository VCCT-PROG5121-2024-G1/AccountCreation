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
    public void CheckUser() {
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
        
        
        scanner.close();
        System.out.println("User registration completed.");
    
    // Call the ActionClass
    ActionClass actionClass = new ActionClass();
    System.out.println("Starting ActionClass...");
    actionClass.start();

    System.out.println("ActionClass started.");
}
    }


// This class handles the actions related to task management
    class ActionClass {
    // colours
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    // tasks (This was irritating, it broke my whole project)
    private List<Task> tasks = new ArrayList<>();
    
    

    // welcome message
    public void displayWelcomeMessage() {
        JOptionPane.showMessageDialog(null, "<html><font color='blue'>Welcome to EasyKanban!</font></html>");
        System.out.println("Welcome to EasyKanban");
        System.out.println("---------------------");
    }

    // options
    public void displayMenu() {
        System.out.println("Option 1)" + YELLOW + " Add Tasks" + RESET);
        System.out.println("Option 2)" + YELLOW + " Show Report (Coming Soon)" + RESET);
        System.out.println("Option 3)" + YELLOW + " Quit" + RESET);
    }

    // Option 1: Add Tasks (This, omg this, was a pain. adding JOptionPane to just option 1 and getting it to work
    // was too stupid. everything started breaking and not displaying, but I have done it! (With the help of GPT, 
    // and looking at the first nice task with JOptionPane and a lot of swearing and sweat.))
    
    public void option1() {
        JOptionPane.showMessageDialog(null, "Please choose how many Tasks you wish to create:");
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks:"));

        for (int i = 0; i < numTasks; i++) {
            JOptionPane.showMessageDialog(null, "Creating Task " + (i + 1) + ":");

            Task task = new Task();
            tasks.add(task);

            // Display task using JOptionPane with task number
            task.displayTask(i + 1);

            System.out.println("__________________________");
            System.out.println("Task Name: " + Task.YELLOW + task.getTaskName() + Task.RESET);
            System.out.println("__________________________");
            System.out.println("Task Description: " + Task.YELLOW + task.getTaskDescription() + Task.RESET);
            System.out.println("__________________________");
            System.out.println("Task Duration: " + Task.YELLOW + task.getTaskDuration() + Task.RESET);
            System.out.println("__________________________");
            System.out.println("Developer First Name: " + Task.YELLOW + task.getDeveloperFirstName() + Task.RESET);
            System.out.println("__________________________");
            System.out.println("Developer Last Name: " + Task.YELLOW + task.getDeveloperLastName() + Task.RESET);
            System.out.println("__________________________");
            System.out.println("Progress Status: " + Task.YELLOW + task.gettaskStatus() + Task.RESET);
            System.out.println("__________________________");
        }
    }

    // Option 2: This I liked, it was nice and easy
    public void option2() {
        System.out.println("Coming Soon");
    }

    // Option 3: Loved this. ending the program was easy
    public void option3() {
        System.out.println("End Of Programme");
    }

    // Start the program. Was good till I realized I needed to use a case as I didn't do it initially.
    public void start() {
        displayWelcomeMessage();

        int option;
        do {
            displayMenu();
            option = Integer.parseInt(JOptionPane.showInputDialog("Enter your choice (1-3):"));

            switch (option) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please choose again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (option != 3);

        calculateTotalDuration(); // Didint work and wasted like 3 hours
        displayTasks();
    }

    
    // Displaying tasks. Mehh, wasn't too bad ...
    //EDIT: I take it back, this was a bitch, the total duration just didnt want to work no matter hwt i did.
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            task.displayTask(i + 1);
            System.out.println("");
        }
    }

    // time. yeah it took longer than it should have, and it didnt work
    public void calculateTotalDuration() {
        int totalDuration = tasks.stream().mapToInt(Task::getTaskDuration).sum();
        System.out.println(GREEN + "Total Duration: " + totalDuration + " hours" + RESET);
    }
}
//-----------------------------------------------------MAR26ENDOFFILE______________________________