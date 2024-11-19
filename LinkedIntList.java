// Arnav Jain
// LinkedIntList.java
// Purpose of this lab is to manage all the functions of a linkedlist like add, get, indexOf, and more. This is very important as it gives the linkedlist functionality and allows us to modify the list.


public class LinkedIntList {

	ListNode front;
	ListNode current;
	
	public LinkedIntList() {
		
		front = null;
	}
	
	public LinkedIntList(int value) {
		
		front = new ListNode(value);
		
	}
	
	public void add(int value) {
		
		if(front == null) {
			
			front = new ListNode(value);
			
		}
		else {
			
			front.next = new ListNode(value);
			
		}
		
	}
	
	public void add(int index, int value) {
		
	}
	
	public int get(int index) {
		
		return index;
		
	}
	
	public int indexOf (int value) {
		
		return value;
		
	}
	
	public int remove(int index) {
		
		return index;
		
	}
	
	public int size() {
		
		return 0;
		
	}
	
	public String toString( ) {
		
		String list = "";
		while(start.next != null) {
			list += start
		}
		return start.data + ", " + start.next.data;
		
	}
}
