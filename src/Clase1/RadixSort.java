package Clase1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Utils.StringUtils;

public class RadixSort {
    public static HashMap<Integer, ArrayList<String>> positionList_map = new HashMap<>();

    public static ArrayList<String> radixSort(int []arr)
    {
        ArrayList<String> numeros = new ArrayList<>();
        ArrayList<String> paddedList = new ArrayList<>();
        ArrayList<String> sortedList = new ArrayList<>();
        int digitos = StringUtils.getDigitosMayorNro(arr);

        for(int i = 0; i<10; i++)
        {
            positionList_map.put(i, new ArrayList<String>());
        }

        numeros = StringUtils.convertArrIntToString(arr);
        paddedList = StringUtils.arrPadding(numeros, digitos);

        for(int i = digitos-1; i>= 0; i--)
        {
            for (String str : paddedList)
            {
                positionList_map.get(str.charAt(i)-'0').add(str);
            }

            paddedList = generateNewList(positionList_map);
        }

        return paddedList;
    }

    public static ArrayList<String> generateNewList(HashMap<Integer, ArrayList<String>> lists)
    {
        ArrayList<String> orderedList = new ArrayList<>();

        for(Map.Entry<Integer, ArrayList<String>> entry : lists.entrySet())
        {
            orderedList.addAll(entry.getValue());
            entry.getValue().clear();
        }

        return  orderedList;
    }

    public static void main(String[] args) {
        int arr[] = {16223, 898, 13, 906, 235, 23, 9, 6388, 2511, 8};

        ArrayList<String> sorted = new ArrayList<>();
        sorted = radixSort(arr);

        for(String str : sorted)
        {
            System.out.println(Integer.parseInt(str));
        }
    }
}
