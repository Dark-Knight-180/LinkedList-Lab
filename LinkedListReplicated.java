/*
 * LinkedListReplicated.java
 * 
 */
public class LinkedListReplicated  {
 
    public static void main(String s[]) 
    {
        LinkedIntList list = new LinkedIntList();

        // Test Case 1: Empty list
        System.out.println("Test Case 1: Empty List");
        System.out.println("Size (Expected: 0): " + list.size());
        System.out.println("ToString (Expected: ''): " + list.toString());
        System.out.println();

        // Test Case 2: Add to empty list
        list.add(10);
        System.out.println("Test Case 2: Add one element (10)");
        System.out.println("Size (Expected: 1): " + list.size());
        System.out.println("ToString (Expected: '10'): " + list.toString());
        System.out.println();

        // Test Case 3: Add multiple elements
        list.add(20);
        list.add(30);
        System.out.println("Test Case 3: Add multiple elements (20, 30)");
        System.out.println("Size (Expected: 3): " + list.size());
        System.out.println("ToString (Expected: '10, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 4: Get an element
        System.out.println("Test Case 4: Get element at index 1 (Expected: 20)");
        System.out.println("Get(1): " + list.get(1));
        System.out.println();

        // Test Case 5: IndexOutOfBoundsException (get)
        System.out.println("Test Case 5: Try to get out-of-bounds index (Expected: Exception)");
        try {
            System.out.println(list.get(5)); // Out of bounds
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println();

        // Test Case 6: Add at specific index
        list.add(1, 15); // Add 15 at index 1
        System.out.println("Test Case 6: Add at specific index (1, 15)");
        System.out.println("Size (Expected: 4): " + list.size());
        System.out.println("ToString (Expected: '10, 15, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 7: Add at the start
        list.add(0, 5); // Add 5 at index 0
        System.out.println("Test Case 7: Add at the start (0, 5)");
        System.out.println("Size (Expected: 5): " + list.size());
        System.out.println("ToString (Expected: '5, 10, 15, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 8: Remove an element
        list.remove(2); // Remove element at index 2 (15)
        System.out.println("Test Case 8: Remove element at index 2");
        System.out.println("Size (Expected: 4): " + list.size());
        System.out.println("ToString (Expected: '5, 10, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 9: Remove the first element
        list.remove(0); // Remove first element (5)
        System.out.println("Test Case 9: Remove the first element");
        System.out.println("Size (Expected: 3): " + list.size());
        System.out.println("ToString (Expected: '10, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 10: Remove the last element
        list.remove(2); // Remove last element (30)
        System.out.println("Test Case 10: Remove the last element");
        System.out.println("Size (Expected: 2): " + list.size());
        System.out.println("ToString (Expected: '10, 20'): " + list.toString());
        System.out.println();

        // Test Case 11: Edge Case - Remove from empty list
        System.out.println("Test Case 11: Try to remove from empty list (Expected: Exception)");
        list.clear();
        try {
            list.remove(0); // List is empty now
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println();

        // Test Case 12: IndexOf method
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Test Case 12: IndexOf method");
        System.out.println("IndexOf(20) (Expected: 1): " + list.indexOf(20));
        System.out.println("IndexOf(40) (Expected: -1): " + list.indexOf(40)); // Non-existent value
        System.out.println();

        // Test Case 13: Clear the list
        list.clear();
        System.out.println("Test Case 13: Clear the list");
        System.out.println("Size (Expected: 0): " + list.size());
        System.out.println("ToString (Expected: ''): " + list.toString());
        System.out.println();

        // Test Case 14: Sorting the list
        list.add(30);
        list.add(10);
        list.add(20);
        System.out.println("Test Case 14: Sorting the list");
        list.sort();
        System.out.println("ToString (Expected: '10, 20, 30'): " + list.toString());
        System.out.println();

        // Test Case 15: Edge Case - Single element
        list.clear();
        list.add(100);
        System.out.println("Test Case 15: List with a single element");
        System.out.println("Size (Expected: 1): " + list.size());
        System.out.println("ToString (Expected: '100'): " + list.toString());
        System.out.println();

        LinkedIntList list2 = new LinkedIntList(10);

        System.out.println(list2.toString());
        list2.clear();
        // Test Case 1: Empty list
        System.out.println("Test Case 1: Empty List");
        System.out.println("Size (Expected: 0): " + list2.size());
        System.out.println("ToString (Expected: ''): " + list2.toString());
        System.out.println();

        // Test Case 2: Add to empty list
        list2.add(10);
        System.out.println("Test Case 2: Add one element (10)");
        System.out.println("Size (Expected: 1): " + list2.size());
        System.out.println("ToString (Expected: '10'): " + list2.toString());
        System.out.println();

        // Test Case 3: Add multiple elements
        list2.add(20);
        list2.add(30);
        System.out.println("Test Case 3: Add multiple elements (20, 30)");
        System.out.println("Size (Expected: 3): " + list2.size());
        System.out.println("ToString (Expected: '10, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 4: Get an element
        System.out.println("Test Case 4: Get element at index 1 (Expected: 20)");
        System.out.println("Get(1): " + list2.get(1));
        System.out.println();

        // Test Case 5: IndexOutOfBoundsException (get)
        System.out.println("Test Case 5: Try to get out-of-bounds index (Expected: Exception)");
        try {
            System.out.println(list2.get(5)); // Out of bounds
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println();

        // Test Case 6: Add at specific index
        list2.add(1, 15); // Add 15 at index 1
        System.out.println("Test Case 6: Add at specific index (1, 15)");
        System.out.println("Size (Expected: 4): " + list2.size());
        System.out.println("ToString (Expected: '10, 15, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 7: Add at the start
        list2.add(0, 5); // Add 5 at index 0
        System.out.println("Test Case 7: Add at the start (0, 5)");
        System.out.println("Size (Expected: 5): " + list2.size());
        System.out.println("ToString (Expected: '5, 10, 15, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 8: Remove an element
        list2.remove(2); // Remove element at index 2 (15)
        System.out.println("Test Case 8: Remove element at index 2");
        System.out.println("Size (Expected: 4): " + list2.size());
        System.out.println("ToString (Expected: '5, 10, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 9: Remove the first element
        list2.remove(0); // Remove first element (5)
        System.out.println("Test Case 9: Remove the first element");
        System.out.println("Size (Expected: 3): " + list2.size());
        System.out.println("ToString (Expected: '10, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 10: Remove the last element
        list2.remove(2); // Remove last element (30)
        System.out.println("Test Case 10: Remove the last element");
        System.out.println("Size (Expected: 2): " + list2.size());
        System.out.println("ToString (Expected: '10, 20'): " + list2.toString());
        System.out.println();

        // Test Case 11: Edge Case - Remove from empty list
        System.out.println("Test Case 11: Try to remove from empty list (Expected: Exception)");
        list2.clear();
        try {
            list2.remove(0); // list2 is empty now
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }
        System.out.println();

        // Test Case 12: IndexOf method
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println("Test Case 12: IndexOf method");
        System.out.println("IndexOf(20) (Expected: 1): " + list2.indexOf(20));
        System.out.println("IndexOf(40) (Expected: -1): " + list2.indexOf(40)); // Non-existent value
        System.out.println();

        // Test Case 13: Clear the list2
        list2.clear();
        System.out.println("Test Case 13: Clear the list2");
        System.out.println("Size (Expected: 0): " + list2.size());
        System.out.println("ToString (Expected: ''): " + list2.toString());
        System.out.println();

        // Test Case 14: Sorting the list
        list2.add(30);
        list2.add(10);
        list2.add(20);
        System.out.println("Test Case 14: Sorting the list");
        list2.sort();
        System.out.println("ToString (Expected: '10, 20, 30'): " + list2.toString());
        System.out.println();

        // Test Case 15: Edge Case - Single element
        list2.clear();
        list2.add(100);
        System.out.println("Test Case 15: List with a single element");
        System.out.println("Size (Expected: 1): " + list2.size());
        System.out.println("ToString (Expected: '100'): " + list2.toString());
        System.out.println();
    }
    
}
