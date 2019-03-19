package p1;
import java.util.Iterator;
//queue interface is an ordered collection not sorted collection
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{
	public static void showQueue()
	{
		/*Queue<Integer>q1=new LinkedList<>();
		q1.add(234);
		q1.add(12);
		q1.add(100);
		q1.add(23);
		q1.add(234);
		q1.add(56);
		System.out.println(q1);
		q1.remove(123);
		System.out.println(q1);
		q1.remove();
		System.out.println(q1.isEmpty());
		System.out.println("Contains"+q1.contains(123));
		System.out.println(q1);
		System.out.println(q1.poll());//poll and remove is same
		System.out.println(q1);
		System.out.println("peek"+q1.peek());//shows first element
		System.out.println("offer"+q1.offer(1));
		System.out.println(q1);
		System.out.println("size"+q1.size());
		System.out.println(q1);
		System.out.println("element"+q1.element());
		for(int i:q1)
		{
			System.out.println(i);
		}*/
		/*Queue<String>q1=new LinkedList<>();
		q1.add("hari");
		q1.add("Hari");
		q1.add("sri");
		q1.add("teja");
		System.out.println(q1);
		System.out.println(" Peek "+q1.peek());
		Iterator<String>it=q1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		Queue<String>q1=new PriorityQueue<>();
		q1.add("hari");
		q1.add("Hari");
		q1.add("Anil");
		q1.add("Teja");
		q1.add("234");
		q1.add("12");
		q1.add("100");
		q1.add("23");
		System.out.println(q1);
		System.out.println(" Peek "+q1.peek());
		Iterator<String>it=q1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("poll"+q1.poll());
		Queue<Integer>q2=new PriorityQueue<>();
		q2.add(234);
		q2.add(12);
		q2.add(100);
		q2.add(23);
		q2.add(234);
		q2.add(56);
		System.out.println(q2);
	}
	public static void main(String[] args) 
	{
	showQueue();	
	}

}
