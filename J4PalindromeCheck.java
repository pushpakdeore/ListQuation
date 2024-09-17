package pushpak30listquation;
import java.util.Collection;
import java.util.LinkedList;
import java.util.*;

public class J4PalindromeCheck {


    public static boolean isPalindrome(LinkedList<Integer> list) {

        LinkedList<Integer> copyList = new LinkedList<>(list);

        while (copyList.size() > 1) {
            int first = copyList.getFirst();
            int last = copyList.getLast();

            if (first != last) {
                return false;
            }
            copyList.removeFirst();
            copyList.removeLast();
        }


        return true;
    }
    private static boolean isPalindromea(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left).equals(list.get(right))) {
                return true;
            }
            left++;
            right--;
        }
        return false; // All matches
    }

    public static boolean isPalindromeaa(LinkedList<Integer> list){
        LinkedList<Integer> copy = new LinkedList<Integer> (list);
        Collections.reverse(copy);
        if(copy.equals(list)){
            return true;
        }
        return false;

    }


    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);


        System.out.println("Original LinkedList: " + list);
        //1
        if (isPalindrome(list)) {
            System.out.println("The LinkedList is a palindrome.");
        } else {
            System.out.println("The LinkedList is not a palindrome.");
        }

        System.out.println("Original LinkedList after check: " + list);

        System.out.println("Original LinkedList: " + list);


        //2

        if (isPalindromea(list)) {
            System.out.println("The LinkedList is a palindrome.");
        } else {
            System.out.println("The LinkedList is not a palindrome.");
        }
        System.out.println("Original LinkedList after check: " + list);


        //3
        if (isPalindromeaa(list)) {
            System.out.println("The LinkedList is a palindrome.");
        }
    }
}


