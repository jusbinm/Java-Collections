package com.statck;
//importing stack class
import java.util.Stack;
public class Runner {
	public static void main(String[] args) {
		//it is called as a legacy collection because it is old and it is also 
		//extends vector
		Stack s =new Stack();
		s.push(50);
		s.push(20.23);
		s.push("jusbin");
		s.push("jusbin");
		s.push("again jusbin");
		s.push(null);
		System.out.println(s);
		
	}

}
