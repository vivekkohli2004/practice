package friends;

import java.util.ArrayList;
import java.util.List;

//create a pattern where diff b/w the 2 consecutive digits is 1 
public class MSPattern {
	
	public static void main(String[] args) {
		List<Integer> output= new ArrayList<>();
		
		//int start=10;
		int quotient;
		for(int i=10;i<=90;i+=10) {
			quotient=i/10;
			
			output.add(i+quotient-1);output.add(i+quotient+1);
		}
		output.remove(output.size()-1);
		System.out.println(output); 
	}

}
