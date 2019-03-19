package p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Employee
{
String name,email;
int deptno,exp;
public Employee(String name,String email,int deptno,int exp)
{
	super();
	this.name = name;
	this.email = email;
	this.deptno = deptno;
	this.exp = exp;
}	
}
class emailComparator implements Comparator<Employee>
{
	
	public int compare(Employee o1,Employee o2)
	{
		return(o1.email.compareTo(o2.email));
	}
}
class nameComparator implements Comparator<Employee>
{
	
	public int compare(Employee o1,Employee o2)
	{
		return(o1.name.compareTo(o2.name));
	}
}
class deptnoComparator implements Comparator<Employee>
{
	
	public int compare(Employee o1,Employee o2)
	{
		if(o1.deptno>o2.deptno)
		{
			return 1;
		}
		else if(o1.deptno==o2.deptno)
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
	class expComparator implements Comparator<Employee>
	{
		@Override
		public int compare(Employee o1, Employee o2) {
		    if(o1.exp>o2.exp)
		    {
			return 1;
		    }
		    else if(o1.exp==o2.exp)
		    {
		    	return 0;
		    }
		    else
		    {
		    	return -1;
		    }
		    	
    }
	}

public class Driver {
	public static void main(String[] args) {
		List<Employee>list=new ArrayList<>();
		list.add(new Employee("tej","tej@gmail.com",43,10));
		list.add(new Employee("vasavi","vasavi@gmail.com",35,12));
		list.add(new Employee("niyati","niyati@gmail.com",21,12));
		Employee[] str = new Employee[list.size()];
		 list.toArray(str);
		 System.out.println(str.toString());
		 System.out.println(Arrays.toString(str));
		 Arrays.sort(str);
		 for(int i=0;i<str.length;i++)
		 {
			 System.out.println(str[i].exp);
		 }
		list.add(new Employee("tej","tej@gmail.com",43,10));
		list.add(new Employee("vasavi","vasavi@gmail.com",35,12));
		list.add(new Employee("niyati","niyati@gmail.com",21,12));
		System.out.println("Email wise comparison");
		Collections.sort(list,new emailComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.email+ " "+e1.name);
		}
		System.out.println("Experience wise comparison");
		Collections.sort(list,new expComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.exp+ " "+e1.email);
		}
		System.out.println("name wise comparison");
		Collections.sort(list,new expComparator());
		for(Employee e1:list)
		{
			System.out.println(e1.name+ " "+e1.exp);
		}
		System.out.println("Dept wise comparison");
		for(Employee e1:list)
		{
			System.out.println(e1.deptno+ " "+e1.name);
		}
		
	}

}
