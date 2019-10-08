import java.util.ArrayList;

public class Demo {
	
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(10.25);
		l.add("jusbin");
		l.add('v');
		l.add(true);
		l.add(null);
		for(Object i:l)
		{
			System.out.println("elements are "+i);
		}
		
	}

}
