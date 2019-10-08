package com.treset.comparator;
import java.util.TreeSet;
public class Runner {
	public static void main(String[] args) {
		sortByName name=new sortByName();
		compareByAge age=new compareByAge();
		person p=new person("jusbin",23);
		person p1=new person("thomas",32);
		person p2=new person("rajeev",19);
		TreeSet<person> l=new TreeSet<person>(age);
		l.add(p);
		l.add(p1);
		l.add(p2);
		for(person obj:l)
		{
			System.out.println("name is "+obj.name+" and age is "+obj.age);
		}
		
		
		
	}
}
