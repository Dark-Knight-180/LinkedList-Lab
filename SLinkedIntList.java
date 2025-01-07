// Arnav Jain
// SLinkedIntList.java
// Purpose of this lab is to manage all the functions of a gerneric linked list and give it functionality like add, get, indexOf, and more.

public class SLinkedIntList<T extends Comparable<T>> {

    sNode<T> front;

    // Default constructor
    public SLinkedIntList() {
        front = null;
    }

    // Constructor initializes the list with a single value
    public SLinkedIntList(T value) {

        front = new sNode<T>(value);
    }

    // Adds a value to the end of the list
    public void add(T value) {
        if (front == null) {
            // If the list is empty, it will initialize it with the new value
            front = new sNode<T>(value);
        } else {

            // Otherwise it will traverse to the end of the list and append the new value
            sNode<T> current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new sNode<T>(value);
        }
    }

    // Adds the value at the specified index
    public void add(int index, T value) {
        if (index < 0 || index > size() - 1) {
            // Checking for invalid index
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            // Inserts at the front
            front = new sNode<T>(value, front);
        } else {
            // Traverses to the appropriate index to insert the value
            sNode<T> current = front;
            for (int i = 0; i < size() - 1; i++) {
                if (i == index - 1) {
                    current.next = new sNode<T>(value, current.next);
                    return;
                }
                current = current.next;
            }
            current.next = new sNode<T>(value, current.next);
        }
    }

    // gets the value at the specified index
    public T get(int index) {
        if (index < 0 || index > size() - 1) {
            // Checks for invalid index
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            // Return the data at the front
            return front.data;
        } else {
            // go through to the index and return the value
            sNode<T> current = front;
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
    public int indexOf(T value) {
        sNode<T> current = front;
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
            sNode<T> current = front;
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
            sNode<T> current = front;
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

        sNode<T> entireList = front;
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
        sNode<T> current = front;
        sNode<T> index = null;
        T temp;

        if (front == null) {
            // Does nothing if the list is empty
        } else {
            // Perform a bubble sort on the linked list
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data.compareTo(index.data) > 0) {
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
