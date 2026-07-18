/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //if the linked list is empty it will return false
        if(head == null ){
            return false;
        }

        ListNode hare = head;
        ListNode turtle = head;

        //the loop will continue until hare will be null or hare.next will be null
        while(hare != null && hare.next !=null){
            hare = hare.next.next;
            turtle = turtle.next;

            // it both match at some point then then it is cyclic and it will return true
            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}