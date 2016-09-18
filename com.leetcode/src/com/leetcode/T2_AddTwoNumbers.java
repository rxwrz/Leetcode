package com.leetcode;

public class T2_AddTwoNumbers {
    
    public static void main(String[] args) {
	ListNode a = new ListNode(1);
	ListNode b = new ListNode(9);
	ListNode c = new ListNode(0);
	b.next = new ListNode(9);
	b.next.next = new ListNode(4);
	T2_AddTwoNumbers t2 = new T2_AddTwoNumbers();
	c = t2.addTwoNumbers(a, b);
	System.out.println(c.val);
	while (c.next != null) {
	    System.out.println(c.next.val);
	    c = c.next;
	}
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode add = new ListNode((l1.val + l2.val) % 10);
	ListNode temp = add;
	if (l1.val + l2.val >= 10) {
	    add.next = new ListNode(1);
	} else if (l1.next != null || l2.next != null){
	    add.next = new ListNode(0);
	}
	while (l1.next != null || l2.next != null) {
	    if (l1.next != null){l1 = l1.next;} else {l1.val=0;}
	    if (l2.next != null){l2 = l2.next;} else {l2.val=0;}
	    add = add.next;
	    if (add.val + l1.val + l2.val >= 10) {
		add.next = new ListNode(1);
	    } else if (l1.next != null || l2.next != null) {
		add.next = new ListNode(0);
	    }
	    add.val = (add.val + (l1.val + l2.val)) % 10;
	}
	return temp;
    }
    
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
	val = x;
    }
}
