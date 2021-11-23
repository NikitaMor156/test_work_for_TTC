package file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MyFileManager implements MyFileReader, MyFileWriter {

    @Override
    public ArrayList<Integer> getNumbersFromFileToArrayList(String pathString) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        Path pathObj = Paths.get(pathString);
        String content = null;
        try {
            content = Files.readString(pathObj, StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] numArr = content.split(",");
        for (int i = 0; i < numArr.length; i++) {
            resultArray.add(Integer.parseInt(numArr[i]));
        }
        return resultArray;
    }

    public ArrayList<Integer> getNumbersFromFile(File file) {
        String path = file.getAbsolutePath();
        return getNumbersFromFileToArrayList(path);
    }

    @Override
    public void writeNumbersFromArrayListToFile(ArrayList<Integer> arrayList, String pathString) {
        String text = getStringInFileFormat(arrayList);
        File targetFile = new File(pathString);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(targetFile));
            pw.print(text);
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getStringInFileFormat(ArrayList<Integer> arrayList) {
        StringBuilder sb = new StringBuilder();

        for (Integer var : arrayList) {
            sb.append(var);
            sb.append(",");
        }

        String str = sb.toString();
        return str.substring(0, str.length() - 1); //delete last index (,) and return
    }
}
