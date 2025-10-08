


import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list =new LinkedList<>();
		
		list.add(44);
		list.add("saikumar");
		
		list.add("22");
		list.add("Josh");
		
		list.addFirst(33);
		list.addLast("VamshiBittu");
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println(list);

	}

}
