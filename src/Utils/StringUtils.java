package Utils;

import java.util.ArrayList;

public class StringUtils {
    public static ArrayList<String> convertArrIntToString(int[] arr)
    {
        ArrayList<String> arrStr = new ArrayList<>();
        for(int i:arr)
        {
            arrStr.add(Integer.toString(i));
        }
        return  arrStr;
    }

    public static int getDigitosMayorNro(int[] arr)
    {
        int mayor = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > mayor)
            {
                mayor = arr[i];
            }
        }

        return Integer.toString(mayor).length();
    }

    public static ArrayList<String> arrPadding(ArrayList<String> arr, int digitos)
    {
        ArrayList<String> arrStr = new ArrayList<>();
        String format = "%0" + digitos + "d";
        for(String str : arr){
            String pad = String.format(format, Integer.parseInt(str));
            arrStr.add(pad);
        }
        return arrStr;
    }
}