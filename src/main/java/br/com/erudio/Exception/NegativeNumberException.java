package br.com.erudio.Exception;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super("Cannot calculate the square root of a negative number.");
    }
}
