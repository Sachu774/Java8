package FeaturesPack;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		Consumer<String> func= x->System.out.println(x);
		func.accept("hi this is consumer interface");

	}

}
