// Arnav Jain
// SLinkedListReplicated.java
// The purpose of this file is to test all the functions of the SLinkedIntList class.

public class SLinkedListReplicated {

    public static void main(String[] args) {
        // Create the linked list
        sNode<Integer> head = new sNode<>(9);
        head.next = new sNode<>(8);
        head.next.next = new sNode<>(7);
        head.next.next.next = new sNode<>(6);
        head.next.next.next.next = new sNode<>(5);
        head.next.next.next.next.next = new sNode<>(4);
        head.next.next.next.next.next.next = new sNode<>(3);
        head.next.next.next.next.next.next.next = new sNode<>(2);

        System.out.println("Original List:");
        printList(head);

        // Sort the linked list
        head = sortLinkedList(head);

        System.out.println("\nSorted List:");
        printList(head);
    }

    // Bubble Sort for Linked List
    public static sNode<Integer> sortLinkedList(sNode<Integer> head) {

        if(head == null || head.next == null) {
            return head;
        }
        for(sNode<Integer> i = head; i != null; i = i.next) {
            for(sNode<Integer> j = head; j.next != null; j = j.next) {
                if(j.data > j.next.data) {
                    int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
                }
            }
            }
        return head;
    }

    // Utility function to print the linked list
    public static void printList(sNode<Integer> head) {
        sNode<Integer> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}