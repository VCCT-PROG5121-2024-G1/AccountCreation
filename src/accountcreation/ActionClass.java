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

public class ActionClass 
{
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";
    
    public void displayWelcomeMessage() 
    {
        System.out.println("Welcome to EasyKanban");
        System.out.println("---------------------");
    }
    
    public void displayMenu() 
    {
        System.out.println(YELLOW + "Option 1) Add Tasks" + RESET);
        System.out.println(YELLOW + "Option 2) Show Report (Coming Soon)" + RESET);
        System.out.println(YELLOW + "Option 3) Quit" + RESET);
    }
    
    public void option1() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose how many Tasks you wish to create:");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); 
        
        for (int i = 0; i < numTasks; i++) {
            System.out.println("Task " + (i + 1) + ":");
            
        }
    }
    
    //option 2------------------------------------------------------------------
    
    public void option2() 
    {
        System.out.println("Coming Soon");
    }
    
    //option 3------------------------------------------------------------------
    
    public void option3() 
    {
        System.out.println("End Of Programme");
    }
    
    public void start() 
    {
        displayWelcomeMessage();
        displayMenu();
        
        //Do while is from a promt from gtp-------------------------------------
        
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter your choice (1-3): ");
            option = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (option) 
            {
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
                    System.out.println("Invalid option. Please choose again.");
            }
        } while (option != 3);
    }
    
    
}
