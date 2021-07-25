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
    public ListNode[] splitListToParts(ListNode root, int k) {
    ListNode curr=root;
        int N=0;
        while(curr!=null)
        {
            N++;
            curr=curr.next;
        }
        int w=N/k,max=N%k;
        ListNode[] ans=new ListNode[k];
        int i,j;
        curr=root;
        for(i=0;i<k;++i)
        {
            ListNode head=curr;
            for(j=0;j<(w+(i<max?1:0)-1);++j)
               if(curr!=null)
                   curr=curr.next;
            if(curr!=null)
            {
                ListNode prev=curr;
                curr=curr.next;
                prev.next=null;
                
            }
            ans[i]=head;
        }
        return ans;
    }
}
//tc  ok+n
//sc ok