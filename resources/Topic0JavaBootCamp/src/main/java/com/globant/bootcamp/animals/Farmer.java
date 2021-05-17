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

    public static void orderRedEggs(int numberEggs) {
        if (numberEggs == 0 || numberEggs < 0 ) {
            throw new ArithmeticException("It is not possible to calculate with zero or negative numbers.\n");
        }
        double orderInFive = (numberEggs / 5);
        int counting;
        System.out.println("================");
        for (counting = 1; counting <= orderInFive; counting++) {
            System.out.println("(D)(D)(D)(D)(D)");
            if (counting % 6 == 0 ) {
                System.out.println("================");
            }
        }
        if ( numberEggs%5 > 0) {
            int restOfEggs = numberEggs % 5;
            System.out.println("(D)".repeat(restOfEggs) + "(G)".repeat( 5 - restOfEggs));
        }
        if (orderInFive < 6) {
            int counting2;
            for ( counting2 = 1 ; counting2 <= (5 - orderInFive) ; counting2++)
            System.out.println("(G)(G)(G)(G)(G)");
        }
    }

    public static void orderWhiteEggs( int numberEggs) {
        if (numberEggs == 0 || numberEggs < 0 ) {
            throw new ArithmeticException("It is not possible to calculate with zero or negative numbers.\n");
        }
        double orderInFive = (numberEggs / 5);
        int counting;
        System.out.println("================");
        for (counting = 1; counting <= orderInFive; counting++) {
            System.out.println("(O)(O)(O)(O)(O)");
            if (counting % 6 == 0 ) {
                System.out.println("================");
            }
        }
        if ( numberEggs%5 > 0) {
            int restOfEggs = numberEggs % 5;
            System.out.println("(O)".repeat(restOfEggs) + "(G)".repeat( 5 - restOfEggs));
        }
        if (orderInFive < 6) {
            int counting2;
            for ( counting2 = 1 ; counting2 <= (5 - orderInFive) ; counting2++)
                System.out.println("(G)(G)(G)(G)(G)");
        }
    }
}
