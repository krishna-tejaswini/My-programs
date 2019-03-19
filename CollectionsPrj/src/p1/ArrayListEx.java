package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public void showList()
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(99);
		list.add(200);
		list.add(0,100);
		list.add(0,500);
		//System.out.println(list);
		for(Integer o:list)
		{
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator <Integer>it= list.iterator();//array to backward list iterator
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("size"+list.size());
		System.out.println(list.remove(1));
		System.out.println(list);
		list.clear();
		System.out.println(list);
		list.clone();
		System.out.println(list);
		
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayListEx ex= new ArrayListEx();
		
		ex.showList();

	}

}
