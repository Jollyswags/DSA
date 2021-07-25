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
    public ListNode partition(ListNode head, int x) {
ListNode bh,ah,b,a;
        bh=new ListNode(0);
        ah=new ListNode(0);
        b=bh;
        a=ah;
        while(head!=null)
        {
            if(head.val<x)
            {
                b.next=head;
                b=b.next;
            }
            else
            {
                a.next=head;
                a=a.next;
            }
            head=head.next;
        }
        a.next=null;
        b.next=ah.next;
        return bh.next;
    }
}