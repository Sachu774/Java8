package FeaturesPack;

public class UsingLambdaExpression {

	public static void main(String[] args) {
		LambdaInterface li=(int n)-> 
		{
				
			System.out.println("here lambda is used"+" "+n);
		};
		li.test(9);

}
}
