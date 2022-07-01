package org.example;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @DataProvider(name = "squareTwoNumbersProvider")
    Object[][] sumDataProvider() {
        return new Object[][] {
                {2, 4},
                {1, 1},
                {-1, 1},
                {0,0}
        };
    }
    @Test (dataProvider = "squareTwoNumbersProvider")
    public void squareTwoNumbers (int arg1,int expectedSquareTwoNumbers){
        int squareTwoNumbers = App.squareTwoNumbers(arg1);
        System.out.println(squareTwoNumbers);
        assertEquals(squareTwoNumbers,expectedSquareTwoNumbers);

    }    /**
     * Rigorous Test :-)
     */

}
`