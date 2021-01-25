package Clase2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private static String password_pattern;
    public static Pattern pattern;
    private static String password = null;

    public Password(String regex)
    {
        password_pattern = regex;
        pattern = Pattern.compile(password_pattern);
    }

    public void setValue(String pwd)
    {
        try
        {
            Matcher matcher = pattern.matcher(pwd);
            if(matcher.matches()) password = pwd;
            else throw new InvalidPasswordException();

        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }

    public boolean isValid()
    {
        return password != null;
    }

}
