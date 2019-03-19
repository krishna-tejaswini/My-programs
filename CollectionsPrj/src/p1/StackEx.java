package p1;

import java.util.Stack;

public class StackEx {
	public static void show()
	{
		Stack<String>stack=new Stack<String>();
          stack.add("abc");
		stack.add("efg");
		stack.add("hij");
		System.out.println("Initial Size"+stack);
		stack.push("abc");
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.remove("efg");
		System.out.println(stack);
		stack.clone();
		System.out.println(stack);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
show();
	}

}
