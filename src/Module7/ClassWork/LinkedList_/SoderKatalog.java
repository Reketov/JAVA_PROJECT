package Module7.ClassWork.LinkedList_;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.08.16.
 * Написать ф-ю, которая сохранит содержимое каталога в список и выведет все
 * элементы (или заданное количество элементов) на экран.
 */
public class SoderKatalog {
    public static void main(String[] args) {

        File f1 = new File("F:\\JAVA\\JAVA_PROJECT\\data\\");
        List myList = new ArrayList<>();
        System.out.println(f1);

        if (f1.exists() & f1.isDirectory())
            f1.list();
        for (String arg : f1.list()) {
            System.out.println(arg);
            myList.add(arg);
        }
        System.out.println(myList);
    }
}
