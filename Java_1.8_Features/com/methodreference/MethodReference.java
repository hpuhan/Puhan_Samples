/**
 * 
 */
package com.methodreference;

/**
 * @author Hrushikesha Puhan
 *
 */

interface Sayable {
	void say();
}
public class MethodReference {
	
	   public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable say1=MethodReference::saySomething;
		say1.say();
	}

}
