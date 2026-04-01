public class HelloWorld {
	public static void main(String[] args) {
		// Prints "Hello, World" in the terminal window -> statement
		// System.out.println("Hello, World"); // -> statement

		// Convert String -> int,double: 
		// Integer.parseInt(...), Double.parseDouble(...)
		// (...).getClass().getSimpleName() -> check data type

		// String a = "123";
		// Integer.parseInt(a);
		// System.out.println(a.getClass().getSimpleName());

		int n = 10;
		String res = Integer.toBinaryString(n);
		System.out.println(res);
	}
}