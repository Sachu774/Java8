package FeaturesPack;

import java.util.function.Function;

public class ChainingFunction {

	public static void main(String[] args) {
		//Function 1
		Function<String,Integer> func=x->x.length();
		
		//Function 2
		Function<Integer, Integer> func2=x->x*2;
		int doubl=func.andThen(func2).apply("This will do something");
		System.out.println(doubl);
		
		
	}

}
