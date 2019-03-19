package p1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
	public static void showLink()
	{
		LinkedList<String>list=new LinkedList<String>();
		list.add("abc");
		list.add("efg");
		list.add("hij");
		System.out.println("Initial Size"+list.size());
		list.addFirst("123");
		list.addLast("789");
		System.out.println("New Size"+list.size());
		System.out.println(list);
		list.add(2,"456");
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.poll();
		System.out.println(list);
		list.pollFirst();
		System.out.println(list);
		list.pollLast();
		System.out.println(list);
		list.descendingIterator();//linked list backward descending  iterator ()
		System.out.println(list);
		Iterator<String>it=list.descendingIterator();
		while(it.hasNext())
		{
			
		System.out.println(it.next());
	}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showLink();
		

	}

}
