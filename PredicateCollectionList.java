package FeaturesPack;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCollectionList {

	public static void main(String[] args) {
		List<Integer> liso= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Predicate<Integer> func= x->x>5;
		List<Integer> colist = liso.stream().filter(func).collect(Collectors.toList());
		System.out.println(colist);
	}

}
