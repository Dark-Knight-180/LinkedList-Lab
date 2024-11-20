// Arnav Jain
// LinkedIntList.java
// Purpose of this lab is to manage all the functions of a linkedlist like add, get, indexOf, and more. This is very important as it gives the linkedlist functionality and allows us to modify the list.

public class LinkedIntList {

    ListNode front;

    public LinkedIntList() {

        front = null;
    }

    public LinkedIntList(int value) {

        front = new ListNode(value);

    }

    public void add(int value) {

        if (front == null) {

            front = new ListNode(value);

        } else {

            ListNode current = front;

            while (current.next != null) {

                current = current.next;

            }

            current.next = new ListNode(value);

        }

    }

    public void add(int index, int value) {

        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {

            front = new ListNode(value, front);

        } else {

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

    public int get(int index) {

        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            return front.data;
        } else {
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

    public int indexOf(int value) {

        ListNode current = front;
        for (int i = 0; i < size(); i++) {
            if (current.data == value) {
                return i;
            }
            current = current.next;
        }
        return -1;

    }

    public void remove(int index) {

        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            front = front.next;
        } else {
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

    public int size() {

        int size = 1;
        if (front == null) {
            return 0;
        } else {
            ListNode current = front;

            while (current.next != null) {
                size++;
                current = current.next;
            }
        }
        return size;
    }

    public String toString() {

        ListNode entireList = front;

        String list = "";
        while (entireList.next != null) {
            list += entireList.data + ", ";
            entireList = entireList.next;
        }
        list += entireList.data;
        return list;

    }

    public void clear() {

        front = null;

    }

    public void sort() {

        ListNode current = front;
        ListNode index = null;
        int temp;

        if (front == null) {
        } else {
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
