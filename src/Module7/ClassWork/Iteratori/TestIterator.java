package Module7.ClassWork.Iteratori;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by user on 23.08.16.
 */
public class TestIterator {

    public static void main(String[] args) {
        List<Integer> listAr = new LinkedList<>();
        listAr.add(55);
        listAr.add(66);
        listAr.add(77);

        Iterator<Integer> iterator = listAr.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // .set - модификация
        ListIterator<Integer> iteratorList = listAr.listIterator();
        while (iteratorList.hasNext()) {
            Integer intNum = iteratorList.next();
            iteratorList.set(intNum + 2);
        }
        //просмотр списка
        //1
        iteratorList = listAr.listIterator(1);
        while (iteratorList.hasNext()) {
            Integer i1 = iteratorList.next();
            System.out.println(i1 + " ");

            //2
//            System.out.println(iteratorList.next() + " ");
        }
        //3
        System.out.println('\n' + "listAr: " + listAr);

        // братный порядок
        iteratorList = listAr.listIterator(listAr.size());
        while (iteratorList.hasPrevious()) {
            System.out.println(iteratorList.previous() + " ");
        }
    }
}
