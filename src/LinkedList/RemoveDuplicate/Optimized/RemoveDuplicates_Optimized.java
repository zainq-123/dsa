package LinkedList.RemoveDuplicate.Optimized;


class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class RemoveDuplicates_Optimized {
    static ListNode RemoveDuplicateOptimized(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1. Recursive call chali: Pehle aage ki poori list ko saaf (duplicate free) karke lao
        head.next = RemoveDuplicateOptimized(head.next);

        // 2. Wapsi par check karo: Kya current node aur agla node same hain?
        if (head.val == head.next.val) {
            // Agar same hain, toh beech wale ko bypass karo (current wale ko chodh kar agla return karo)
            return head.next;
        } else {
            // Agar different hain, toh current head bilkul safe hai, use hi return karo
            return head;
        }
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
        public static void main (String[]args){
            ListNode head = new ListNode(1);
            head.next = new ListNode(1);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(2);
            head.next.next.next.next = new ListNode(3);
            head.next.next.next.next.next = new ListNode(3);
            head.next.next.next.next.next.next = new ListNode(3);

            ListNode node=RemoveDuplicateOptimized(head);
            printList(node);
        }
    }

