package pushpak30listquation;
/*Remove Nth Node from End: Remove the Nth node from the end of a LinkedList*/

// Java program to delete Nth node from the end
class Nodeeee {
    int data;
    Nodeeee next;

    // Constructor to initialize the node
    Nodeeee(int new_data) {
        data = new_data;
        next = null;
    }
}

// Class containing the function to remove Nth node from end
public class J2RemoveNthNodefromEnd{

    // Function to remove the Nth node from the end
    static Nodeeee removeNthFromEnd(Nodeeee head, int N) {
        // Calculate the length of the linked list
        int length = 0;
        Nodeeee curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Calculate the position to remove from front
        int target = length - N + 1;

        // If target is 1, remove the head node
        if (target == 1) {
            return head.next;
        }

        // Traverse to the node just before the target
        curr = head;
        for (int i = 1; i < target - 1; i++) {
            curr = curr.next;
        }

        // Remove the target node
        curr.next = curr.next.next;

        return head;
    }

    // Function to print the contents of the linked list
    static void printList(Nodeeee node) {
        Nodeeee curr = node;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Nodeeee head = new Nodeeee(1);
        head.next = new Nodeeee(2);
        head.next.next = new Nodeeee(3);
        head.next.next.next = new Nodeeee(4);
        head.next.next.next.next = new Nodeeee(5);

        int N = 2; // Node to be removed from the end
        head = removeNthFromEnd(head, N);

        System.out.println("Linked List after removal:");
        printList(head);
    }
}

