package strings;

public class StringParsing {

	public static void main(String[] args) {
		String s1 = "Welcome         ";
		String s2 = new String("Welcome to HYderabad");
		
		System.out.println("Length of the string: "+ s2.length());
		
		int pos = s2.indexOf("to");
		System.out.println("Position of to: " + pos);
		
		String sub = s2.substring(pos);
		System.out.println(sub);
		
		System.out.println("Length of s1 before trimming: "+ s1.length());
		s1 = s1.trim();
		System.out.println("Length of s1 after trimming: "+ s1.length());
	}

}
