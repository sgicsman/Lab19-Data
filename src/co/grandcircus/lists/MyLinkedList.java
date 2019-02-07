package co.grandcircus.lists;
public class MyLinkedList implements MyList {

	// head is the first node in the list. if null, the list is empty.
	private Node head = null;
	// for convenience, keep track of how many items are in the list
	private int length = 0;
	
	@Override
	public void addAtBeginning(String data) {
		// add a new node and set it as the new head

		Node node1 = new Node(data);
		node1.setNext(head);
		head = node1;
		length++;
	}
	
	@Override
	public void removeFromBeginning() {
		// find the second node and set it as the new head

		if (length == 0) {
			return;  // do nothing
		}
		head = head.getNext();
		length--;
	}
	
	@Override
	public void addAtEnd(String data) {
		
		Node node1 = new Node();
		Node node2 = new Node();
		
		if (head == null) {
			addAtBeginning(data);	// If head is null, then list is empty, so adding at end is equivalent to adding at the beginning.
			
		} else {

		node2.setData(data);
		node1 = getNodeAt(length-1);
		node1.setNext(node2);
		
		length++;
		}
	}
	
	@Override
	public void removeFromEnd() {
		if (length < 2) {
			// The beginning is the end.
			removeFromBeginning();
		} else {
			Node node1 = getNodeAt(length - 2);
			node1.setNext(null);
			length--;
		}
	}
	
	@Override
	public String get(int index) {

		Node node1 = getNodeAt(index);
		if (node1 == null) 
		{
			throw new IndexOutOfBoundsException();	
		} else { 
			return node1.getData();
		  }
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// start at the head
		Node node1 = head;
		// follow the links between nodes until it reaches the end 
		while (node1 != null) {
			// TODO #2
			sb.append(node1);
			node1 = node1.getNext();
		}
		return sb.toString();
	}
	
	@Override
	public int size() {
		return length;
	}
	
	private Node getNodeAt(int index) {
		// start at the head
		Node node1 = head;
		// follow the links between nodes until it counts off the right number
		for (int i = 0; i < index; i++) {
			if (node1 == null) {
				// In case we run out of nodes before we get up to the desired index, return null
				return null;
			}
			node1 = node1.getNext();
		}
		return node1;
	}
	

	public boolean removeAt(int index) { 
		
		if ( (index < 0) || (index > length-1) ) { 
			return false; 
			
		} else if ( index == 0 ) {
			removeFromBeginning();
			return true;
			
		} else if ( index == length-1 ) {
			removeFromEnd();
			return true;
			
		} else {
			Node node1 = getNodeAt( (index-1) );
			Node node2 = getNodeAt( (index+1) );
			node1.setNext(node2);
			length--;
			return true;
		  } 
	 }
	
	public boolean insertAt(int index, String item) { 
		
		if ( (index < 0) || (index > length) ) { 
			return false; 
			
		} else if ( index == 0 ) {
			addAtBeginning(item);
			return true;
			
		} else if ( index == length ) {
			addAtEnd(item);
			return true;
			
		} else {
			Node node1 = getNodeAt( (index-1) );
			Node node3 = getNodeAt(index);
			Node node2 = new Node(item);
			node1.setNext(node2);
			node2.setNext(node3);
			length++;
			return true;
		  } 
	 }

	 
}