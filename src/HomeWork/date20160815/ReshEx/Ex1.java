package HomeWork.date20160815.ReshEx;

/**
 * Created by Andrew on 21.08.2016.
 * Записать в файл таблицу Пифагора.
 */
public class Ex1 {
    public static void main(String[] args) {
        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int q : pif) {
            for (int w : pif) {
                System.out.printf("%4d", (q * w));
            }
            System.out.println();
        }
    }
}
