public class DeleteMiddleElement {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Deletes the middle node of a given linked list.
     *
     * @param head The head of the linked list.
     * @return The head of the modified linked list after deletion.
     */
    public Node deleteMiddleNode(Node head) {
        if (head == null || head.next == null) {
            return null; // Handle empty or single-node list
        }

        // Use two pointers, slow and fast, to find the middle node
        Node slow = head;
        Node fast = head;

        // Move fast pointer twice as fast as slow pointer
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Bypass the middle node by updating slow's next pointer
        slow.next = slow.next.next;

        return head; // Return the modified list
    }

    public static void main(String[] args) {
        // Create a sample linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Delete the middle node
        DeleteMiddleElement deleteMiddleElement = new DeleteMiddleElement();
        head = deleteMiddleElement.deleteMiddleNode(head);

        // Print the modified linked list
        System.out.println("Modified linked list:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
