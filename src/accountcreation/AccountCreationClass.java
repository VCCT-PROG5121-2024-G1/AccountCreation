/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountcreation;
/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;

public class AccountCreationClass 
{
    //colours
    
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    
//Username-------------------------------------------------------------------------------------
    public String CheckUsername(String username)
    {
        boolean usernameCheck = true;
        
        while(usernameCheck){
        //username.contains and username.length is based off a promt to check if the string username is being checked and contains the limitations that apply which would be and _ in this case
        if (username.contains("_") && username.length() <= 5)
        {
            usernameCheck = false;
            System.out.println(GREEN + "Username successfully captured" + RESET);
        } 
        else
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println(RED + "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length." + RESET);
            System.out.print("Enter Username: ");
                username = scanner.nextLine();
        }
    }
        return"";
    }
//Password-------------------------------------------------------------------------------------
    public String CheckPassword(String password)
    {
        boolean passwordCheck = true;
        
        while(passwordCheck){
            
            
            if (password.length() >= 8 &&
                //password.matches is bassed off a prompt to check that the special charackers match the limitations applied for the password
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[@#$%^&+=_-].*"))
            {
                passwordCheck = false;
            System.out.println(GREEN + "Password successfully captured" + RESET) ;

            } 
            else
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println(RED +"Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character." + RESET);
                System.out.print("Enter Password: ");
                password = scanner.nextLine();
            }
         }
        return"";
    }
//First Name-------------------------------------------------------------------------------------
    public String CheckFname(String Fname)
    {
        boolean FnameCheck = true;
        
        while(FnameCheck){
        //this if statmet id bassed off a prompt to make sure that there are letters in the space provided so that it cant be skipped
    if (Fname != null && !Fname.trim().isEmpty())
    {
        FnameCheck = false;
        System.out.println(GREEN + "First Name captured" + RESET);
    } 
    else
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(RED + "Please enter a First Name" + RESET);
        System.out.print("Enter First Name: ");
        Fname = scanner.nextLine();
    }
}
        return"";
    }
//Last Name-------------------------------------------------------------------------------------
public String CheckSname(String Sname)
{
    boolean SnameCheck = true;

    while(SnameCheck){


    if (Sname != null && !Sname.trim().isEmpty())
    {
        SnameCheck = false;
        
        System.out.println(GREEN + "Surname captured" + RESET);
    } 
    else
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(RED + "Please enter a Surname" + RESET);
        System.out.print("Enter Surname: ");
        Sname = scanner.nextLine();
    }
}
return"";
}

//Telling you, that you have completed the registration and now its time to log in--------------------------------------------------------------------------------------

public void RegConfirmation(String username) 
        {
        System.out.println("\n----------------------------------------------");
        System.out.println(YELLOW + "Thank you for registering!" + RESET);
        System.out.println(YELLOW + "Please log in with the following credentials:" + RESET);
        System.out.println(YELLOW + "Username: " + username + RESET);
        }
//Login with password---------------------------------------------------------------

public void Login(String Fname, String password)
    {
    Scanner scanner = new Scanner(System.in);
    boolean loggedIn = false;
    
    while (!loggedIn)  
        {
        System.out.println("Password: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(password)) {
            System.out.println(YELLOW +"Welcome, " + Fname + RESET);
            loggedIn = true;
        }  
        else 
        {
            System.out.println(RED + "Incorrect password. Please try again." + RESET);
        }
        }
    scanner.close();
}

//Prompts-------------------------------------------------------------------------------------
    public void CheckUser()
    {
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
        
        //login stuff
        
        RegConfirmation(username);
        
        Login(username, password);
        
        scanner.close();
        
    }
    
}
//-----------------------------------------------------MAR26ENDOFFILE______________________________