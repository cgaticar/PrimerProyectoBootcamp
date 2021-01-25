package Clase2;

public class PasswordSimple extends Password{
    public PasswordSimple()
    {
        super("^(?=.*[a-z])(?=.*[A-Z]).{4,20}$");
    }
}
