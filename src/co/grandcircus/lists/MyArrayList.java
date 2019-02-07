package co.grandcircus.lists;
import java.util.Arrays;

public class MyArrayList implements MyList {
	
	// The allocated array of memory. This might be bigger than the actual list.
	private String[] array = new String[4];
	// How many items are actually in the list. May be less than the length of the array.
	private int length = 0;

	@Override
	public void addAtEnd(String data) {
		// TODO #1
	}

	@Override
	public void removeFromEnd() {
		// TODO #2
	}

	@Override
	public void addAtBeginning(String data) {
		// TODO #6
	}

	@Override
	public void removeFromBeginning() {
		// TODO Exercise
	}

	@Override
	public String get(int index) {
		// TODO #3
		return null;
	}

	@Override
	public int size() {
		// TODO #4
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[ ");
		
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length -1 ) {
				sb.append(", ");
			}
		}
		
		sb.append(" ]");
		return sb.toString();
	}
	
	private boolean isFull() {
		return length == array.length;
	}
	
	private void doubleLength() {
		// make a new copy of the array that is twice as long
		// TODO #5
	}

}