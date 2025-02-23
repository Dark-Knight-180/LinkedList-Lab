// Arnav Jain
// LinkedIntList.java
// Purpose of this lab is to manage all the functions of a linked list and give it functionality like add, get, indexOf, and more.

public class LinkedIntList {

    ListNode front;

    // Default constructor
    public LinkedIntList() {
        front = null;
    }

    // Constructor initializes the list with a single value
    public LinkedIntList(int value) {
        front = new ListNode(value);
    }

    // Adds a value to the end of the list
    public void add(int value) {
        if (front == null) {
            // If the list is empty, it will initialize it with the new value
            front = new ListNode(value);
        } else {

            // Otherwise it will traverse to the end of the list and append the new value
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // Adds the value at the specified index
    public void add(int index, int value) {
        if (index < 0 || index > size() - 1) {
            // Checking for invalid index
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            // Inserts at the front
            front = new ListNode(value, front);
        } else {
            // Traverses to the appropriate index to insert the value
            ListNode current = front;
            for (int i = 0; i < size() - 1; i++) {
                if (i == index - 1) {
                    current.next = new ListNode(value, current.next);
                    return;
                }
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    // gets the value at the specified index
    public int get(int index) {
        if (index < 0 || index > size() - 1) {
            // Checks for invalid index
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            // Return the data at the front
            return front.data;
        } else {
            // go through to the index and return the value
            ListNode current = front;
            for (int i = 0; i < size() - 1; i++) {
                if (i == index) {
                    return current.data;
                }
                current = current.next;
            }
            return current.data;
        }
    }

    // Finds the index of a specified value
    public int indexOf(int value) {
        ListNode current = front;
        for (int i = 0; i < size(); i++) {
            if (current.data == value) {
                return i;
            }
            current = current.next;
        }
        // Return -1 if the value is not found
        return -1;
    }

    // Removes the value at the specified index
    public void remove(int index) {
        if (index < 0 || index > size() - 1) {
            // Check for invalid index
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            // Remove the front element
            front = front.next;
        } else {
            // go through the list to the index and removes the element
            ListNode current = front;
            for (int i = 0; i < size() - 1; i++) {
                if (i == index - 1) {
                    current.next = current.next.next;
                    return;
                }
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    // Returns the size of the linked list
    public int size() {
        int size = 1;
        if (front == null) {
            return 0;
        } else {
            // Counts the number of nodes in the list
            ListNode current = front;
            while (current.next != null) {
                size++;
                current = current.next;
            }
        }
        return size;
    }

    // Converts the linked list into a string
    public String toString() {
		if (front == null) {
			return "";
		}	
		
		ListNode entireList = front;
        String list = "";
        while (entireList.next != null) {
            list += entireList.data + ", ";
            entireList = entireList.next;
        }
        list += entireList.data;
        return list;
    }

    // Clears the linked list
    public void clear() {
        front = null;
    }

    // Sorts the linked list in ascending order
    public void sort() {
        ListNode current = front;
        ListNode index = null;
        int temp;

        if (front == null) {
            // Does nothing if the list is empty
        } else {
            // Perform a bubble sort on the linked list
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
}