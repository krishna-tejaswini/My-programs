package p1;
//Comparable interface example
import java.util.ArrayList;
import java.util.Collections;															
public class EmployeeEx implements Comparable<EmployeeEx>
{
	String name,email;
	int exp,deptno;
	public static void main(String[] args) 
	{
	ArrayList<EmployeeEx>list=new ArrayList<EmployeeEx>();
	list.add(new EmployeeEx("teja","teja@gmail.com",5,5));
	list.add(new EmployeeEx("rama","rama@gmail.com",6,6));
	list.add(new EmployeeEx("shyamla","shyamala@gmail.com",7,7));
	list.add(new EmployeeEx("sreeram","sreeram@gmail.com",8,8));
	Collections.sort(list);
	for(EmployeeEx e1:list)
	{
		System.out.println(e1.name + " " + e1.deptno+ " "+ e1.email+" "+ e1.exp);
	}
	}
	public EmployeeEx(String name, String email, int exp, int deptno)
	{
		super();
		this.name = name;
		this.email = email;
		this.exp = exp;
		this.deptno = deptno;
	}
	//@Override=annotation 
		public int compareTo(EmployeeEx emp)
		{
			/*if(this.exp==emp.exp)
			{
				return 0;
			}
			else if(this.exp>emp.exp)
			{
				return 1;
			}
			else
			{
				return -1;
			}*/
		return(name.compareTo(emp.name));
		}
	}


	

