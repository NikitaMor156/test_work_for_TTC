package input_manager;

import file.MyFileManager;
import file.MyFileReader;
import filter.MyFilter;

import java.io.File;
import java.util.ArrayList;

public class FileInputManager {
    public static ArrayList<Integer> getSortedArrayListFromFile(String inputPath) {
        MyFileReader fileReader = new MyFileManager();
        MyFilter filter = new MyFilter();
        ArrayList<Integer> numbersFromFile = fileReader.getNumbersFromFileToArrayList(inputPath);
        ArrayList<Integer> sortedArrayList = filter.getFilteredArrayList(numbersFromFile);
        System.out.println("LOG: File input ended. Input file is " + new File(inputPath).getAbsolutePath());
        return sortedArrayList;
    }
}
