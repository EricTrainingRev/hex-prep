package org.revature.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestUsingDataProviders {

    @DataProvider(name = "evenNumbersChecker")
    public static Object[][] evenNumbers(){
        return new Object[][]{{1,false},{2,true},{4,true}};
    }

    @Test(dataProvider = "evenNumbersChecker")
    public void checkIfEven(Integer number, boolean expected){
        assertEquals(expected,number%2==0);
    }

    @Test
    @Parameters({"number", "isOdd"})
    public void checkIfOdd(int number, boolean isOdd){
        assertEquals(isOdd, number%2==1);
    }

}
