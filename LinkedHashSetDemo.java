 
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet<>();
		
		lhs.add(44);
		lhs.add("Nani");
		
		lhs.add(33);
		lhs.add("saikumar");
		System.out.println(lhs);
		
		lhs.add("nani");
		lhs.add("vamshi");

	}

}
