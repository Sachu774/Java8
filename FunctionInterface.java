package FeaturesPack;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		Function<String, Integer> func=x->x.length();
		int len=func.apply("This is me");
		System.out.println(len);

	}

}
