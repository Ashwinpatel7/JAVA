public class nthNodefromend {
    public static class Node{
        public static Node nthNode(Node head,int n){
            int size=0;
            Node temp = head;
            while(temp!=null){
                size++;
                temp=temp.next;
            }
            int m =size-n+1;
            temp=head;
            for (int i =1;i<=m-1;i++){
                temp=temp.next;
            }
            return temp;


        }
        public static Node NthNode(Node head,int n){
            Node slow=head;
            Node fast = head;
            for (int i=1; i<=n;i++){
                fast=fast.next;
            }
            while (fast!=null){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        public static Node Deleteobject(Node head,int n){
            Node slow =head;
            Node fast= head;
            for (int i =1; i<=n; i++){
                fast=fast.next;
            }
            if (fast==null){
                head=head.next;
                return head;
            }
            while (fast.next!=null){
                slow=slow.next;
                fast=fast.next;

            }
            slow.next=slow.next.next;
            return head;

        }
        public static void Display(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }

        public static void main(String[] args) {
            Node a = new Node(6);
            Node b = new Node(17);
            Node c = new Node(8);
            Node d = new Node(7);
            Node e = new Node(10);
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            Node temp = NthNode(a,3);
            System.out.println(temp.data);
           a= Deleteobject(a,5);
            Display(a);





        }
    }
}
