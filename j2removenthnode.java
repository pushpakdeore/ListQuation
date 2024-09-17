package pushpak30listquation;

import java.util.LinkedList;

public class j2removenthnode {


    public static void removeNthFromEnd(LinkedList<Integer> linkedList, int n) {

        int size = linkedList.size();
        int indexToRemove = size - n;

        linkedList.remove(indexToRemove);



    }

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);


        removeNthFromEnd(linkedList, 2);

        System.out.println("After removing 2nd node from end: " + linkedList);
    }
}

