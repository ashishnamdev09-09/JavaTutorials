package QueuesDemo;

import java.util.*;

public class Dequeuefunctions {

	public static void main(String[] args) {
		Deque<String> dequeue = new LinkedList<String>();
		
		dequeue.add("A");
		dequeue.add("B");
		dequeue.add("C");
		dequeue.add("D");
		dequeue.add("E");
		
		System.out.println(dequeue);
		
		//adding  element at first
		dequeue.addFirst("this is add First method");
		System.out.println(dequeue);
		//adding element at last 
		dequeue.addLast("this is add Last method");
		System.out.println(dequeue);
		
		//contains method
		System.out.println("Does Dequeue contains A : "+dequeue.contains("A"));
		
		//
		
		
		//list iterator 
		ListIterator<String> listitr=null;
		List<String> mobPhone= new ArrayList<String>();
		mobPhone.add("A");
		mobPhone.add("B");
		mobPhone.add("C");
		mobPhone.add("D");
		
		listitr=mobPhone.listIterator();
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		System.out.println("----------------------------");
		while(listitr.hasPrevious()) {
			System.out.println(listitr.previous());
		}
}

}
