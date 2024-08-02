public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class Linkedlist{
        Node head = null;
        Node tail =null;
        void InsertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;

            } else{
                tail.next=temp;
            }
            tail=temp;//In case of redundant statements we can write it at the end

        }
        void Display(){
            Node temp =head;//As we have to preserve our head so we assign this to a variable temp.
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void InsertAtHead(int val){
            Node temp =new Node(val);
            if(head==null){
                head =tail= temp;
            } else {
                temp.next=head;
                head = temp;

            }
        }
        int getat(int idx){
            Node temp =head;
            for(int i =1;i<=idx;i++){
                temp=temp.next;

            }
            return temp.data;
        }
        void Insert(int idx,int val){
            Node x = new Node(val);
            Node temp = head;
//            For the edge case where the index is last number
            if (idx==size()){
                InsertAtEnd(val);
                return;
            } else if (idx==0) {
                InsertAtHead(val);
                return;
                
            } else if (idx<0||idx>size()) {
                System.out.println("Wrong Index");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp=temp.next;
            }
            x.next=temp.next;
            temp.next=x;

        }
        void deleteAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }

    public static void main(String[] args) {
        Linkedlist li  = new Linkedlist();
        li.InsertAtEnd(3);
        li.InsertAtEnd(5);
//        li.Display();
//        System.out.println(li.size());
        li.InsertAtHead(4);
//   li.Display();
        li.Insert(2,12);
        li.Insert(0,8);
        li
                .Display();
        li.deleteAt(0);
        System.out.println(li.getat(0));
    }

}
