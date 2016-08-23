package HomeWork.date20160815.ReshEx;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Andrew on 21.08.2016.
 * Создать программу которая копирует файл и указывает имя копии как в виндовс.
 */
public class Ex4 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter(System.out, true);
        File original = new File("original.txt");
//        if (original.exists()) {
//            original.createNewFile("original1.txt");
//            }
            pw.println(new File(original.getAbsolutePath()));
            File copy = new File("copy.txt");
        }
    }