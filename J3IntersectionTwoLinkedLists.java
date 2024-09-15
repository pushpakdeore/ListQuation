package pushpak30listquation;
/*3. Intersection of Two LinkedLists: Find the intersection point of two LinkedLists. java*/


import java.util.HashSet;

class nodee {
    int data;
    nodee next;

    public nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

public class J3IntersectionTwoLinkedLists {


    public static nodee getIntersectionNode(nodee headA, nodee headB) {
        HashSet<nodee> nodes = new HashSet<>();


        nodee current = headA;
        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        current = headB;
        while (current != null) {
            if (nodes.contains(current)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    public static void main(String[] args) {

        nodee common = new nodee(8);
        common.next = new nodee(10);


        nodee head1 = new nodee(3);
        head1.next = new nodee(6);
        head1.next.next = new nodee(9);
        head1.next.next.next = common;

        nodee head2 = new nodee(4);
        head2.next = common;

        nodee intersection = getIntersectionNode(head1, head2);
        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection.");
        }
    }
}
