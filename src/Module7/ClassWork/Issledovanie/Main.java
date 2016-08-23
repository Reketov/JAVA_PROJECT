package Module7.ClassWork.Issledovanie;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static Module7.ClassWork.Issledovanie.Print.printToFile;
import static Module7.ClassWork.Issledovanie.Read.readFromFile;

/**
 * Created by user on 22.08.16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File fileToRead = new File("F:\\JAVA\\JAVA_PROJECT\\data\\million.txt");
        File fileToWrite = new File("F:\\JAVA\\JAVA_PROJECT\\data\\pi-1million.txt");
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList = readFromFile(fileToRead, arrayList);
//Collections.sort(arrayList);
        Integer[] arr = new Integer[arrayList.size()];
        arr = arrayList.toArray(arr); // from list to array
        Sort.selectionSort(arr);
//Sort.bubleSort(arr);
        arrayList = (new ArrayList<Integer>(Arrays.asList(arr))); // from array to list
// System.out.println(arrayList);
        printToFile(fileToWrite, arrayList);
    }
}
