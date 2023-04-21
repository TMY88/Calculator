package pro.sky.java.course2.calculator.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController

@RequestMapping("/calculator")

public class FirstController {

    private final CalculationService calculationService;

    public FirstController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping

    public String showWelcomeCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")

    public String showCalculationPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует один или оба параметра";
        }
        return calculationService.plus(num1, num2);
    }

    @GetMapping("/minus")

    public String showCalculationMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует один или оба параметра";
        }
        return calculationService.minus(num1, num2);
    }

    @GetMapping("/multiply")

    public String showCalculationMultiply(Integer num1, Integer num2) {
        if ((num1 == null) || (num2 == null)) {
            return "Отсутствует один или оба параметра";
        }
        return calculationService.multiply(num1, num2);
    }

    @GetMapping("/devide")

    public String showCalculationDevide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Отсутствует один или оба параметра";
        }
        if (num2 == 0) {
            return "на 0 делить нельзя!!!";
        }
        return calculationService.devide(num1, num2);
    }

}
