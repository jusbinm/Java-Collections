package TreeSet;
import java.util.TreeSet;
public class Runner 
{
	public static void main(String[] args) {
		TreeSet<Person> t=new TreeSet<Person>();
		Person p=new Person("jusbin",23);
		Person p1=new Person("Thomas",32);
		Person p2=new Person("john",33);
		t.add(p);
		t.add(p1);
		t.add(p2);
		for(Person i:t)
		{
			System.out.println(i);
		}
	}
}
