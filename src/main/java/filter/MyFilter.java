package filter;


import java.util.ArrayList;
import java.util.Collections;

public class MyFilter {

    public ArrayList<Integer> getFilteredArrayList(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        int size = arrayList.size();
        //some null logic

        if (size % 2 == 0) {
            return sortForEvenArraySize(arrayList);

        } else if (size % 2 != 0) {
            return sortForOddArraySize(arrayList);
        }
        return null;
    }

    private static ArrayList<Integer> sortForEvenArraySize(ArrayList<Integer> arrayList) {
        ArrayList<Integer> evenArrayList = new ArrayList<>();
        for (Integer var : arrayList) {
            if (var % 2 == 0) {
                evenArrayList.add(var);
            }
        }
        return evenArrayList;
    }

    private static ArrayList<Integer> sortForOddArraySize(ArrayList<Integer> arrayList) {
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        for (Integer var : arrayList) {
            if (var % 2 != 0) {
                oddArrayList.add(var);
            }
        }
        return oddArrayList;
    }

}
