/**
 * Created by Murager on 2/22/17.
 */
public class Animal {

    protected String name;

    protected int age;

    public void run() {
        System.out.println("RUN!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
