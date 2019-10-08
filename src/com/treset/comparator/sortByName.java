package com.treset.comparator;

import java.util.Comparator;

public class sortByName implements Comparator<person>{
	
	public int compare(person arg1,person arg2 )
	{
		return arg1.name.compareTo(arg2.name);
	}

}
