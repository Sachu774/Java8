package FeaturesPack;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunction1 {

	public static void main(String[] args) {
		
		//Using BinaryOperator
		BinaryOperator<Integer> func=(x1,x2)->x1+x2;
		int result=func.apply(1, 2);
		System.out.println(result);
		
		//Using BiFunction
		BiFunction<Integer,Integer,Integer> func1=(x1,x2)->x1*x2;
		int res=func1.apply(1,2);
		System.out.println(res);
		

	}

}
