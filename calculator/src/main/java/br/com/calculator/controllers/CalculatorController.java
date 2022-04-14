package br.com.calculator.controllers;

import br.com.calculator.converters.NumberConverter;
import br.com.calculator.exception.Error;
import br.com.calculator.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private SimpleMath math = new SimpleMath();

    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        NumberConverter.verify(numberOne, numberTwo);
        return math.sum(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
    }

    @RequestMapping(value="/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        NumberConverter.verify(numberOne, numberTwo);
        return math.subtraction(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
    }

    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        NumberConverter.verify(numberOne, numberTwo);
        return math.division(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
    }

    @RequestMapping(value="/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        NumberConverter.verify(numberOne, numberTwo);
        return math.multiplication(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
    }

    @RequestMapping(value="/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
        NumberConverter.verify(numberOne, numberTwo);
        return math.mean(NumberConverter.convertDouble(numberOne), NumberConverter.convertDouble(numberTwo));
    }
}
