package LinkedList.ListCycle.Brute;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class ListCycle_Brute {
    static boolean ListCycle_Brute(ListNode head){// Agar list khali hai ya sirf ek node hai jo null par ja raha hai
        if (head == null || head.next == null) {
        return false;
    }

    HashSet<ListNode> visitedNodes = new HashSet<>();
    ListNode current = head;

        while (current != null) {
        // Agar yeh node pehle se set mein hai, matlab cycle pakdi gayi!
        if (visitedNodes.contains(current)) {
            return true;
        }

        // Warna is node ko set mein daalo aur aage badho
        visitedNodes.add(current);
        current = current.next;
    }

    // Agar loop khatam ho gaya aur current null ho gaya, matlab koi cycle nahi hai
        return false;
}

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node3;

        System.out.println(ListCycle_Brute(head));
    }
}
