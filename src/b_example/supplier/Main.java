package b_example.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.time.*;

public class Main {
	public static void main(String[] args) {
		Supplier<LocalDate> supplierMR = LocalDate::now;
		System.out.println(supplierMR.get());
		Supplier<LocalDate> supplierFI = () -> LocalDate.now();
		System.out.println(supplierFI.get());
		Supplier<StringBuilder> supplierSB = StringBuilder::new;
		StringBuilder stringBuilder = supplierSB.get();
		System.out.println(stringBuilder.append("hi"));
		Supplier<StringBuilder> supplierSBFI = () -> new StringBuilder();
		StringBuilder stringB = supplierSBFI.get();
		System.out.println(stringB.append("Hello"));
		Supplier<List<String>> supplierList=ArrayList::new;
		List<String> arrayList=supplierList.get();
		System.out.println(arrayList.add("nabil"));
	}

}
