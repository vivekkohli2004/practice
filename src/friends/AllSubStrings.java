package friends;

//ICE question
public class AllSubStrings
{
	public static void main(String[] args) {
		
		String s="abcde";
		System.out.println("No of Subtrings is:" +getSubStringCount(s));
	}

	private static Integer getSubStringCount(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i, j));
				count++;
			}
		}
		return count;
	}
	
}