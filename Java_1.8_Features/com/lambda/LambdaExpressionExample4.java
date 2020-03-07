package com.lambda;

interface Testvalue {
	public String say(String name);
}
public class LambdaExpressionExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testvalue t = (name) -> {
			return " Hello T1" +name;
		};
		System.out.println("t name"+t.say(" Test Value 1"));
		
		Testvalue t2 = name -> {
			return " Hello t2" +name;
		};
		System.out.println("t2 name"+t2.say(" Test Value 2"));
	}

}
