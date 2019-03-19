package p1;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetEx {
	public static void show()
	{
		NavigableSet<String>nset=new TreeSet<>();
		nset.add("element1");
		nset.add("element2");
		nset.add("element3");
		nset.add("element4");
		nset.add("element5");
		nset.add("abc");
		nset.add("efg");
		nset.add("123");
		nset.add("150");
		NavigableSet<String>it=nset.descendingSet();//descending set sorts data in descending format
		System.out.println( "Descending Set"+it.toString());
		System.out.println(nset);
	    /*Iterator<String>it1=nset.descendingIterator();//descending iterator no change in data
	    while(it1.hasNext())
	    {
	    	System.out.println(it1.next());
	    }*/
		NavigableSet<String>s1= nset.headSet("element4",true);
		System.out.println(s1);
		NavigableSet<String>s6= nset.headSet("element4",false);
		System.out.println(s6);
		SortedSet<String>s2=nset.headSet("150");
		System.out.println(s2);
		SortedSet<String>s3=nset.headSet("abc");
		System.out.println(s3);
		NavigableSet<String>s4= nset.tailSet("element1",false);
		System.out.println(s4);
		NavigableSet<String>s5= nset.tailSet("element1",true);
		System.out.println(s5);
		SortedSet<String>s7= nset.subSet("element2" ,"element3");
		System.out.println(s7);
		SortedSet<String>s8= nset.subSet("123" ,"150");
		System.out.println(s8);
		SortedSet<String>s9= nset.subSet("123" ,true, "123",true);
		System.out.println(s9);
		SortedSet<String>s12= nset.subSet("123" ,false, "123",false);
		System.out.println(s12);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
show();
	}
}