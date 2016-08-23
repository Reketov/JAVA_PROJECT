package Module7.ClassWork;

/**
 * Created by user on 22.08.16.
 */
public class Fish {
    String name;
    int age;

    public Fish(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
