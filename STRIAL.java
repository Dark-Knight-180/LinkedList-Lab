//Ronit Katikaneni
//LinkedIntList Lab
//The purpose of this lab is to practice using linked lists
import java.util.*;
//create it of type T and it extended comparable
public class STRIAL<T extends Comparable<T>> {
	sNode<T> front; 
	//initialize front as type T
	// initial constructor that sets the node to null
	public STRIAL()
	{
		front = null;
	}
	//constructor with int parameter that passess it to the front node
	public STRIAL(T value)
	{
		front = new sNode<T>(value);
	}
	//adds to the end of the list
	public void add(T value)
	{
		//frist checks if the node is null and makes a new list with value if it is
		if(front == null)
		{
			front = new sNode<T>(value);
			return;
		}
		sNode<T> start = front;
		//loops through the list using size() 
		for(int i = 0; i < size() - 1; i++)
		{
			start = start.next;
		}
		//sets the end variable.next to the value
		start.next = new sNode<T>(value);

		
		
	}
	public void add(int index, T value)
	{
		//checks if adding to the front and if it is then create a new node with value,front in parameters
		if(index == 0)
		{
			front = new sNode<T>(value, front);
			return;
		}
		//check if the index is out of bounds and throw an exceotion
		if(index < 0 || index > size() - 1)
		{
			throw new IndexOutOfBoundsException();
		}
		//loop through the list
		sNode<T> start = front;
		//1 3 4 
		//1 3 5 4
		for(int i = 0; i < size() - 1; i++)
		{
			//check if the index we are at is one before the one we need to get to and insert in the list
			if(i == index - 1)
			{
				start.next = new sNode<T>(value,start.next);
				return;
			}
			start = start.next;
		}
		//if we got to the end then we just add it to where we left off
		start.next = new sNode<T>(value,start.next);
	}
	public T get(int index)
	{
		//check if index was 0
		if(index == 0)
		{
			return front.data;
		}
		//check if out of bounds
		if(index < 0 || index > size() - 1)
		{
			throw new IndexOutOfBoundsException();
		}
		//loop through list
		sNode<T> start = front;
		for(int i = 0; i < size() - 1; i++)
		{
			//check if we are 1 index before the target and if we are return the next data
			if(i == index - 1)
			{
				return start.next.data;
			}
			start = start.next;
		}
		//return the data we are at because we got to the end
		return start.next.data;
	}
	//0 1 2 3
	public void remove(int index)
	{
		//check if we are at the front and remove it 
		if(index == 0)
		{
			front = front.next;
			return;
		}
		//check if out of bounds
		if(index < 0 || index > size() - 1)
		{
			throw new IndexOutOfBoundsException();
		}
		
		//loop through list and remove if we are at one index before the target
		sNode<T> start = front;
		for(int i = 0; i < size() - 1; i++)
		{
			if(i == index - 1)
			{
				sNode<T> temp = start.next;
				start.next = temp.next;
				return;
			}
			start = start.next;
		}
		//set the end to null if we get there
		start.next = null;
		
		
	}
	public int indexOf(T value)
	{
		//loop through the list and if the data matches the value return i
		//1 9 2
		sNode<T> start = front;
		for(int i = 0; i < size() - 1; i++)
		{
			if(start.data.equals(value))
			{
				return i;
			}
			start = start.next;
		}
		//retunr size - 1 if we are at the end and then return -1 
		if(start.data.equals(value)) {
			return size() - 1;
		}
		return -1;
	}
	
	public int size()
	{
		//if it is null return 0
		if(front == null) {
			return 0;
		}
		//loop through the array and return the final size
		int size = 1;
		sNode<T> start = front;
		while(start.next != null)
		{
			size++;
			start = start.next;
		}
		return size;
		
		
	}
	//1,9,0
	//int list.val
	//int list.next.val
	//
	public void sort()
	{
		while(true)
		{
			//to check if list is sorted
			boolean sorted = true;
			sNode<T> start = front;
			//loop through the list and perfrom bubble sort by swapping
			for(int i = 0; i < size() - 1; i++)
			{
				if(start.data.compareTo(start.next.data) > 0 )
				{
					T temp = start.next.data;
					start.next.data = start.data;
					start.data = temp;
					sorted = false;
				}
				start = start.next;
			}
			//if sorted stays true then break
			if(sorted)
			{
				break;
			}
		}
	}
	//set it equal to null
	public void clear()
	{
		front = null;
	}
	public String toString()
	{
		//if empty retun []
		if(front == null)
		{ 
			return "[]";
		}
		//loop through the list and add each element with a comma
		String list = "[";
		sNode<T> start = front;
		while(start.next != null)
		{
			list = list + start.data + ", ";
			start = start.next;
		}
		list = list + start.data + "]";
		return list;
	}
	
}


