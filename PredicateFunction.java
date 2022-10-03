package FeaturesPack;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		Predicate<Integer> func=x->x>2;
		System.out.println(func.test(5));

	}

}
