/**
 * Created by Murager on 2/22/17.
 */
public class Dog extends Animal implements SwimInterface, Comparable {



    @Override
    public void run() {
        System.out.println("Dog run!!!");
    }


    @Override
    public void swim() {
        System.out.println("Dog swim");
    }

    @Override
    public void bulBNul() {
        System.out.println("Bul bul!!!");
    }

    @Override
    public int compareTo(Object o) {
        Dog d = (Dog)o;
        return getName().compareTo(d.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
