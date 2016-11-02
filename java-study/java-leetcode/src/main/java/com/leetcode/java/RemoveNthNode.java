package com.leetcode.java;

/**
 * Given a linked list,remove the nth node from the end of the list and return its head
 * @author: SunnyScent
 * @Date: 2016-10-24
 * @Time: 20:42
 */
  class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head,int n){

        int l=0;
        ListNode temp=head;
        ListNode temp2=head;
        while (temp.next!=null){
            l++;
            temp=temp.next;
        }

        if(l==1){
            head=null;
            return head;
        }else if(l<=2){
            head.next=null;
            return head;
        }else {
            for (int i = 0; i < l-n-1; i++) {
                temp2=temp2.next;
            }
            temp2.next=temp2.next.next;
            return head;
        }
    }

}