package practice.demo.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Example {

	public static void main(String[] args) {
		// implement a function FunctionalInterface
		CalculatorFunction sumFunction = (int a, int b) -> {
			System.out.println("a=" + a + ",b=" + b);
			return a + b;
		};
		int sum = sumFunction.calc(1, 5);
		System.out.println(sum);

		// some void
		VoidFunction.help();
		VoidFunction voidFunction = (o) -> {
			System.out.println(o.getClass().getName());
		};
		
		voidFunction.info(voidFunction);
		// we can pass functionalInterface as a param to a function
		sum(sumFunction, 2, 3);
		sum((int a, int b) -> a * b, 2, 3);

		
		// using predicate
		System.out.println("using predicate");
		Predicate<String> five = (s)-> s.length() == 5;
		System.out.println(five.test("abcde"));
		//System.out.println("Predicate.isEqual(): "+Predicate.isEqual("s"));
		
		// using java.util.functio.Function
		System.out.println("using java.util.function.Function<T>.apply");
		Function<String,String> upper = (s)-> s.toUpperCase();
		System.out.println(upper.apply("hello"));
		System.out.println("lambda can access final variable and variable the initialize only once");
		final String yo = "yo";
		String hola = "hola"; // this variable should not change
		
		Function<String,String> variable = (in) -> in + " yo: "+yo + " hola "+hola;
		System.out.println(variable.apply("input"));
	}
	

	public static void sum(CalculatorFunction calculator, int a, int b) {

		System.out.println(calculator.calc(a, b));
	}
	
	
	
	
    @FunctionalInterface
	interface Calculator {
		int calculate(int x, int y);
	}

	class add implements Calculator {
		public int calculate(int x, int y) {
			return x + y;
		}
	}

	class multiply implements Calculator {
		public int calculate(int x, int y) {
			return x * y;
		}
	}
}
