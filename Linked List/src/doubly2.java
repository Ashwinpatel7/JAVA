public class doubly2 {
    public static class Node {
        int val;
        doublyLinkedlist.Node next;
        doublyLinkedlist.Node prev;

        Node(int val) {
            this.val = val;
        }
    }
    public static void Display(doublyLinkedlist.Node head){
        doublyLinkedlist.Node temp=head;
        while (temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        doublyLinkedlist.Node a  = new doublyLinkedlist.Node(7);
        doublyLinkedlist.Node b  = new doublyLinkedlist.Node(10);
        doublyLinkedlist.Node c  = new doublyLinkedlist.Node(11);
        doublyLinkedlist.Node d  = new doublyLinkedlist.Node(14);
        doublyLinkedlist.Node e  = new doublyLinkedlist.Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
//        Display(a);
//        revDisplay(e);
//        ranDisplay(c);
//
//        System.out.println(a.next.next.val);
        Display(a);

}

}
