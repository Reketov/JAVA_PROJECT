package Module7.ClassWork.LinkedList_;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * Created by user on 23.08.16.
 */
public class TestList1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<> ();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(2, 3);
        System.out.println(linkedList1.toString());

        System.out.println(linkedList1.get(1));
        System.out.println(linkedList1.getFirst());
        System.out.println(linkedList1.getLast());
        linkedList1.set(0, 100); //
// Ставим первым
        linkedList1.addFirst(0);
        linkedList1.offerFirst(10);
        System.out.println(linkedList1.toString());


        // Ставим последним
        linkedList1.addLast(0);
        linkedList1.offerLast(10);
        System.out.println(linkedList1.toString());
//Удаление
        linkedList1.removeFirst();
        linkedList1.remove();
        linkedList1.removeLast();
        System.out.println(linkedList1.toString());

        //Инициализация
        LinkedList<Integer> linkedList2 = new LinkedList<>(linkedList1);
        System.out.println("linkedList2: " + linkedList2);

        //1 .add
        LinkedList<Integer> linkedListOne = new LinkedList<>();
        Collections.addAll(linkedListOne, 1, 2, 3, 4, 5);

        //2 .add
        LinkedList<Integer> linkedListTwo = new LinkedList<>(asList(1, 2, 3, 4, 5));

        //3 .add
        List<Integer> linkedListThree = asList(1, 2, 3, 4, 5);

        //Удалить .toString()
        System.out.println(linkedListOne + linkedListTwo.toString() + linkedListThree.toString());
    }
}

