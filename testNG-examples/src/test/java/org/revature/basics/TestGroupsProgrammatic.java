package org.revature.basics;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGroupsProgrammatic {

    @Test(groups = {"add"})
    public void additionGroupTest(){
        assertEquals(10+2,12);
    }

    @Test(groups = {"subtract"})
    public void subtractionGroupTest(){
        assertEquals(10-2,8);
    }

}
