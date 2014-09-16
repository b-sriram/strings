package strings;

public class ExceptionHandlingSample {

	public static void main(String[] args) {
	
		
			try {
				getArrayItem();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println("Array Index Out of bound");
			}
		
	}

	private static void getArrayItem() throws ArrayIndexOutOfBoundsException {
		String[] strings = {"welcome"};
		System.out.println(strings[1]);
	}
}

		

