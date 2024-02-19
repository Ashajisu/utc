package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListUp {
    static List<String[]> listOfArrays = new ArrayList<>();
    int capSize = 2;

    //고정된 크기의 배열을 리스트에 담기
    public ListUp(){
    }

    public void setArray(String one, String two) {
        String[] array = new String[capSize];
        array[0] = one;
        array[1] = two;
        this.listOfArrays.add(array);
    }

    public List<String[]> getListOfArrays(){
        return this.listOfArrays;
    }

    public String printListOfArrays(){
        StringBuilder buid = new StringBuilder();
        for (String[] s: listOfArrays) {
            buid.append(s[0] + "\t, " + s[1] + "\n");
        }

        return buid.toString();
    }
}
