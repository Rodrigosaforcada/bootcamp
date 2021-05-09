package com.globant.bootcamp.buildings;

import com.globant.bootcamp.abstracts.Building;

public class Henhouse {

    //public int hens_in_henhouse;

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
