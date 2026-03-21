package br.com.erudio.services;

import br.com.erudio.Exception.DivisionByZeroException;
import br.com.erudio.Exception.NegativeNumberException;
import org.springframework.stereotype.Service;

import static br.com.erudio.utils.MathUtils.convertToDouble;

@Service
public class MathService {

    private static final String ERROR_MESSAGE =
            "Please correct it for me and enter a numeric value.";
    //http://localhost:8080/math/sum/2/3
    public Double sum(String numberOne, String numberTwo) {

        double num1 = convertToDouble(numberOne);
        double num2 = convertToDouble(numberTwo);

        return num1 + num2;
    }
    //http://localhost:8080/math/subtraction/9/3
    public Double subtraction(String numberOne, String numberTwo) {

        double num1 = convertToDouble(numberOne);
        double num2 = convertToDouble(numberTwo);

        return num1 - num2;
    }
    //http://localhost:8080/math/multiplication/2/3
    public Double multiplication(String numberOne, String numberTwo) {

        double num1 = convertToDouble(numberOne);
        double num2 = convertToDouble(numberTwo);

        return num1 * num2;
    }
    //http://localhost:8080/math/division/9/3
    public Double division(String numberOne, String numberTwo) {

        double num1 = convertToDouble(numberOne);
        double num2 = convertToDouble(numberTwo);

        if (num2 == 0.0)
            throw new DivisionByZeroException("You cannot divide by zero");

        return num1 / num2;
    }
    //http://localhost:8080/math/average/9/3/6/3
    public Double average(String numbers) {

        String[] array = numbers.split(",");

        double sum = 0;

        for (String number : array) {
            sum += convertToDouble(number);
        }

        return sum / array.length;
    }
    //http://localhost:8080/math/sqrt/2
    public Double sqrt(String numberOne) {

        double num1 = convertToDouble(numberOne);

        if (num1 < 0)

            throw new NegativeNumberException("Cannot calculate the square root of a negative number.");
        return Math.sqrt(num1);

    }
    //http://localhost:8080/math/power/2/3
    public Double power(String numberOne, String numberTwo) {

        double num1 = convertToDouble(numberOne);
        double num2 = convertToDouble(numberTwo);

        return Math.pow(num1, num2);


    }


}













