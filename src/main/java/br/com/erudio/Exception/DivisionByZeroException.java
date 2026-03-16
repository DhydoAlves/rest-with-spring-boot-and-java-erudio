package br.com.erudio.Exception.Division;

public class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super("You cannot divide by zero");
    }
}
