package br.com.brenomp.controllers;

import br.com.brenomp.math.SimpleMath;
import br.com.brenomp.resource.converters.NumberConvert;
import br.com.brenomp.resource.verifier.IsNumber;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if (!IsNumber.isNumeric(numberOne) && !IsNumber.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");

        return SimpleMath.sum(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
    }

    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if (!IsNumber.isNumeric(numberOne) && !IsNumber.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return SimpleMath.subtraction(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
    }

    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if (!IsNumber.isNumeric(numberOne) && !IsNumber.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return SimpleMath.multiplication(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
    }

    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if (!IsNumber.isNumeric(numberOne) && !IsNumber.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return SimpleMath.division(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
    }

    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {

        if (!IsNumber.isNumeric(numberOne) && !IsNumber.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value");
        return SimpleMath.mean(NumberConvert.convertToDouble(numberOne), NumberConvert.convertToDouble(numberTwo));
    }

    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) throws Exception {

        if (!IsNumber.isNumeric(number))
            throw new UnsupportedOperationException("Please set a numeric value");
        return SimpleMath.squareRoot(NumberConvert.convertToDouble(number));
    }
}
