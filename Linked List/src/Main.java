public class Main {
//    Displaying it recursively
    public static int count(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head=head.next;

        }
        return count;

    }
    public static void Insertatend(Node head,int val){
        Node temp = new Node(val);
        Node t =head;
        while (t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    public static void Rdisplay(Node head){
        if (head==null) return;//Base condition
        System.out.print(head.data+" ");//Self work
        Rdisplay(head.next);// Bigger problem
    }

    public static void Display(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
    }
    public static class Node{
        int data;//Value of the data
        Node next;//Address of next node

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node ash = new Node(5);//Head node
        Node ash2 = new Node(6);
        Node ash3 = new Node(8);
        Node ash4 = new Node(1);
        Node ash5 = new Node(3);
//        System.out.println(ash.data);
//        System.out.println(ash.next);
        // Making a chain of link between different values
        ash.next=ash2;
        ash2.next=ash3;
        ash3.next = ash4;
        ash4.next = ash5;
//        System.out.println(ash.next.data);//So what happened here is we have linked b to a that is why
        // PRinting all values using head only
//        System.out.println(ash.next.next.data);
//        System.out.println(ash.next.next.next.data);
//        System.out.println(ash.next.next.next.next.data);
        //Using loops
//        Node temp = ash;
//        for (int i=0; i<5;i++){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        Using while loop printing the linked list

        Display(ash);
        System.out.println();
        Rdisplay(ash);
        System.out.println();
        System.out.println(count(ash));
        Insertatend(ash,87);
        Display(ash);





    }
}