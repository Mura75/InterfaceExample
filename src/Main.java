import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Murager on 2/22/17.
 */
public class Main {


    public static void main(String[] args) {

        sortAnimals();
    }


    public static void sortObjects() {

        List<Dog> dogList = new ArrayList<>();

        Dog dog1 = new Dog();

        Animal dog = new Dog();
        Animal parrot = new Parrot();

        dog.getAge();

        Animal animal = new Animal();

        Dog dog2 = (Dog)animal;

        if (dog instanceof Dog) {
            System.out.println("In is a god");
        }

    }

    public static void sortAnimals() {

        List<Dog> dogList = new ArrayList<>();

        Dog dog = new Dog();
        dog.setName("Barsik");
        Dog dog2 = new Dog();
        dog2.setName("Polkan");
        Dog dog3 = new Dog();
        dog3.setName("Vulkan");
        Dog dog4 = new Dog();
        dog4.setName("Archi");

        dogList.add(dog);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);

        Collections.sort(dogList);
        System.out.println("Sorted dogs \n" + dogList.toString());
    }

    public static void sortText() {
        List<String> list = new ArrayList<>();

        String str;

        list.add("Bob");
        list.add("Jim");
        list.add("Sam");
        list.add("Adam");
        list.add("Mikki");
        list.add("Chen");
        list.add("Williams");

        Collections.sort(list);

        System.out.println("Sorted list \n" + list.toString());

    }
}
