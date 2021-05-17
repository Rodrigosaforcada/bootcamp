package com.globant.bootcamp.buildingsTests;


import com.globant.bootcamp.buildings.HenHouse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HenhouseTest {

    HenHouse henhouse;

    @Before
    public void before() {
        System.out.println("before()");
        henhouse = new HenHouse();
    }

    @After
    public void after() {
        System.out.println("after()");
        henhouse = new HenHouse();
    }

    @Test
    public void Red_eggsTest() {
        System.out.println("Red_eggsTest()");
        int result = henhouse.redEggs(40);
        int expected = 56;
        assertEquals(expected, result);
    }

    @Test
    public void White_eggsTest() {
        System.out.println("White_eggsTest()");
        int result = henhouse.whiteEggs(40);
        int expected = 24;
        assertEquals(expected, result);
    }
}
