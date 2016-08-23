package Module7.ClassWork.Iteratori;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 23.08.16.
 */
public class TestSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(111);
        set.add(111);
        set.add(333);

        //Просмотр коллекции
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer i : set) {
            System.out.println("Вывод for: " + i);
        }
        set.remove(111);
        set.clear();

        set.add(123);
        set.add(333);
        System.out.println(set.contains(123));

        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(123);

        set.removeAll(set2);
        for (Integer i : set) {
            System.out.println("Вывод for: " + i);
        }
    }

}
