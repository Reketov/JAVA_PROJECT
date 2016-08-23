package Module7.ClassWork.Issledovanie;


/**
 * Created by user on 22.08.16.
 */
public class Sort {

    static void selectionSort(Integer[] sel) {
/*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < sel.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = sel[i];
            int min_i = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < sel.length; j++) {
                //Если находим, запоминаем его индекс
                if (sel[j] < min) {
                    min = sel[j];
                    min_i = j;
                }
            }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
            if (i != min_i) {
                int tmp = sel[i];
                sel[i] = sel[min_i];
                sel[min_i] = tmp;
            }
        }
    }

    static void BoobleSort(Integer[] boob) {
/*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
        for (int i = boob.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (boob[j] > boob[j + 1]) {
                    int tmp = boob[j];
                    boob[j] = boob[j + 1];
                    boob[j + 1] = tmp;
                }
            }
        }
    }

    static Integer[] NewSort(Integer[] nsort) {
        int indexMin;
        for (int i = 0; i < nsort.length - 1; i++) {
            indexMin = i;
            for (int j = 0; j < nsort.length; j++) {
                if (nsort[j] < nsort[indexMin]) {
                    indexMin = j;
                }
            }
//            System.out.println(i + " iteration");
//            swap(i, indexMin, nsort);
        }
        System.out.println("SelectionSort complite");
        return nsort;
    }
}