package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
	public static void show()
	{
		List<String>list=new ArrayList<String>();
		list.add("123");
		list.add("A1");
		list.add("B1");
		String str1[]=new String[list.size()];
		list.toArray(str1);
		System.out.println(str1);
		System.out.println(Arrays.toString(str1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
show();
	}

}
