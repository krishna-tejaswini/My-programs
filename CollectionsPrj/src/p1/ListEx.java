package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListEx {
public static void showData()
{
	
	String[] schoolbag = new String[4];
	List<String>list=new ArrayList<>();
	 
	 schoolbag[0] = "Books";
	 schoolbag[1] = "Pens";
	 schoolbag[2] = "Pencils";
	 schoolbag[3] = "Notebooks";
	 
	 list=Arrays.asList(schoolbag);
	 ListIterator<String>it=list.listIterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 String str[]=new String[list.size()];
	 list.toArray(str);
	 System.out.println(str);
	 System.out.println(Arrays.toString(str));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
showData();
	}

}
