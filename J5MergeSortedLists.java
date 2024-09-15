package pushpak30listquation;
/*5. Merge Sorted Lists: Merge two sorted LinkedLists into one sorted list java*/

class Node{
    int data;
    nodee next;
    Node(int x){
        this.data =x;
        this.next =null;

    }
}

public class J5MergeSortedLists {
    static nodee mergeSortedList(nodee a, nodee b) {
        // Create a dummy node to help with the merging process
        nodee dummy = new nodee(0);
        nodee tail = dummy;

        // Traverse both lists and merge them
        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes from the non-exhausted list
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }


        // Return the merged list, which starts at dummy.next
        return dummy.next;
    }

    public static void main(String[] args) {
        nodee a =new nodee(2);
        a.next =new nodee(3);
        a.next.next=new nodee(8);
        a.next.next.next =new nodee(9);


        nodee b =new nodee(1);
        b.next = new nodee(3);
        b.next.next = new nodee(8);
        b.next.next.next = new nodee(10);

        nodee res = mergeSortedList(a,b);
        nodee temp =res;

        while (temp !=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }

    }
}
