package br.com.erudio.controllers;

import br.com.erudio.services.MathService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")

public class MathController {

    private final MathService mathService;

    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        return mathService.sum(numberOne, numberTwo);
    }

    @GetMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        return mathService.subtraction(numberOne, numberTwo);
    }
    @GetMapping("/average/{numbers}")
    public  Double average(@PathVariable String numbers) {
        return mathService.average(numbers);
    }

    @GetMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable String numberOne,
            @PathVariable String numberTwo) {

        return mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {

        return mathService.division(numberOne, numberTwo);
    }
    @GetMapping("/sqrt/{numberOne}")
    public Double sqrt(@PathVariable String numberOne) {

        return mathService.sqrt(numberOne);

    }

    @RequestMapping("/power/{numberOne}/{numberTwo}")
    public Double power(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo) {

        return mathService.power(numberOne, numberTwo);

    }



}






