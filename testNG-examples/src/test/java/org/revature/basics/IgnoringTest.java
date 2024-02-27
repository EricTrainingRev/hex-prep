package org.revature.basics;

import org.testng.annotations.Test;

public class IgnoringTest {

    @Test(enabled = false)
    public void ignoredTestProgrammatically(){
        System.out.println("If you read this in the terminal something is wrong");
    }

    @Test
    public void ignoredTestViaXML(){

    }

}
