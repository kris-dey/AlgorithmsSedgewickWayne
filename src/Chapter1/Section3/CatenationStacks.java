package Chapter1.Section3;
import edu.princeton.cs.algs4.Stack;

public class CatenationStacks<Item>{

	public Stack<Item> catenateStacks(Stack<Item> s1, Stack<Item> s2){
		Stack<Item> newStack = new Stack<>();
		
		Stack<Item> tmp = new Stack<>();
		
		for (Item item: s1)
			tmp.push(item);
		
		for (Item item: tmp)
			newStack.push(item);
		
		Stack<Item> tmp2 = new Stack<>();
		
		for (Item item: s2)
			tmp2.push(item);
		
		for (Item item: tmp2)
			newStack.push(item);
		
		
		return newStack;
	}
	
	public static void main(String[] args) {
		CatenationStacks<Integer> test = new CatenationStacks<Integer>();
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		s2.push(4);
		s2.push(5);
		s2.push(6);
		
		Stack<Integer> s3 = test.catenateStacks(s1,s2);
		
		for(Integer item: s3) System.out.print(item);
	}

}
