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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public TreeNode sortedListToBST(ListNode head) {
        
        ListNode node = head;
        
        int len =0;
        while(node!=null){
            len++;
            node = node.next;
        }
        
        int [] list =new int[len];
        node =head;
        int pos = 0;
        while(node!=null){
            list[pos] = node.val;
            pos++;
            node = node.next;
        }
        
        return buildTree(list,0,list.length-1);
        
    }
    
    public TreeNode buildTree(int[] list, int start,int end){
        
        if(start>end){
            return null;
        }
        
        int mid =(start+end)/2;
        
        TreeNode  node = new TreeNode(list[mid]);
        
        node.left = buildTree(list,start, mid-1);
        node.right = buildTree(list, mid+1,end);
        
        return node;
        
        
    }
}