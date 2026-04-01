class CheckTriangle {
	public static void main(String[] args) {
		// Input: a -> b -> c
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		boolean check = (a >= (b + c) || (b >= (a + c)) || c >= (a + b));

		System.out.println(!check);
	}
}