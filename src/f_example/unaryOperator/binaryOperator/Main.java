package f_example.unaryOperator.binaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		UnaryOperator<String> unaryOperator = p -> "x".concat(p);
		System.out.println(unaryOperator.apply("y"));
		BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
		System.out.println(binaryOperator.apply(1, 2));
		
		UnaryOperator<String> unaryOperator2=String::toUpperCase;
		System.out.println(unaryOperator2.apply("a"));
		Function<List<String>,String> ex1=x->x.get(0);
		System.out.println(ex1.apply(Arrays.asList("a","b")));
	}
	//Supplier
	//function
	//BinaryOprator
	
	//Predicate
	//Consumer
	//Bipredicate
	

}
