package accountcreation;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountCreationClassTest {

    public AccountCreationClassTest() {
    }

    @Test
    public void testCheckUsername() {
        System.out.println("CheckUsername");
        String username = "_User"; // Example username meeting the criteria
        AccountCreationClass instance = new AccountCreationClass();
        String expResult = "Username successfully captured";
        String result = instance.CheckUsername(username);
        assertEquals(expResult, result);
    }

    @Test
    public void testPassword() {
        System.out.println("Password");
        String password = "125896@MAtt"; // Example password meeting the criteria
        AccountCreationClass instance = new AccountCreationClass();
        String expResult = "Password successfully captured";
        String result = instance.CheckPassword(password);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckFname() {
        System.out.println("CheckFname");
        String Fname = "John"; // Example valid first name
        AccountCreationClass instance = new AccountCreationClass();
        String expResult = "First Name captured";
        String result = instance.CheckFname(Fname);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckSname() {
        System.out.println("CheckSname");
        String Sname = "Doe"; // Example valid surname
        AccountCreationClass instance = new AccountCreationClass();
        String expResult = "Surname captured";
        String result = instance.CheckSname(Sname);
        assertEquals(expResult, result);
    }
}
