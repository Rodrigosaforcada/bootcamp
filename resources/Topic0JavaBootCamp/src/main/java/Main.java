import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.animals.Cat;
import com.globant.bootcamp.animals.Dog;
import com.globant.bootcamp.animals.Duck;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Farmer;
import com.globant.bootcamp.buildings.HenHouse;
import com.globant.bootcamp.testClasses.Calculator;
import com.globant.bootcamp.testClasses.Client;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        Chicken gallina = new Chicken(Gender.FEMALE);
        gallina.makeSound();

        Duck pato = new Duck(Gender.MALE);

        Dog doggo = new Dog(Gender.MALE);

        Cat cat = new Cat(Gender.FEMALE);

        Farmer farmer = new Farmer(Gender.MALE);

        animals[0] = gallina;
        animals[1] = pato;
        animals[2] = doggo;
        animals[3] = cat;
        animals[4] = farmer;

        Main.singAnimals(animals);

        System.out.println("Topic 0");

        int hens_in_HenHouse;

        hens_in_HenHouse = 40;

        HenHouse.chickensInside(hens_in_HenHouse);
        HenHouse.HenHouseProduction(hens_in_HenHouse);

        Farmer.orderWhiteEggs(HenHouse.whiteEggs(hens_in_HenHouse));
        Farmer.orderRedEggs(HenHouse.redEggs(hens_in_HenHouse));

        System.out.println("\nAnd this is the result after the farmer");
        System.out.println("has sorted them by color in 6 x 5 egg's cartons.\n");

        System.out.println("Topic 1");
        //Singleton Patron demonstration
//        HenHouse HenHouse_1 = HenHouse.getInstance();
//        HenHouse HenHouse_2 = HenHouse.getInstance();
//
//
//
//        HenHouse_1.setValue("Demonstration of the Singleton Patron with the HenHouse class.\n");
//        System.out.println(HenHouse_2.getValue());
        //The second variable returns the same value that was assigned to the
        //first variable because both are referred to the same instance.

        System.out.println("Topic 2");
        System.out.println("The error messages thrown based on their severity are ");
        System.out.println("displayed, configured from the files related to log4j.\n");

        Client.main();

        System.out.println("\nTopic 3");

        System.out.println("\nTo learn and practice, a class called \"Calculator\" was");
        System.out.println("used in order to simultaneously use all the Unit Testing cases with JUnit.");

        System.out.println("\nTests were also applied on the methods of the Farmer and HenHouse classes,");
        System.out.println("using exceptions in Farmer and simple tests in HenHouse, with the use");
        System.out.println("of Before and After, if the need arises to use them.\n");

        Calculator calc = new Calculator();

        Farmer farmer2 = new Farmer(Gender.MALE);

        farmer2.orderRedEggs(0);

        System.out.println(calc.sum(3,5));
        System.out.println(calc.division(3,0));

    }

    private static void singAnimals(Animal[] animalBox){
        for(Animal animal : animalBox){
            animal.makeSound();
            System.out.println(animal.getGender());
            System.out.println("-----------------");
        }
    }
}
