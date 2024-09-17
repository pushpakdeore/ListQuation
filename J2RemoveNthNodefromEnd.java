package pushpak30listquation;
/*Remove Nth Node from End: Remove the Nth node from the end of a LinkedList*/


class Nodeeee {
    int data;
    Nodeeee next;

    Nodeeee(int new_data) {
        data = new_data;
        next = null;
    }
}

public class J2RemoveNthNodefromEnd{

    static Nodeeee removeNthFromEnd(Nodeeee head, int N) {

        int length = 0;
        Nodeeee curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }


        int target = length - N + 1;


        if (target == 1) {
            return head.next;
        }

        curr = head;
        for (int i = 1; i < target - 1; i++) {
            curr = curr.next;
        }


        curr.next = curr.next.next;

        return head;
    }


    static void printList(Nodeeee node) {
        Nodeeee curr = node;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Nodeeee head = new Nodeeee(1);
        head.next = new Nodeeee(2);
        head.next.next = new Nodeeee(3);
        head.next.next.next = new Nodeeee(4);
        head.next.next.next.next = new Nodeeee(5);

        int N = 2;
        head = removeNthFromEnd(head, N);

        System.out.println("Linked List after removal:");
        printList(head);
    }
}

