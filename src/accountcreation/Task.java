package accountcreation;
/**
 *
 * @author lab_services_student
 */

import javax.swing.JOptionPane;

    // I absolutly hated this as i havnt use JOptionPain it for ever, it was the Bane of my life for a while.
    // It kept breaking my original working one but i finally got it working!!! 

    public class Task 
    {
        public String taskName;
        public String taskDescription;
        public int taskDuration;
        public String developerFirstName;
        public String developerLastName;
        public String taskStatus;
    
        // More colours
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String RESET = "\u001B[0m";

        public Task()  
        {
            this.taskName = getInput("Enter the name of the task:");
        
            do 
            {
                this.taskDescription = getInput("Enter the description of the task (max 50 characters):");
                if (taskDescription.length() > 50) {
                    JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (taskDescription.length() > 50);

            this.taskDuration = Integer.parseInt(getInput("Enter the duration of the task (in hours):"));
            this.developerFirstName = getInput("Enter the first name of the developer:");
            this.developerLastName = getInput("Enter the last name of the developer:");
        
            String[] statusOptions = {"To Do", "In Progress", "Done"};
            this.taskStatus = (String) JOptionPane.showInputDialog(null, "Select the task status", "Task Status",
                JOptionPane.QUESTION_MESSAGE, null, statusOptions, statusOptions[0]);
        }

        private String getInput(String message) 
        {
            return JOptionPane.showInputDialog(message);
        }
    
        // Getting stuff for terminal
        public int getTaskDuration() 
        {
            return taskDuration;
        }
    
        public String getTaskName()
        {
            return taskName;
        }
    
        public String getTaskDescription()
        {
            return taskDescription;
        }
    
        public String getDeveloperFirstName()
        {
            return developerFirstName;
        }
    
        public String getDeveloperLastName()
        {
            return developerLastName;
        }
    
        public String gettaskStatus()
        {
            return taskStatus;
        }

        // display stuff in JOptionsPane
        public void displayTask(int taskNumber) 
        {
            JOptionPane.showMessageDialog(null,
                "Task " + taskNumber + " Details:\n" +
                "Name: " + taskName +
                "\nDescription: " + taskDescription +
                "\nDuration: " + taskDuration + " hours" +
                "\nDeveloper: " + developerFirstName + " " + developerLastName +
                "\nStatus: " + taskStatus,
                "Task " + taskNumber + " Details", JOptionPane.INFORMATION_MESSAGE);
        }

        public String getTaskDetails(int taskNumber) 
        {
            return 
                "Task " + taskNumber + " Details:\n" +
                "Name: " + taskName +
                YELLOW + "\nDescription: " + RESET + taskDescription +
                YELLOW + "\nDuration: " + RESET + taskDuration + " hours" +
                YELLOW + "\nDeveloper: " + RESET + developerFirstName + " " + developerLastName +
                YELLOW + "\nStatus: " + RESET + taskStatus;
        }
    }

//-----------------------------------------------------MAR26ENDOFFILE______________________________