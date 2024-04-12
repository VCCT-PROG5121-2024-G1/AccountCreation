/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package accountcreation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class AccountCreationClassTest
{
    
    public AccountCreationClassTest()
    {
    }
    
    /**
     * Test of CheckUsername method, of class AccountCreationClass.
     */
    @Test
public void testCheckUsername() {
    System.out.println("CheckUsername");
    String username = "_User"; // Example username meeting the criteria
    AccountCreationClass instance = new AccountCreationClass();
    String expResult = "Username successfully captured"; // Update expected result
    String result = instance.CheckUsername(username);
    assertEquals(expResult, result);
}


    /**
     * Test of CheckPassword method, of class AccountCreationClass.
     */
    @Test
public void testPassword() {
    System.out.println("Password");
    String password = "#125896MAtt"; // Example password meeting the criteria
    AccountCreationClass instance = new AccountCreationClass();
    String expResult = "Password successfully captured"; // Update expected result
    String result = instance.CheckPassword(password);
    assertEquals(expResult, result);
}


    /**
     * Test of CheckFname method, of class AccountCreationClass.
     */
    @Test
public void testCheckFname() {
    System.out.println("CheckFname");
    String Fname = "John"; // Example valid first name
    AccountCreationClass instance = new AccountCreationClass();
    String expResult = "First Name captured"; // Update expected result
    String result = instance.CheckFname(Fname);
    assertEquals(expResult, result);
}

    /**
     * Test of CheckSname method, of class AccountCreationClass.
     */
    @Test
public void testCheckSname() {
    System.out.println("CheckSname");
    String Sname = "Doe"; // Example valid surname
    AccountCreationClass instance = new AccountCreationClass();
    String expResult = "Surname captured"; // Update expected result
    String result = instance.CheckSname(Sname);
    assertEquals(expResult, result);
}


    /**
     * Test of CheckUser method, of class AccountCreationClass.
     */
    //@Test
    //public void testCheckUser()
   // {
    //    System.out.println("CheckUser");
   //     AccountCreationClass instance = new AccountCreationClass();
   //     instance.CheckUser();
   //     // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
   // }
    
}
