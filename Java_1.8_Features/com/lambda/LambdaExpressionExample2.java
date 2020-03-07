package com.lambda;

@FunctionalInterface
interface Drawablelamda{  
    public void draw();  
}  

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width=20;  
        
        //with lambda  
		Drawablelamda d2=()->{  
            System.out.println("Drawing using Lamba examplewwwww:::"+width);  
        };  
        d2.draw(); 

	}

}
