//program using linkedlist(list iterator) and generic,collections(iterators)
package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void showList()
	{
		List<String>list=new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("1234");
		list.add("Null");
		list.add(null);//list allows null and null can be duplicated
		System.out.println("In Forward Direction");
		ListIterator<String>it=list.listIterator();
		while(it.hasNext())
		{
			
		System.out.println(it.next());
	}
		System.out.println("In Backward Direction");
      
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
showList();
	}

}
