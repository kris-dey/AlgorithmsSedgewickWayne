package Chapter1.Section3;

import java.util.LinkedList;
import java.util.Scanner;

public class MoveToFront {

	public static void main(String[] args) {
		LinkedList<String> seq = new LinkedList<>();
		
		Scanner input = new Scanner(System.in);
		String newInput = input.next();
		while(!newInput.equals("end")){
			if (seq.contains(newInput))
				seq.remove(newInput);
			seq.addFirst(newInput);
			newInput = input.next();
		}
		input.close();
		
		for(String character: seq){
			System.out.print(character);
		}
			
	}

}
