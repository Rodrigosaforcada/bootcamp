package com.globant.bootcamp.buildings;

import com.globant.bootcamp.abstracts.Building;

//The Singleton Pattern will be applied to the Henhouse class to avoid more
//than one instantiation at the same time, following the instructions in topic 1.

public class Henhouse {

    //Block dedicated to controlling that the number of instances
    // of the class is never greater than one unit.
    private static Henhouse hen_house;
    private String value;

    private Henhouse() {

    }

    public static Henhouse getInstance() {

        if(hen_house == null) {
            hen_house = new Henhouse();
        }

        return hen_house;
    }

    public void hen_house(String msg) {
        System.out.println(msg);
    }

    //Method set for demonstration of the only instance.
    public void setValue(String msg) {
        value = msg;
    }

    //Method get for demonstration of the only instance.
    public String getValue() {
        return value;
    }

    //End of block that define the Singleton Pattern.


    public void internal_space() {
        System.out.println("There are space for 50 chickens in the hen house.");
    }

    public static void chickens_inside(int number ) {
        System.out.println("There are " + number + " chickens inside the hen house.");
    }

    public static void Henhouse_production(int hens_in_henhouse) {
        int Eggs = (hens_in_henhouse * 2);
        double Red_eggs = (Eggs * 0.7);
        int red_eggs = (int) Math.round(Red_eggs);
        double White_eggs = (Eggs * 0.3);
        int white_eggs = (int) Math.round(White_eggs);
        System.out.println("\nIn total, the hens produced " + Eggs);
        System.out.println("eggs per day, of which " + red_eggs + " are");
        System.out.println("red and " + white_eggs + " are white.\n");
    }

    public static int Red_eggs(int hens_in_henhouse) {
        int Eggs = (hens_in_henhouse * 2);
        double Red_eggs = (Eggs * 0.7);
        int red_eggs = (int) Math.round(Red_eggs);
        return red_eggs;
    }

    public static int White_eggs(int hens_in_henhouse) {
        int Eggs = (hens_in_henhouse * 2);
        double White_eggs = (Eggs * 0.3);
        int white_eggs = (int) Math.round(White_eggs);
        return white_eggs;
    }
}
