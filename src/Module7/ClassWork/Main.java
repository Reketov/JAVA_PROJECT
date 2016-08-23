package Module7.ClassWork;

import java.util.ArrayList;

/**
 * Created by user on 22.08.16.
 */
public class Main {

    public static void main(String[] args) {
        Fish karp = new Fish("Din", 1);
        Fish karp1 = new Fish("Tom", 1);
        Fish karp2 = new Fish("Jon", 1);
        ArrayList<Fish> list1 = new ArrayList<>();

        list1.add(karp);
        list1.add(karp1);
        list1.add(karp2);
        System.out.println(list1.toString());
    }
}
