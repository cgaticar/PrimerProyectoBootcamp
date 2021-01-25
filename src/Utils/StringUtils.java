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

    public static String rpad(String s, char c, int n)
    {
        String result = s;
        for(int i = 0; i < n; i++)
        {
            result += c;
        }
        return result;
    }

    public static String removeSpaces(String s)
    {
        return s.replace(" ", "");
    }

    public static String ltrim(String s)
    {
        return s.replaceAll("^\\s*", "");
    }

    public static String rtrim(String s)
    {
        return s.replaceAll("\\s*$", "");
    }

    public static String trim(String s)
    {
        return s.replaceAll("\\s*$", "").replaceAll("^\\s*", "");
    }

    public static int indexOfN(String s,char c,int n)
    {
        int cont = 0;
        int position = 0;
        char[] strArray = s.toCharArray();

        for(char ch : strArray)
        {
            if(ch == c)
            {
                cont++;
                if(cont == n)
                {
                    return position;
                }
            }
            position++;
        }
        return -1;
    }
}