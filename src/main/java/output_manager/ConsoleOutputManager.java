package output_manager;

import java.util.ArrayList;

public class ConsoleOutputManager {
    public static void printOutput(ArrayList<Integer> listFromScanner) {
        StringBuilder sb = new StringBuilder();
        for (Integer var : listFromScanner) {
            sb.append(var);
            sb.append(",");
        }
        String output = sb.toString();
        output = output.substring(0, output.length() - 1); //delete last character (,);

        System.out.println("OUTPUT: " + output);
        System.out.println("LOG: Console output ended");
    }
}
