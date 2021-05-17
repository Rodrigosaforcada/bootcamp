package com.globant.bootcamp.animalsTests;

import com.globant.bootcamp.animals.Farmer;


import com.globant.bootcamp.enums.Gender;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer farmer;

    @Before
    public void before() {
        System.out.println("before()");
        farmer = new Farmer(Gender.MALE);
    }

    @After
    public void after() {
        System.out.println("after()");
        farmer = new Farmer(Gender.MALE);
    }

    @Test(expected = ArithmeticException.class)
    public void Order_White_EggsTest() {
        System.out.println("Order_White_EggsTest()");
        farmer.orderRedEggs(-10);
    }

    @Test(expected = ArithmeticException.class)
    public void Order_Red_EggsTest() {
        System.out.println("Order_Red_EggsTest()");
        farmer.orderWhiteEggs(0);
    }


}
