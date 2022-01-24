package leet.array;

public class GroupAnagrams {

	
	public static void main(String[] args) {
		
		String s= new String ("tea");
		String s1= new String ("e");
		System.out.println("tea".hashCode());
		System.out.println("eat".hashCode());
		
		String ss="Hello";
		System.out.println(ss=="Hello");
		
		
		String f="fg";
		StringBuffer g= new StringBuffer("fg");
		System.out.println(f.equals(g));
		System.out.println(g.equals(f));

		
		String f1="fg";
		String g1= new String("fg");
		System.out.println(f1.equals(g1));
	}
}
