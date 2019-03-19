package p1;

import java.util.Vector;
import java.util.Enumeration;


public class VectorExample {
	public static void show()
	{
		Vector<String>list=new Vector<String>();
		System.out.println("Size"+list.size());
		System.out.println("Capacity:"+list.capacity());
		list.addElement("rama");
		list.addElement("teja");
		list.addElement("shyamala");
		System.out.println("Size"+list.size());
		System.out.println("Capacity"+list.capacity());
		Enumeration<String>it=list.elements();
		while(it.hasMoreElements())
		{
			System.out.println(it.nextElement());
		}
	}
	
	

	public static void main(String[] args) {
	
	
		// TODO Auto-generated method stub
		show();
	}
}