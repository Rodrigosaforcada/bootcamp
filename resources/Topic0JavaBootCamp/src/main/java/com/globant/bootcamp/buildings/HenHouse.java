package com.globant.bootcamp.buildings;

import com.globant.bootcamp.abstracts.Building;

//The Singleton Pattern will be applied to the HenHouse class to avoid more
//than one instantiation at the same time, following the instructions in topic 1.

public class HenHouse {

//    //Block dedicated to controlling that the number of instances
//    // of the class is never greater than one unit.
//    private static HenHouse henhouse;
//    private String value;
//
//    private HenHouse() {
//
//    }
//
//    public static HenHouse getInstance() {
//
//        if(henhouse == null) {
//            henhouse = new HenHouse();
//        }
//
//        return henhouse;
//    }
//
//    public void henhouse(String msg) {
//        System.out.println(msg);
//    }
//
//    //Method set for demonstration of the only instance.
//    public void setValue(String msg) {
//        value = msg;
//    }
//
//    //Method get for demonstration of the only instance.
//    public String getValue() {
//        return value;
//    }
//
//    //End of block that define the Singleton Pattern.


    public void internalSpace() {
        System.out.println("There are space for 50 chickens in the hen house.");
    }

    public static void chickensInside(int number ) {
        System.out.println("There are " + number + " chickens inside the hen house.");
    }

    public static void HenHouseProduction(int hensInHenHouse) {
        int Eggs = (hensInHenHouse * 2);
        double redeggs = (Eggs * 0.7);
        int redEggs = (int) Math.round(redeggs);
        double whiteeggs = (Eggs * 0.3);
        int whiteEggs = (int) Math.round(whiteeggs);
        System.out.println("\nIn total, the hens produced " + Eggs);
        System.out.println("eggs per day, of which " + redeggs + " are");
        System.out.println("red and " + whiteeggs + " are white.\n");
    }

    public static int redEggs(int hensInHenHouse) {
        int Eggs = (hensInHenHouse * 2);
        double redeggs = (Eggs * 0.7);
        int redEggs = (int) Math.round(redeggs);
        return redEggs;
    }

    public static int whiteEggs(int hensInHenHouse) {
        int Eggs = (hensInHenHouse * 2);
        double whiteeggs = (Eggs * 0.3);
        int whiteEggs = (int) Math.round(whiteeggs);
        return whiteEggs;
    }
}
