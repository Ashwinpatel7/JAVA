public class Deepcopy {

    public static class Node {
        int val;
        Node next;
        Node random;

        Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    // Main function to perform deep copy of a linked list
    public static Node copyDeep(Node head) {
        // Create a new node as the starting point for the deep copy
        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;

        // Create a deep copy of the linked list
        while (temp1 != null) {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }

        // Move head2 to the actual starting point of the deep copy
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;

        // Make alternate connections between original and copied nodes
        Node temp = new Node(-1);
        while (temp1 != null) {
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }

        // Reset pointers for assigning random pointers
        temp2 = head2;
        temp1 = head;

        // Assign random pointers for copied nodes
        while (temp1 != null && temp2 != null) {
            if (temp1.random == null) {
                if (temp1 != null) temp2.random = null;
            } else {
                temp2.random = temp1.random.next;
            }
            if(temp1!=null) {
                temp1 = temp1.next.next;
            }
            temp2 = temp2.next.next;
        }

        // Reset pointers for separating the list
        temp2 = head2;
        temp1 = head;

        // Separate the original and copied linked lists
        while (temp1 != null) {
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if (temp2.next == null) break;

            temp2.next = temp1.next;
            if (temp2.next == null) break;
            temp2 = temp2.next;
        }

        // Return the head of the copied linked list
        return head2;
    }

    // Main function to demonstrate the deep copy
    public static void main(String[] args) {
        // Create a sample linked list
        Node head = new Node(7);
        head.next = new Node(13);
        head.next.next = new Node(11);
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);

        // Assign random pointers
        head.random = null;
        head.next.random = head.next.next.next.next;
        head.next.next.random = head.next;
        head.next.next.next.random = head;
        head.next.next.next.next.random = head.next.next;

        // Perform deep copy of the linked list
        Node copiedHead = copyDeep(head);

        // Print the original and copied linked lists
        System.out.println("Original Linked List:");
        printList(head);

        System.out.println("\nCopied Linked List:");
        printList(copiedHead);
    }

    // Helper function to print a linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "(" + (temp.random != null ? temp.random.val : "null") + ") ");
            temp = temp.next;
        }
        System.out.println();
    }
}
