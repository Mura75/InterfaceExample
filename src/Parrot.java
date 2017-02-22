/**
 * Created by Murager on 2/22/17.
 */
public class Parrot extends Animal implements SwimInterface, TalkInterface {

    @Override
    public void run() {
        System.out.println("Parrot run!!!");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void swim() {
        System.out.println("Parrot swim");
    }

    @Override
    public void bulBNul() {
        System.out.println("Parrot bul bul");
    }

    @Override
    public void talk() {
        System.out.println("hello people");
    }
}
