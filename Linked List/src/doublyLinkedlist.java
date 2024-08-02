public class doublyLinkedlist {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void Display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void revDisplay(Node tail){
        Node temp=tail;
        while (temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void ranDisplay(Node random){
        Node temp= random;
        while(temp.prev!=null) {
            temp = temp.prev;
        }
        while (temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static Node insertionHead(Node head,int x){
        Node t = new Node(x);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
    }
    public static void insertail(Node head,int x){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node t = new Node(x);
        t.prev=temp;
        temp.next=t;
    }
    public static void insertAtIdx(Node head,int x ,int index){
        Node s =head;
        for (int i=1; i<=index-1;i++){
            s=s.next;
        }
        Node r =s.next;
        Node t = new Node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;
    }

    public static void main(String[] args) {
        Node a  = new Node(7);
        Node b  = new Node(10);
        Node c  = new Node(11);
        Node d  = new Node(14);
        Node e  = new Node(13);
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
        insertAtIdx(a,30,2);
        Display(a);
    }
}
