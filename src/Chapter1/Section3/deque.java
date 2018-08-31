package Chapter1.Section3;

public class deque<Item> {

	private class Node{
		Item item;
		Node previous;
		Node next;
	}
	
	private Node first;
	private Node last;
	private int size;
	
	public deque(){
		first = null;
		last = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public void pushRight(Item item) {
		
		Node temp = last;
		last = new Node();
		last.item = item;
		last.previous = temp;
		
		if(temp!=null) temp.next = last;
		else first = last;
		
		size++;
	}
	
	public void pushLeft(Item item){
		
		Node temp = first;
		first = new Node();
		first.item = item;
		first.next = temp;
		
		if(temp != null) first.next = temp;
		else last = first;
		
		size++;
	}
	
	public Item popLeft(){
		
		if (isEmpty())	throw new RuntimeException("Deque underflow");
		
		Item item = first.item;
		first = first.next;
		
		if (first != null) first.previous = null;
		else last = null;
		
		size--;
		
		return item;
		
	}
	
	public Item popRight(){
		if (isEmpty()) throw new RuntimeException("Deque underflow");
		Item item = last.item;
		last = last.previous;
		
		if(last!=null) last.next = null;
		else first = null;
				
		size--;
		
		return item;
	}
	
	public static void main(String[] args) {
		

	}

}
