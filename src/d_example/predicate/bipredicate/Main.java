package d_example.predicate.bipredicate;
import java.util.function.*;
public class Main {
public static void main(String[] args) {
	Predicate<String> predicate=String::isEmpty;
	System.out.println(predicate.test("hello"));
	Predicate<String> predicate2=x->x.isEmpty();
	System.out.println(predicate2.test(""));
	
	BiPredicate<String,String> biPredicate=String::startsWith;
	System.out.println(biPredicate.test("Nabil", "N"));
	BiPredicate<String,String> biPredicate2=(string,prefix)->string.startsWith(prefix);
	System.out.println(biPredicate2.test("nabil", "N"));
}
}
