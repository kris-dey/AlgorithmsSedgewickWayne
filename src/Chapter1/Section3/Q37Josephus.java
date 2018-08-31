package Chapter1.Section3;

import edu.princeton.cs.algs4.Queue;

public class Q37Josephus {

	public static void main(String[] args) {
		int totalPeople = 7;
		int order = 2;
		
		System.out.println(josephusOrder(totalPeople, order));

	}
	
	public static String josephusOrder(int totalPeople, int order){
		
		if(totalPeople<0) return null;
		
		String orderString = "";
		Queue<Integer> queue = new Queue<>();
		
		for(int i=0; i<totalPeople; i++)	queue.enqueue(i);
		
		while(queue.size()!=0){
			for(int j=0; j<order-1; j++)	queue.enqueue(queue.dequeue());
			orderString += queue.dequeue() + " ";
		}
		
		return orderString;
	}

}
