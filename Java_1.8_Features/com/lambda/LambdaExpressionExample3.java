package com.lambda;

interface Sayable{  
    public String say();  
} 

public class LambdaExpressionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s = () ->{
			return "Nothing to print";
		};
		System.out.println("Value::"+s.say());

	}

}
