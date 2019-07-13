package main.java.customExceptions;

public class OptionalNullException extends Exception{
    public OptionalNullException() {
        super("Optional has a null value!");
    }
}
