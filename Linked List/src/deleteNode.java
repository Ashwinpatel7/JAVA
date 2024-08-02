public class deleteNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
//        Creating an method of deleting node passing the node itself
        public void DeleteNode(Node a){
            a.data=a.next.data;
            a.next=a.next.next;

        }
    }
}
