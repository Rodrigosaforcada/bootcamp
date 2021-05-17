package com.globant.bootcamp.testClasses;

public class Calculator {

    private int ans;

    public Calculator() {
        ans = 0;
    }

    public int sum (int a, int b) {
        ans = a + b;
        return ans;
    }

    public int subtraction (int a, int b) {
        ans = a - b;
        return ans;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("It is not possible to divide by zero.\n");
        }
        ans = a / b;
        return ans;
    }

    public int add (int v) {
        ans += v;
        return ans;
    }

    public int ans() {
        return ans;
    }

    public void clear() {
        ans = 0;
    }

}
