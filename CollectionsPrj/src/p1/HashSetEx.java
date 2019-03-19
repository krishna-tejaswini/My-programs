package p1;
//hashset is used to see duplicates are removed are not irrespective of order
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {
	// converting set to array
public static void showSet()
{
	Set<String>hset=new HashSet<String>();
	hset.add("ABC");
	hset.add(null);
	hset.add("abc");
	hset.add(null);
	hset.add("123");
	hset.add("A123B");
	hset.add("abc");
	hset.add("123");
	hset.remove("123");
	hset.add(null);//null=information missing
	System.out.println(hset);
	 Iterator<String> it= hset.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
}
}

public static void showTreeSet()
{
	Set<String>tset=new TreeSet<String>();
	tset.add("ABC");
//	tset.add(null);
	tset.add("ab");
	//tset.add(null);
	tset.add("123");
	tset.add("A123B");
	tset.add("abc");
	tset.add("123");
	//tset.add(null);//null=information missing
	System.out.println(tset);
	
	 Iterator<String> it= tset.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
     }
}
public static void show()
{
	Set<String>hset=new LinkedHashSet<String>();
	hset.add("ABC");
	hset.add(null);
	hset.add("abc");
	hset.add(null);
	hset.add("123");
	hset.add("A123B");
	hset.add("abc");
	hset.add("123");
	
	hset.add(null);//null=information missing
	System.out.println(hset);
	 Iterator<String> it= hset.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
}
}
	public static void main(String[] args) {
showSet();
showTreeSet();
show();
	}

}
