import com.globant.bootcamp.abstracts.Animal;
import com.globant.bootcamp.animals.Cat;
import com.globant.bootcamp.animals.Dog;
import com.globant.bootcamp.animals.Duck;
import com.globant.bootcamp.enums.Gender;
import com.globant.bootcamp.animals.Chicken;
import com.globant.bootcamp.animals.Farmer;
import com.globant.bootcamp.buildings.Henhouse;
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

        int hens_in_henhouse;

        hens_in_henhouse = 40;

        Henhouse.chickens_inside(hens_in_henhouse);
        Henhouse.Henhouse_production(hens_in_henhouse);

        Farmer.Order_White_Eggs(Henhouse.Red_eggs(hens_in_henhouse));
        Farmer.Order_Red_Eggs(Henhouse.White_eggs(hens_in_henhouse));

        System.out.println("\nAnd this is the result after the farmer");
        System.out.println("has sorted them by color in 6 x 5 egg's cartons.\n");

        System.out.println("Topic 1");
        //Singleton Patron demonstration
        Henhouse henhouse_1 = Henhouse.getInstance();
        Henhouse henhouse_2 = Henhouse.getInstance();



        henhouse_1.setValue("Demonstration of the Singleton Patron with the Henhouse class.\n");
        System.out.println(henhouse_2.getValue());
        //The second variable returns the same value that was assigned to the
        //first variable because both are referred to the same instance.

        System.out.println("Topic 2");
        System.out.println("The error messages thrown based on their severity are ");
        System.out.println("displayed, configured from the files related to log4j.\n");

        Client.main();
    }

    private static void singAnimals(Animal[] animalBox){
        for(Animal animal : animalBox){
            animal.makeSound();
            System.out.println(animal.getGender());
            System.out.println("-----------------");
        }
    }
}
