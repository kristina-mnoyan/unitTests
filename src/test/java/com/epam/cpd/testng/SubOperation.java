package com.epam.cpd.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubOperation extends BaseTest {

    @Test(dataProvider = "valuesForSubTestWithLongNumbers")
    public void subOperationTestForLongNumbers(long firstNumber, long secondNumber, long expectedResult) {
        long actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(actualResult, expectedResult, "Invalid result of Sub Operation");
    }

    @DataProvider(name = "valuesForSubTestWithLongNumbers")
    public Object[][] valuesForSubTestWithLongNumbers() {
        return new Object[][]{
                {500L, 800L, -300L},
                {-1000L, 3000L, -4000L},
        };
    }

    @Test(dataProvider = "valuesForSubTestWithDoubleNumbers")
    public void subOperationForLongNumbers(double firstNumber, double secondNumber, double expectedResult) {
        double actualResult = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals((double) Math.round(actualResult * 100000d) / 100000d, expectedResult, "Invalid result of Sub Operation");
    }

    @DataProvider(name = "valuesForSubTestWithDoubleNumbers")
    public Object[][] valuesForSubTestWithDoubleNumbers() {
        return new Object[][]{
                {0.5475, 0.18, 0.3675},
                {-10.2658, -6.15, -4.1158},
        };
    }
}
