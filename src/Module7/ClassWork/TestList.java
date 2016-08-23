package Module7.ClassWork;

import java.util.ArrayList;

/**
 * Created by user on 22.08.16.
 */
public class TestList {

    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<Integer>();
        arList.add(333);
        arList.add(55);
        arList.add(55);

        System.out.println(arList.get(0));
        arList.remove(0);// Удаление элемента 0
        System.out.println(arList.get(0));
        System.out.println("size2 " + arList.size());
        arList.add(5);
        arList.add(83);

        for (int n : arList) { // Вывод всех элементов
            System.out.println(n + " ");
        }
        // Возврат номера элемента
            System.out.println();
            System.out.println(arList.indexOf(5) + " arList.indexOf(5)");

            // Проверка на наличие значений
            System.out.println(arList.isEmpty());

            arList.set(0, 30); // Устанавливаем значения на позицию 0
            for (int n : arList) { // Вывод всех элементов
                System.out.println(n + " ");
            }
            System.out.println();
            arList.add(0, 1); //Добавляем значения на позицию 0
            for (int n : arList) { // Вывод всех элементов
                System.out.println(n + " ");
            }
            System.out.println();
            arList.add(1); //Добавляем значение
            for (int n : arList) { // Вывод всех элементов
                System.out.println(n + " ");
            }
        }
    }
