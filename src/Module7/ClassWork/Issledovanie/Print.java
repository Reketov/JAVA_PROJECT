package Module7.ClassWork.Issledovanie;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by user on 22.08.16.
 */
public class Print {
    public static void printToFile(File file, ArrayList<Integer> arrayList) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }
        PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());
        for (Integer i : arrayList) {
            printWriter.print(i);
        }
        printWriter.close();
        System.out.println("Writing is completed");

    }
}
