package Clase2;

public class InvalidPasswordException extends Exception {
    InvalidPasswordException()
    {
        super("Invalid password format");
    }
}
