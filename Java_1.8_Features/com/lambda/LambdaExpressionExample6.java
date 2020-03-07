/**
 * 
 */
package com.lambda;

/**
 * @author Hrushikesha Puhan
 *
 */

interface Addable6{
	
	int Add(int a, int b);
}
public class LambdaExpressionExample6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Lambda expression without return keyword.  
		
		Addable6 ad6 = (a,b) -> (a-b);
		System.out.println("Addd:::"+ad6.Add(10,20));
		
		// Lambda expression with return keyword. 
		
		Addable6 ad7 = (int a,int b)-> {
			return (a+b);
		};
		System.out.println("Add7:::"+ad7.Add(200, 400));

	}

}
