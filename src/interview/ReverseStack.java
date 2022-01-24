package interview;

import java.util.Stack;

// Double recursion- w/o using additional DS reverse a stack
public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack <Integer> ();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		revertStack(stack);
		
		System.out.println(stack);
		
	}

	public static void revertStack(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		} else {
			Integer a = s.pop();
			revertStack(s);
			appendStack(s, a);
		}
	}

	public static void appendStack(Stack<Integer> s, Integer a) {
		if (s.isEmpty()) {
			s.push(a);
			return;
		} else {
			Integer o = s.pop();
			appendStack(s, a);
			s.push(o);
		}
	}
	

}
