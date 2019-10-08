package TreeSet;

public class Person implements Comparable<Person>
{
	String name;
	Integer age;
	Person(String name,Integer age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	public int compareTo(Person arg)
	{
		return this.name.compareTo(arg.name);
	}
	public String toString()
	{
		return name+" age is "+age;
	}
	
	
}
