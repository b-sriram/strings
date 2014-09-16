package strings;

public class StringOperations {

	public static void main(String[] args) {
		String s1 = "Welcome ";
		String s2 = new String("Welcome to HYderabad");
		
		System.out.println(s2);
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Match");
		} else {
			System.out.println("No Match");
		}
		
		/* Using StringBuilder to avoid multiple String object creation by JVM, 
		   every time we try to append or manipulate string. StringBuilder is used with
		   single threaded application, StringBuffer used with multi-threaded apps where
		   we need synchronization feature */
		StringBuilder sb = new StringBuilder(s1);
		sb.append("to Hyderabad");
		System.out.println(sb);
		
		//using char array
		char[] chars = s2.toCharArray();
		
		for (char c : chars) {
			System.out.println(c);
		}
		
		/* Using StringBuilder to avoid multiple String object creation by JVM, 
		   every time we try to append or manipulate string. StringBuilder is used with
		   single threaded application, StringBuffer used with multi-threaded apps where
		   we need synchronization feature */
		

	}

}
