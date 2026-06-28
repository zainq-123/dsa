package LinkedList.ListCycle.Optimized;

import java.util.List;

class ListNode{
    int val; ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class ListCycle_Optimized {
    static boolean ListCycle_Optimized(ListNode head){
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;      // 1 step
            fast = fast.next.next; // 2 steps ahead

            if (slow == fast) {
                return true; // Cycle detected!
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode node1=new ListNode(2);
        ListNode node2=new ListNode(3);
        ListNode node3=new ListNode(4);
        ListNode node4=new ListNode(5);

        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node2;

        System.out.println(ListCycle_Optimized(head));
    }
}
