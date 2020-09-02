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
class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
        ListNode result = new ListNode(0);
        result.next = head;
        
        ListNode prev = null;
        
        while(head != null)
        {
            ListNode newNode = new ListNode(head.val);
            newNode.next = prev;
            prev = newNode;
            head = head.next;
        }
        head = result.next;
        
        while(head != null && prev != null)
        {
            if(head.val != prev.val)
            {
                return false;
            }
            head = head.next;
            prev = prev.next;
        }
        return (head == null) && (prev == null);
    }
} 
