public class circularLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }

    }
    public static void Display(Node head) {
        Node temp = head.next;
        while (temp != null) {
            System.out.println(head.val + " "+temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;
        Display(a);




    }
}
