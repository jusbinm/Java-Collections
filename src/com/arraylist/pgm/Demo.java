package com.arraylist.pgm;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(null);
		l.add(19);
		l.add("jusbin");
		l.add("jusbin");
		//we can add duplicate elements in arrraylist the insertion
		//order is maintained
		for(Object i:l)
		{
			System.out.println(i);
		}
		//for loop to fetch data from the arraylist
		for(int i=0;i<l.size();i++)
		{
			System.out.println(i+"th element is "+l.get(i));
		}
		//to check eheather an element is present or not
		System.out.println("19 contains "+l.contains(19));
		//to print the size of the arraylist
		System.out.println("the current size of the arraylist is "+l.size());
		//checking wheather its empty or not
		System.out.println("is it empty "+l.isEmpty());
		//adding an item in the arraylist
		l.add(0, "element");//it means add an element
		System.out.println("after adding operation "+l);
		l.set(0, "hai");//means setting an element
		System.out.println("after setting operation"+l);
		System.out.println("=====================================");
		
		
		
		//indexof() can be usd to check an index of an element
		System.out.println("index of 19 is "+l.indexOf(19));
		//we can check last index of multiple items tooo
		System.out.println("last index of jusbin is "+l.lastIndexOf("jusbin"));
		
		
		//we can remove elements also
		
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		l.remove("jusbin");
		
		
		
	}
}
