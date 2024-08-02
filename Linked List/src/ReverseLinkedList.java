public class ReverseLinkedList {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Display the linked list
    public static void Displaylist(Node head) {
        if (head == null) return;
        System.out.print(head.val + " ");
        Displaylist(head.next);
    }

    // Reverse the linked list recursively
    public static Node reverse(Node head) {
        if (head.next == null) return head; // Base case
        Node newhead = reverse(head.next);
        head.next.next = head; // Changing the connections
        head.next = null;
        return newhead;
    }

    // Check if a linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        // Move slow and fast pointers to find the middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node reversedSecondHalf = reverse(slow.next);
        slow.next = reversedSecondHalf;

        Node p1 = head;
        Node p2 = slow.next;

        // Compare values of the first and reversed second halves
        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    // Find the maximum sum of pairs in a linked list
    public static int pairSum(Node head) {
        Node slow = head;
        Node fast = head;

        // Move slow and fast pointers to find the middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the list
        Node reversedSecondHalf = reverse(slow.next);
        slow.next = reversedSecondHalf;

        int maxSum = 0;
        Node p1 = head;
        Node p2 = slow.next;

        // Calculate the sum of pairs
        while (p2 != null) {
            int sum = p1.val + p2.val;
            if (sum > maxSum) maxSum = sum;
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }

    // Reverse the linked list iteratively
    public static Node reverseIterative(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static Node oddEvenlist(Node head){
        Node even =new Node(0);
        Node odd = new Node(0);
        Node tempo = odd;
        Node tempe =even;
        Node temp =head;
        while(temp!=null){
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if (temp==null) break;
            temp=temp.next;
            tempe=tempe.next;

        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;
    }


        public static void main (String[]args){
            // Create a sample linked list: 3 -> 5 -> 1 -> 2 -> 4 -> 6
            Node a = new Node(3);
            Node b = new Node(5);
            Node c = new Node(1);
            Node d = new Node(2);
            Node e = new Node(4);
            Node f = new Node(6);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            // Reverse the linked list and display it
            a = reverseIterative(a);
            Displaylist(a);

            // Check if the linked list is a palindrome
            boolean isPalindrome = isPalindrome(a);
            System.out.println("\nIs Palindrome: " + isPalindrome);

            // Find and display the maximum pair sum
            int maxSum = pairSum(a);
            System.out.println("Maximum Pair Sum: " + maxSum);

            Node result = oddEvenlist(a);
            System.out.println("\nModified Linked List (Odd Even Separated):");
            Displaylist(result);
        }
    }

