package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testDoFizzBuzz_numberDivisibleBy3_shouldReturnFizz() {
        // Arrange
        int nombre = 9;
        String outputExpected = "Fizz";
        Fizzbuzz fb = new Fizzbuzz();

        // Act
        String result = fb.doFizzBuzz(nombre);

        // Assert
        Assert.assertEquals(outputExpected, result);

    }

    @Test
    public void testDoFizzBuzz_numberDivisibleBy5_shouldReturnBuzz() {
        // Arrange
        int nombre = 25;
        String outputExpected = "Buzz";
        Fizzbuzz fb = new Fizzbuzz();

        // Act
        String result = fb.doFizzBuzz(nombre);

        // Assert
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_numberDivisibleBy3And5_shouldReturnFizzBuzz() {
        // Arrange
        int nombre = 15;
        String outputExpected = "FizzBuzz";
        Fizzbuzz fb = new Fizzbuzz();

        // Act
        String result = fb.doFizzBuzz(nombre);

        // Assert
        Assert.assertEquals(outputExpected, result);
    }

    @Test
    public void testDoFizzBuzz_numberNotDivisibleBy3Or5_shouldReturnTheNumber() {
        // Arrange
        int nombre = 8;
        String outputExpected = "8";
        Fizzbuzz fb = new Fizzbuzz();

        // Act
        String result = fb.doFizzBuzz(nombre);

        // Assert
        Assert.assertEquals(outputExpected, result);
    }

}
