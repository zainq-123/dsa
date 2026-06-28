package LinkedList.MergeSorted.Optimal;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class MergeSorted_Optimized {
    public static ListNode Merge_SortedOptimized(ListNode list1, ListNode list2) {
        // Aik dummy node banayein jo starting point ka track rakhega
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Pointers ko move karte hue choti value wale node ko link karna
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next; // list1 pointer ko aage barhayein
            } else {
                current.next = list2;
                list2 = list2.next; // list2 pointer ko aage barhayein
            }
            current = current.next; // Resultant list ka pointer aage barhayein
        }

        // Agar koi aik list abhi bhi baqi hai, to usay poora attach kar dein
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // Dummy ka next hi hamari actual merged list ka head hai
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedHead = Merge_SortedOptimized(list1, list2);

        System.out.print("Merged Linked List (Optimal): ");
        ListNode temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}