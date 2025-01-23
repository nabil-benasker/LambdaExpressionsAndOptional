package c_example.consumer.biconsumer;
import java.util.function.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
	Consumer<String> consumer=p->System.out.println(p);
	consumer.accept("hello");
	Consumer<String> consumerMR=System.out::println;
	consumerMR.accept("hi");
	Supplier<Map<String, Integer>> supplier=HashMap<String, Integer>::new;
	Map<String, Integer> map = supplier.get();
	BiConsumer<String, Integer> biConsumer=(p1,p2)->map.put(p1, p2);
	biConsumer.accept("Nabil", 36);
	System.out.println(map);
	Map<String, Integer> map2=new HashMap<String, Integer>();
	BiConsumer<String, Integer>biConsumer2= map2::put;
	biConsumer2.accept("nabil2", 37);
	System.out.println(map2);
	Integer put = map.put(null, null);
	
	
	
}
}
