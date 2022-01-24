package youtube;
import java.util.HashSet;


//https://www.youtube.com/watch?v=3IETreEybaA
public class LongestNonRepeatingSubStr {

	
	public static void main(String[] args) {
		
		int len=getLongestNonRepeatingSubsStr("pwwkew");//abcabcbb//CAAAABBB
		System.out.println("Max length of the longest non-repeating substring is:"+len);
	}

	private static int getLongestNonRepeatingSubsStr(String s) {
		int l_ptr=0;
		int r_ptr=0;
		int max=0;
		HashSet<Character> set= new HashSet<>();

		while(r_ptr<s.length()){
			if(!set.contains(s.charAt(r_ptr))){
				set.add(s.charAt(r_ptr));
				max=Math.max(set.size(), max);
				r_ptr++;
				//System.out.println("IN IF "+set);
			}else{
				set.remove(s.charAt(l_ptr));
				l_ptr++;//r_ptr++;
				//System.out.println("L="+l_ptr + " R="+ r_ptr + " MAX=" + max + " SET"+set);
				//System.out.print(" "+ set);
			}
		}
		return max;
	}
}
