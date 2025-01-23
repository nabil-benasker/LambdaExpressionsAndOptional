package e_example.function.biFunction;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		Function<String, Integer> function = String::length;
		System.out.println(function.apply("OMAR"));

		Function<String, String> function2 = String::toUpperCase;
		System.out.println(function2.apply("omar"));
		
		BiFunction<String, String, String> biFunction=String::concat;
		System.out.println(biFunction.apply("nabil ", "Ben Asker"));
	}
}
