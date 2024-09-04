package ArrayList;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static interduced 11
		
		/*stack = LIFO = stack is the class in java which implements the list interface and extends the vector class and also represents the Lifo Principle.
		Stack<String> books = new Stack<>();
		//can't use this stack 
		books.add("red");
		books.add("black");
		books.add("white");
		books.add("blue");
		//books.remove(2);
		System.out.println(books.contains ("red"));
		books.clear();
		System.out.println(books);
		
		*/
		
		//stack methods 1. push , 2.pop, 3.peek, 4. search
		
		Stack<String> books = new Stack<>();
		//push add elements 
		books.push("maths");
		books.push("englis");
		books.push("telugu");
		books.push("physcs");
		books.push("chemistry");
		books.push("telugu");
		books.push(null);
		System.out.println(books);
		
		//peak return last elemet of the stack
		System.out.println(books.peek());
		System.out.println(books);
		
		
		//pop return last elemet of the stack
		System.out.println(books.pop());
		System.out.println(books);
		
		
		//search is searching the last to first element (<------ );
		System.out.println(books.search("maths"));
		
		System.out.println(books.empty());
		
		
	}

}
