package FeaturesPack;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryFunction1 {

	public static void main(String[] args) {
		
		//UnaryOperator
		UnaryOperator<Integer> func=x->x*10;
		System.out.println(func.apply(2));
		
		//We can do the same using FunctionInterface
		Function<Integer,Integer> func1=x->x*20;
		System.out.println(func1.apply(2));
		
	}

}
