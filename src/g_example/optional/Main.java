package g_example.optional;

import java.util.*;
import java.util.function.UnaryOperator;

public class Main {
	public static Optional<Integer> average(Integer... numbers) {
		if (numbers.length == 0)
			return Optional.empty();
		Integer sum = 0;
		for (Integer integer : numbers) {
			sum += integer;
		}
		return Optional.of(sum / numbers.length);

	}

	public static void main(String[] args) {
		Optional<Integer> optional = Optional.of(5);
		Optional<Integer> optional2 = Optional.empty();
		System.out.println(optional);
		System.out.println(optional2);
		System.out.println(Main.average(5, 3, 4));
		System.out.println(Main.average());
		if(optional.isPresent())
			System.out.println(optional.get());
		if(optional2.isPresent())
			System.out.println(optional2.get());
		Integer value=5;
		Optional optionalMayBeNullable=Optional.ofNullable(value);
		System.out.println(optionalMayBeNullable);
		optional.ifPresent(System.out::println);
		System.out.println(optional.orElse(Integer.MAX_VALUE));
		System.out.println(optional.orElseGet(()->new Integer(0)));
		System.out.println(optional.orElseThrow(()->new RuntimeException("not")));
		

	}
}
