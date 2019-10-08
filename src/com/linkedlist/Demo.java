package com.linkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
public class Demo{
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("jusbin");
		l.add("jusbin");
		l.add(null);;
		l.add(true);
		System.out.println(l.get(2));
		System.out.println(l);
		LinkedList l1=new LinkedList();
		System.out.println(l1.addAll(l));
		System.out.println("array contains list"+l1.containsAll(l));
		//here i am adding another element in between
		l1.add(1,"hai");
		System.out.println("after adding an element in between"+l1);
		System.out.println("array contains list"+l1.containsAll(l));
		System.out.println("list contains array"+l.containsAll(l1));
		System.out.println("removing list from the array");
		l1.remove(l);
		System.out.println("after removing array from the list"+l);
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//to check wheather this containsall works only based on objects only
		ArrayList l2=new ArrayList();
		l2.add(10); l2.add("jusbin"); l2.add("jusbin"); l2.add(null); l2.add(true);
		System.out.println(l2.containsAll(l));
		
		
		//yes beo it is besed on objects only nothing else
		

		
		
	}
}
