import java.lang.reflect.Method;

/*
Link to problem: https://www.hackerrank.com/challenges/java-generics
*/

public class Generics {
	static class Printer {
		public <Object> void printArray(Object[] array) {
			for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		Printer myPrinter = new Printer();
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };
		myPrinter.printArray(intArray);
		myPrinter.printArray(stringArray);
		int count = 0;

		for (Method method : Printer.class.getDeclaredMethods()) {
			String name = method.getName();
			if (name.equals("printArray"))
			count++;
		}
		if (count > 1) {
			System.out.println("Method overloading is not allowed!");
		}
	}
}
