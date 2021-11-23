package output_manager;

import file.MyFileManager;
import file.MyFileWriter;

import java.io.File;
import java.util.ArrayList;

public class FileOutputManager {
    public static void writeNumbersFromArrayListToFile(ArrayList<Integer> sortedArrayList, String outputPath) {
        MyFileWriter fileWriter = new MyFileManager();
        fileWriter.writeNumbersFromArrayListToFile(sortedArrayList, outputPath);
        System.out.println("LOG: File output ended. Output file path is " + new File(outputPath).getAbsolutePath());
    }
}
