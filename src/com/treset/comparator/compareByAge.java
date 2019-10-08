package com.treset.comparator;

import java.util.Comparator;

public class compareByAge implements Comparator<person> {
	
	public int compare(person arg1,person arg2)
	{
		return arg1.age.compareTo(arg2.age);
	}

}
