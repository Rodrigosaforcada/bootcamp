package com.globant.bootcamp;

import static org.junit.Assert.*;

import com.globant.bootcamp.testClasses.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before() {
        System.out.println("before()");
        calc = new Calculator();
    }

    @After
    public void after() {
        System.out.println("after()");
        calc.clear();
    }

    @Test
    public void testSum() {
        System.out.println("sum()");
        int result = calc.sum(3,2);
        int expected = 5;
        assertEquals(expected, result);
    }

    @Test
    public void testAnsSum() {
        System.out.println("ansSum()");
        calc.sum(3, 2);
        int result = calc.ans();
        int expected = 5;

        assertEquals(expected, result);

    }

    @Test
    public void testDiv() {
        calc.division(5, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivPorCero() {
        calc.division(5, 0);
    }
}
