package org.revature.basics;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class UnitTests {

    public static int number;

    @BeforeClass
    public void setup(){
        // this triggers before all tests are run
        number = 6;
    }

    @BeforeMethod
    public void intermittentSetup(){
        System.out.println("this is called before each test in this suite");
    }

    @Test
    public void basicUnitTest(){
        assertEquals(number % 2, 0);
    }

    @AfterMethod
    public void intermittentTeardown(){
        System.out.println("this is called after each test in this suite");
    }

    @AfterClass
    public void teardown(){
        number = 0; // you'd typically do something more relevant here
    }
}
