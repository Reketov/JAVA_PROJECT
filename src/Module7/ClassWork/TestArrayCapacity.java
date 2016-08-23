package Module7.ClassWork;

import java.util.ArrayList;

/**
 * Created by user on 22.08.16.
 */
public class TestArrayCapacity {
    public static void main(String[] args) {
        //Стандартная инициализация
        ArrayList<Integer> IntegerArrayList = new ArrayList<Integer>();

// инициализация с ёмкостью 50
        ArrayList<String> arrayList = new ArrayList<String>(50);
        arrayList.add("12345");

        // инициализация с элементами массива arrayList
        ArrayList<String> arrayList1 = new ArrayList<String>(arrayList);
        System.out.println(arrayList1.toString());

        // увеличение до нужного размера
        arrayList.ensureCapacity(2000);

        //уменьшение до реального размера
        arrayList.trimToSize();

    }

}
