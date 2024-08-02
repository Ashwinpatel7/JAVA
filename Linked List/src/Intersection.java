//public class Intersectin {
//
//    public static class Node {
//        public Node getIntersection(Node heada, Node headb){
//            Node tempa =heada;
//            Node tempb = headb;
//            int lengthA =0;
//            while(tempa!=null){
//                lengthA++;
//                tempa=tempa.next;
//            }
//            int lengthB =0;
//            while(tempb!=null){
//                lengthB++;
//                tempb=tempb.next;
//            }
//            tempa=heada;
//            tempb=headb;
//            if (lengthA>lengthB){
//                int steps = lengthA-lengthB;
//                for (int i=1;i<=steps;i++){
//                    tempa=tempa.next;
//                }
//            }
//            else{
//                int steps = lengthB-lengthA;
//                for (int i=1;i<=steps;i++){
//                    tempb=tempb.next;
//                }
//            }
//            while (tempa!=tempb){
//                tempa=tempa.next;
//                tempb=tempb.next;
//            }
//            return tempa;
//        }
//
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//        }
//
//        public static void main(String[] args) {
//            Node a = new Node(6);
//            Node b = new Node(17);
//            Node c = new Node(8);
//            Node d = new Node(7);
//            Node e = new Node(10);
//            a.next = b;
//            b.next = c;
//            c.next = d;
//            d.next = e;
//
//
//        }
//    }
//}
public class Intersection {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        // Method to find the intersection point of two linked lists
        public Node getIntersection(Node headA, Node headB) {
            Node tempA = headA;
            Node tempB = headB;

            // Find the lengths of both linked lists
            int lengthA = getLength(tempA);
            int lengthB = getLength(tempB);

            // Reset tempA and tempB to the heads of the linked lists
            tempA = headA;
            tempB = headB;

            // Move the pointer of the longer linked list to make them equal in length
            if (lengthA > lengthB) {
                int steps = lengthA - lengthB;
                for (int i = 1; i <= steps; i++) {
                    tempA = tempA.next;
                }
            } else {
                int steps = lengthB - lengthA;
                for (int i = 1; i <= steps; i++) {
                    tempB = tempB.next;
                }
            }

            // Move both pointers until they meet (intersection point)
            while (tempA != tempB) {
                tempA = tempA.next;
                tempB = tempB.next;
            }

            // Return the intersection point (or null if no intersection)
            return tempA;
        }

        // Helper method to calculate the length of a linked list
        private int getLength(Node node) {
            int length = 0;
            while (node != null) {
                length++;
                node = node.next;
            }
            return length;
        }

        public static void main(String[] args) {
            Node a = new Node(6);
            Node b = new Node(17);
            Node c = new Node(8);
            Node d = new Node(7);
            Node e = new Node(10);
            Node f = new Node(3); // Intersection point
            Node g = new Node(2);

            // Linked list 1: a -> b -> c -> d -> e -> f
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            // Linked list 2: g -> f
            g.next = f;

            // Create an instance of Node to use the getIntersection method
            Node intersectionNode = new Node(0);
            intersectionNode = intersectionNode.getIntersection(a, g);

            // Print the data of the intersection node (or null if no intersection)
            System.out.println("Intersection Point: " + (intersectionNode != null ? intersectionNode.data : "null"));
        }
    }
}

