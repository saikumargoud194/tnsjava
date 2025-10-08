 

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stc = new Stack<>();
		
		stc.push(20);
		
		stc.add("sai");
		
		stc.addFirst("nani");
		
		stc.addLast("bittu");
		
		System.out.println(stc);
		
		stc.pop();
		stc.pop();
		System.out.println("Stack Elements: "+stc);
		
		System.out.println("Top of the Stack: "+stc.peek());
	}

}
