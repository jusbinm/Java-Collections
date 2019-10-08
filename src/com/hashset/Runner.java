package com.hashset;
import java.util.HashSet;
public class Runner {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(52.250);
		h.add(5.2f);
		h.add(23l);
		h.add(null);
		System.out.println(h);
		//Hashset does not maintain insertion order
		//it has four constructor
		//no arg
		//initial cap
		//initial cap and float fillrate
		//and one which accepts collection  args also
	}
}
