public class Solution {

    // Definition of the Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to detect a cycle in a linked list
    public boolean hasCycle(Node head) {
        // Check if the linked list is empty
        if (head == null) {
            return false;
        }

        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

        // Iterate through the linked list
        while (fast != null && fast.next != null) {
            // Move slow pointer one step at a time
            slow = slow.next;

            // Move fast pointer two steps at a time
            fast = fast.next.next;

            // Check for cycle
            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        // If we reach here, it means there is no cycle in the linked list
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        // Creating a cycle for testing
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b; // This creates a cycle

        Solution solution = new Solution();
        boolean hasCycle = solution.hasCycle(a);

        // Output the result
        if (hasCycle) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
