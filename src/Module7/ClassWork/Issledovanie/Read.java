package Module7.ClassWork.Issledovanie;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by user on 22.08.16.
 */
public class Read {
    public static ArrayList<Integer> readFromFile(File file, ArrayList<Integer> arrayList) throws IOException {
        char c;
        try (InputStream inputStream = new FileInputStream(file)) {
            int nowRead = inputStream.read();
            while (nowRead != -1) {
                c = (char) nowRead;
                arrayList.add(Character.getNumericValue(c));
                nowRead = inputStream.read();
            }
        }
        System.out.println("Reading completed");
        return arrayList;
    }
}
