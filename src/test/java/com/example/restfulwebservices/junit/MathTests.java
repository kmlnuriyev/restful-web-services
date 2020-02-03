package com.example.restfulwebservices.junit;

import com.example.restfulwebservices.junitex.Math;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MathTests {

    Math math;

    @BeforeMethod
    public void setUp() {
        math = new Math();
    }

    @Test
    public void multiply_twoMultiplyTwo_returnsFour() {

        //Arrange
        final int expected = 0;

        //Act
        final int actual = math.multiply(2, 0);

        //Assert
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void divide_twoNumbers() {

        final double expected = 2;

        final double actual = math.divide(10, 5);

        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divide_toZero_throwsIllegalArgumentException() {

        math.divide(10, 0);
    }

    @AfterMethod
    public void tearDown() {
        math = null;
    }
}
