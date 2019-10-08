package com.vector;
//nitially importing vector
import java.util.Vector;
public class Runner {
	public static void main(String[] args) {
		//we are checking the whole 4 constructors of vector
		//0 arg constructor
		Vector v1=new Vector();
		
		//initial cap constructor
		Vector v2=new Vector(5);
		
		//int cap and incremental cap
		Vector v3=new Vector(5,100);
		 
		//constructor with collection c arg so that we can add one collection
		//to this vector
		Vector v4=new Vector(v1);
		
		//vector is called as legacy collection because its old
	}
}
