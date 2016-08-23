package Module7.ClassWork;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 22.08.16.
 */
public class TestArrListToArr {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(20);
        integerArrayList.add(30);

        //Перевод в массив
        Integer integerArr[] = new Integer[integerArrayList.size()];
        integerArrayList.toArray(integerArr);

        for (int i : integerArr) {
            System.out.println(i + " ");
        }
        System.out.println('\n' + Arrays.toString(integerArr));
    }
}
