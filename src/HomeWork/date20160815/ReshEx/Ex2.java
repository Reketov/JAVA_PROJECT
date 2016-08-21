package HomeWork.date20160815.ReshEx;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by Andrew on 21.08.2016.
 */
public class Ex2 {

    /**
     * Created by Andrew on 21.08.2016.
     * Создать массив из 4-х объектов. У каждого объекта должны быть поля: имя, возраст, телефон, e-mail.
     * Перезаписать эти данные в файл.
     */
        public static void main(String[] args) {
//        String[] masiv = {"name", "year", "telef", "email"};
            String[] student1 = {"Tom", "20", "067 - 595 - 22 - 11", "tom@gmail.com"};
            String[] student2 = {"Chak", "19", "067 - 511 - 22 - 01", "chak@gmail.com"};
            String[] student3 = {"Nike", "21", "067 - 345 - 25 - 11", "nike@gmail.com"};
            String[] student4 = {"Sam", "20", "097 - 665 - 29 - 15", "sam@gmail.com"};
            File file1 = new File("base.txt");
//        masiv[0] = student1[0];
//        System.out.println(masiv[0]);
            String[] arrStr1 = new String[4];
            arrStr1[0] = Arrays.toString(student1);
            arrStr1[1] = Arrays.toString(student2);
            arrStr1[2] = Arrays.toString(student3);
            arrStr1[3] = Arrays.toString(student4);
            System.out.println("Эти данные сохранены в файл:");
            System.out.println(Arrays.toString(arrStr1));

//        for (int i = 0; i <= 0; i++) {
//            for (int j = 0; j < arrStr[i].length; j++) {
//                arrStr[i][j] = student1[j];
//                System.out.print(arrStr[i][j] + " ");
////                System.out.print(Arrays.toString(masiv) + "  ");
//            }
//            System.out.println(Arrays.toString(masiv) + "  ");
//            System.out.print(Arrays.toString(arrStr[i]) + "  ");
//        }
//        for (int i = 1; i <= 1; i++) {
//            for (int j = 0; j < arrStr[i].length; j++) {
//                arrStr[i][j] = student2[j];
////                System.out.print(arrStr[i][j] + " ");
////        System.out.print(Arrays.toString(masiv) + "  ");
////        System.out.print(masiv[i].toString());
//            }
//            System.out.println(Arrays.toString(arrStr[i]) + "  ");
//        }
//        for (int i = 2; i <= 2; i++) {
//            for (int j = 0; j < arrStr[i].length; j++) {
//                arrStr[i][j] = student3[j];
////        System.out.print(Arrays.toString(masiv) + "  ");
////        System.out.print(masiv[i].toString());
//            }
//        }
//        for (int i = 3; i <= 3; i++) {
//            for (int j = 0; j < arrStr[i].length; j++) {
//                arrStr[i][j] = student4[j];
//            }
//            System.out.println(Arrays.toString(arrStr[i]) + "  ");
//        }
//        for (int i = 3; i <= 3; i++) {
//            for (int j = 0; j < arrStr[i].length; j++) {
//                arrStr[i][j] = Arrays.toString(student4);
//            }
//            System.out.println(Arrays.toString(arrStr[i]) + "  ");
            try {
                if (!file1.exists()) {
                    file1.createNewFile();
                }
                PrintWriter pw = new PrintWriter(file1.getAbsolutePath());
                try {
                    for (int i = 0; i < 4; ++i)
                        pw.write(arrStr1[i] + "\n");
                    pw.flush();
                } finally {
                    pw.close();
                }
            } catch (IOException e) {
                System.out.println("ERROR!");
            }
        }
    }
