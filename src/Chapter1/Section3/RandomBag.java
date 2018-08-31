package Chapter1.Section3;

import java.util.Iterator;

public class RandomBag<Item> implements Iterable<Item>{
	
	private Item[] array;
	private int size;
	
	public RandomBag(){
		array = (Item[]) new Object[1];
		size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public void add(Item item) {
		if (size == array.length)	resize(size*2);
		array[size++] = item;
	}

	@SuppressWarnings("unchecked")
	private void resize(int capacity){
		Item[] newArray = (Item[]) new Object[capacity];
		for(int i=0;i<size;i++)	newArray[i] = array[i];
	    array = newArray;
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
