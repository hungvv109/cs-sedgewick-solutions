class OrderCheck {
	public static void main(String[] args) {
		// Input x -> y -> z
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);

		System.out.println(((x < y) && (y < z)) || ((x > y) && (y > z)));
	}
}