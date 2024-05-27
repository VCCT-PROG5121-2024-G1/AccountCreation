package accountcreation;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskTest {

    public TaskTest() {
    }

    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = new Task();
        int result = instance.getTaskDuration();
        assertTrue(result >= 0); // Assuming task duration is non-negative
    }

    @Test
    public void testGetTaskName() {
        System.out.println("getTaskName");
        Task instance = new Task();
        String result = instance.getTaskName();
        assertNotNull(result); // Assuming task name is not null
    }

    @Test
    public void testGetTaskDescription() {
        System.out.println("getTaskDescription");
        Task instance = new Task();
        String result = instance.getTaskDescription();
        assertNotNull(result); // Assuming task description is not null
    }

    @Test
    public void testGetDeveloperFirstName() {
        System.out.println("getDeveloperFirstName");
        Task instance = new Task();
        String result = instance.getDeveloperFirstName();
        assertNotNull(result); // Assuming developer first name is not null
    }

    @Test
    public void testGetDeveloperLastName() {
        System.out.println("getDeveloperLastName");
        Task instance = new Task();
        String result = instance.getDeveloperLastName();
        assertNotNull(result); // Assuming developer last name is not null
    }

    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task instance = new Task();
        String result = instance.gettaskStatus();
        assertNotNull(result); // Assuming task status is not null
    }

    @Test
    public void testGetTaskDetails() {
        System.out.println("getTaskDetails");
        Task instance = new Task();
        String result = instance.getTaskDetails(1);
        assertNotNull(result); // Assuming task details are not null
    }
}
