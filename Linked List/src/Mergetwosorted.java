public class Mergetwosorted {

    // Definition of the Node class
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // better approach with O(1) time complexity
    public Node MergeTwoLists(Node head1,Node head2){
        Node t1=head1;
        Node t2 = head2;
        Node head = new Node(100);
        Node  t=head;
        while(t1!=null&&t2!=null) {
            if (t1.val < t2.val) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
            if (t1==null){
                t.next=t2;
            }
            else {
                t.next=t1;
            }
            return head.next;
        }


    // Method to merge two sorted linked lists
    public Node mergeTwoLists(Node head1, Node head2) {
        Node dummy = new Node(0); // Dummy node to simplify code
        Node current = dummy; // Pointer to the current node in the merged list

        Node temp1 = head1;
        Node temp2 = head2;

        // Iterate until either of the lists is exhausted
        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                current.next = new Node(temp1.val);
                temp1 = temp1.next;
            } else {
                current.next = new Node(temp2.val);
                temp2 = temp2.next;
            }
            current = current.next; // Move to the next node in the merged list
        }

        // If there are remaining nodes in the first list, append them
        if (temp1 != null) {
            current.next = temp1;
        }

        // If there are remaining nodes in the second list, append them
        if (temp2 != null) {
            current.next = temp2;
        }

        return dummy.next; // Return the merged list starting from the next of the dummy node
    }

    public static void main(String[] args) {
        // Example usage
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(5);

        Node b1 = new Node(2);
        Node b2 = new Node(4);
        Node b3 = new Node(6);

        a1.next = a2;
        a2.next = a3;

        b1.next = b2;
        b2.next = b3;

        Mergetwosorted mergetwosorted = new Mergetwosorted(); // Fix class name
        Node mergedList = mergetwosorted.MergeTwoLists(a1, b1);

        // Print the merged list
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
