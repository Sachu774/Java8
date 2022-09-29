package FeaturesPack;

public class LambdaConcept {

	public static void main(String[] args) {
		//if we want to create instance of interface here it is not possible to overcome this we use anonymous innertype class
		LambdaInterface LI= new LambdaInterface() {
			
			@Override
			public void test(int n) {
				System.out.println("Hi this is method of interface inside anonymous class"+" "+n);
				
			}
		};
		LI.test(9);
	}

}
