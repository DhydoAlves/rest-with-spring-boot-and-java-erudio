package br.com.erudio.Exception;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super("You cannot divide by zero");
    }
}
