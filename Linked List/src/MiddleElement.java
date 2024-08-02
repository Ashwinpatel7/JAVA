public class MiddleElement {

    // Definition of the Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node middleNode(Node head) {
        // Initialize slow and fast pointers to the head of the linked list
        Node slow = head;
        Node fast = head;

        // Move the fast pointer twice as fast as the slow pointer
        while (fast != null && fast.next != null) {// Here for the even case scenario only first condition is written that is why it is in this order
            slow = slow.next;
            fast = fast.next.next;
        }

        // At this point, the slow pointer is at the middle node
        return slow;
    }

    public static void main(String[] args) {
        // Example usage:
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        // Construct a linked list: 1 -> 2 -> 3 -> 4 -> 5
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Create an instance of MiddleElement to find the middle node
        MiddleElement middleElement = new MiddleElement();
        Node middleNode = middleElement.middleNode(a);//Shallow copy

        // Print the data of the middle node
        System.out.println("Middle Node Data: " + middleNode.data);
    }
}
