package com.OOPSAlg.Program;

public class InsertLinkedList {
	Node head;
	//linked list node
	class Node{
		int data;
		Node next;
	Node(int d){
		data=d;
		next=null;		
		}
	}
	void sortedInsert(Node new_node) {
		Node current;
		if(head==null || head.data>=new_node.data) {
			new_node.next=head;
			head=new_node;
		}
		else {
			current =head;
			while(current.next !=null && current.next.data< new_node.data) {
				current =current.next;
				new_node.next=current.next;
				current.next=new_node;
			}
		}
	}
	 Node newNode(int data){
	       Node x = new Node(data);
	       return x;
	    }
	 void printList() {
		 Node temp = head;
		 while(temp!=null) {
			 System.out.println(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	 
	public static void main(String args[]) {
		InsertLinkedList ll=new InsertLinkedList();
		Node new_node;
		new_node=ll.newNode(5);
		ll.sortedInsert(new_node);
		new_node=ll.newNode(10);
		ll.sortedInsert(new_node);
        new_node = ll.newNode(7);
        ll.sortedInsert(new_node);
        new_node = ll.newNode(3);
        ll.sortedInsert(new_node);
        new_node = ll.newNode(1);
        ll.sortedInsert(new_node);
        new_node = ll.newNode(9);
        ll.sortedInsert(new_node);
        ll.printList();

		
	}

}
