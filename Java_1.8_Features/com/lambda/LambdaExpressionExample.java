/**
 * 
 */
package com.lambda;

interface Drawable{  
    public void draw();  
}  
/**
 * @author Hrushikesha Puhan
 *
 */
public class LambdaExpressionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width=10;  
		  
        //without lambda, Drawable implementation using anonymous class  
        Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  
  
	}

}
