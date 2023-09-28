package ie.atu.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/server_test")
    public Object server_test() {
        return ("abc");
    }

    // Run code and search on any browser the following:
    // http://localhost:8080/calculate?num1=5&num2=4&operation=subtract
    @GetMapping("/calculate")
    public Object calculate(@RequestParam int num1, int num2, String operation) {
        return switch (operation) {
            case "add" -> new Data(operation, (num1 + num2));
            case "subtract" -> new Data(operation, (num1 - num2));
            case "multiply" -> new Data(operation, (num1 * num2));
            case "divide" -> new Data(operation, ((float) num1 / num2));
            default -> ("Not a valid operation");
        };
    }
}
