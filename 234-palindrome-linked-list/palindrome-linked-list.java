/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode Head){
        ListNode hare = Head;
        ListNode turtle = Head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondhalfstart = reverse(middle.next);
        ListNode firsthalfstart = head;
        while(secondhalfstart!=null){
            if(firsthalfstart.val != secondhalfstart.val){
                return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        return true;
    }
}