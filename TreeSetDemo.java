
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
	TreeSet<String> ts =new TreeSet<>();
	
	
	ts.add("saikumar");
	ts.add("vamshi bittu");
	ts.add("11");
	ts.add("arjun Reddy");
	ts.add("nani");
	System.out.println(ts);
	
	System.out.println(ts.getFirst());
	
	System.out.println(ts.getLast());
	
	System.out.println(ts.removeFirst());
	System.out.println(ts.removeLast());
	
	System.out.println(ts);

	

	}

}
