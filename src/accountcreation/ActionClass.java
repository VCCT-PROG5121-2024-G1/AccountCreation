/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accountcreation;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ActionClass
{
    // colours
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    // tasks (This was irritating, it broke my whole project)
    private List<Task> tasks = new ArrayList<>();
    
    
    //------------------------------------------------//
    public ActionClass()
    {
        
    }
    
    

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
    public void start() 
    {
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

