package Module7.ClassWork.LinkedList_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 23.08.16.
 */
public class TestList2 {

    public static void main(String[] args) {
        //
        List<Integer> arrList = new ArrayList<Integer>();
//
        arrList.add(333);
        arrList.add(55);
        arrList.add(56);
        arrList.add(335);
        arrList.add(334);

        //  .subList()
        System.out.println(arrList.subList(0, 3));

        arrList.subList(1, 3).clear();
        for (Integer i : arrList) {
            System.out.println("clear: " + i);
        }

        // unmodifiable
        arrList = Collections.unmodifiableList(arrList);
        arrList.add(2);//error

        for (Integer i : arrList) {
            System.out.println("clear2: " + i);
        }
    }

}
