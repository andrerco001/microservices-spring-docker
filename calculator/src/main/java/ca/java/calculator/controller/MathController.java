package ca.java.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.java.calculator.exception.UnsupportedMathOperationException;

@RestController
@RequestMapping(value = "/math")
public class MathController {

	// sum
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	private Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}
	
	// subtraction
	@GetMapping("/subtraction/{numberOne}/{numberTwo}")
	private Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	
	// multiplication
	@GetMapping("/multiplication/{numberOne}/{numberTwo}")
	private Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}
	
	// division
	@GetMapping("/division/{numberOne}/{numberTwo}")
	private Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	
	// average
	@GetMapping("/average/{numberOne}/{numberTwo}")
	private Double average(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
	}
	
	// squareRoot
	@GetMapping("/squareRoot/{number}")
	private Double squareRoot(@PathVariable("number") String number) throws Exception {
		if (!isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value");
		}
		return (Double) Math.sqrt(convertToDouble(number));
	}
	
	private Double convertToDouble(String strNumber) {
		if (strNumber == null) {
			return 0D;
		}

		if (isNumeric(strNumber)) {
			return Double.parseDouble(strNumber);
		}

		return 0D;
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null) {
			return false;
		}
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}