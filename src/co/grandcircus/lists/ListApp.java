package co.grandcircus.lists;


public class ListApp {

	public static void main(String[] args) {
//		testArrayList();
		testLinkedList();
	}
	
	private static void testArrayList() {
		MyArrayList list = new MyArrayList();
		
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		list.removeFromBeginning();
		list.removeFromEnd();
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}
	
	private static void testLinkedList() {
		MyLinkedList list = new MyLinkedList();
		
		list.addAtEnd("B");
		list.addAtBeginning("A");
		list.addAtEnd("C");
		list.addAtBeginning("D");
		list.insertAt(2, "X");
		list.insertAt(4, "Y");
		list.insertAt(1, "Z");
		list.removeAt(1);					// Runs correctly as long as there are at least 2 items in final list. 
		list.removeFromBeginning();			// If all three lines 34-36 are attempted when the final list size = 1, line 41 throws an out-of-bounds exception -- 
		list.removeFromEnd();				// because lines 34-36 remove 3 items from the list of 4, so there is no node at index 1.
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
	}

}