package linkedlist;

public class Main {
    public static void main(String[] args) {

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        /*ListNode fake = new ListNode(-1);
        fake.next = head;
        // 1 2 3 4 5 6
        ListNode pre = fake;
        ListNode current = head;

        while (current!=null){
            if(current.val == val){
                pre.next = current.next;
            } else {
                pre = current;
            }
            current = current.next;
        }
        return fake.next;*/
        /*while (head!=null && head.val == val){
            head = head.next;
        }
        ListNode current = head;
        while (current!=null && current.next!=null){
            if(current.next.val == val){
                current.next = current.next.next;
            } else
                current = current.next;
        }
        return head;*/

        if(head == null || head.next == null)
            return head;
        ListNode pre = null;
        ListNode pointer = head;

        // 1 -> 2 -> 3 -> 4
        // 1
        while (pointer!=null){ // 1->2 2->3 3->4 4->null
            ListNode next = pointer.next; //2->3  3->4 4->null null
            pointer.next = pre;// null  1->null 2->1->null 3->2->1->null
            pre = pointer; // 1->null  2->1->null 3->2->1->null
            pointer = next; // 2->3 3->4 4->null
        }
        return pre;
    }
}

