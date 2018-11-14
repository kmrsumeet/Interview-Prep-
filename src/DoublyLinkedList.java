
public class DoublyLinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int d){
			data = d;
		}
	}
	
	public void push(int new_data){
		/* 1. allocate node  
	        * 2. put in the data */
	        Node new_Node = new Node(new_data); 
	  
	        /* 3. Make next of new node as head and previous as NULL */
	        new_Node.next = head; 
	        new_Node.prev = null; 
	  
	        /* 4. change prev of head node to new node */
	        if (head != null) 
	            head.prev = new_Node; 
	  
	        /* 5. move the head to point to the new node */
	        head = new_Node; 
	}
	
	public void printList(Node node){
		Node last = null;
		System.out.println("Traversal in forward direction");
		while(node!=null){
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println("Traversal in reverse direction");
		while(last!=null){
		System.out.print(last.data + " ");
		last = last.prev;
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.push(5);
		dll.push(4);
		dll.push(3);
		dll.push(2);
		dll.push(1);
		dll.printList(dll.head);

	}

}
