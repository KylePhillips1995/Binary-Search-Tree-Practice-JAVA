//Kyle Phillips
import java.util.*;
public class Queue<type> {
	private LinkedList<type>list;
	public Queue()
	{
		list = new LinkedList<type>();
	}
	public void enqueue(type object)
	{
		list.add(object);
		
	}
	public type dequeue()
	{
		if( list.size()>0)
			return list.removeFirst();
		else
			System.out.println("List is empty");
		return null;
	}
	public boolean isEmpty()
	{
		if(list.size()==0)
			return true;
		else
			return false;
	}
}
