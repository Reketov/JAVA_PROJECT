package Module7.ClassWork.Iteratori;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by user on 23.08.16.
 */
public class TestIterator2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
//
//        for (String s : list) {
//            if (s.equals("a")) {
//                list.remove(s);
//            }
//        }
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();

            if (s.equals("a")) {
                iter.remove();
            }
        }
        System.out.println(list);
    }
}
