package FeaturesPack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class BiFunction2 {

	public static void main(String[] args) {
		List<String> langlist=new ArrayList<String>();
		langlist.add("hi");
		langlist.add("this");
		
		UnaryOperator<String> func=x->x.concat("maijudgaya");
		
		for(String y: langlist) {
			System.out.println(func.apply(y));
		}
		

	}

}
