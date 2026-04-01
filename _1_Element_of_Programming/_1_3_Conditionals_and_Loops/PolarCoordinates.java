class PolarCoordinates {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		double theta = Math.atan2(y, x); // Radian
		double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

		System.out.println("Theta = " + theta*180 / Math.PI);
		System.out.println("r = " + r);
	}
}