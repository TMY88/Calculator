package pro.sky.java.course2.calculator.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImpl implements CalculationService{

    @Override
    public String plus(Integer num1, Integer num2) {
        int result = num1 + num2;
        return num1 + "+" + num2 + "=" + result;
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        int result = num1 - num2;
        return num1 + "-" + num2 + "=" + result;
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        int result = num1 * num2;
        return num1 + "*" + num2 + "=" + result;
    }

    @Override
    public String devide(Integer num1, Integer num2) {
        int result = num1 / num2;
        return num1 + "/" + num2 + "=" + result;
    }
}