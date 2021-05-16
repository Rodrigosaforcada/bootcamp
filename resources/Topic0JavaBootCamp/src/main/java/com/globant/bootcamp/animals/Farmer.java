package com.globant.bootcamp.animals;

import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.abstracts.Human;

public class Farmer extends Human {

    public Farmer(Gender gender) {
        super(gender);
    }

    @Override
    public void breathe() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void think() {

    }

    @Override
    public void makeSound() { System.out.println("Good morning"); }

    public static void Order_Red_Eggs( int number_eggs) {
        double order_in_5 = (number_eggs / 5);
        int counting;
        System.out.println("================");
        for (counting = 1; counting <= order_in_5; counting++) {
            System.out.println("(D)(D)(D)(D)(D)");
            if (counting % 6 == 0 ) {
                System.out.println("================");
            }
        }
        if ( number_eggs%5 > 0) {
            int rest_of_eggs = number_eggs % 5;
            System.out.println("(D)".repeat(rest_of_eggs) + "(G)".repeat( 5 - rest_of_eggs));
        }
        if (order_in_5 < 6) {
            int counting2;
            for ( counting2 = 1 ; counting2 <= (5 - order_in_5) ; counting2++)
            System.out.println("(G)(G)(G)(G)(G)");
        }
    }

    public static void Order_White_Eggs( int number_eggs) {
        double order_in_5 = (number_eggs / 5);
        int counting;
        System.out.println("================");
        for (counting = 1; counting <= order_in_5; counting++) {
            System.out.println("(O)(O)(O)(O)(O)");
            if (counting % 6 == 0 ) {
                System.out.println("================");
            }
        }
        if ( number_eggs%5 > 0) {
            int rest_of_eggs = number_eggs % 5;
            System.out.println("(O)".repeat(rest_of_eggs) + "(G)".repeat( 5 - rest_of_eggs));
        }
        if (order_in_5 < 6) {
            int counting2;
            for ( counting2 = 1 ; counting2 <= (5 - order_in_5) ; counting2++)
                System.out.println("(G)(G)(G)(G)(G)");
        }
    }
}
