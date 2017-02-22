/**
 * Created by Murager on 2/22/17.
 */
public class Fish {

    protected String name;

    protected int age;

    protected boolean fromOcean;

    public void swim() {
        System.out.println("SWIM");
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

    public boolean isFromOcean() {
        return fromOcean;
    }

    public void setFromOcean(boolean fromOcean) {
        this.fromOcean = fromOcean;
    }
}
