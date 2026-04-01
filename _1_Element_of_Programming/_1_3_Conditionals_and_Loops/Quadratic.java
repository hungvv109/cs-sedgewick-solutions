class Quadratic {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		if (a == 0 && b != 0) System.out.println("x = " + (-c / b));
		else if (a == 0 && b == 0) System.out.println("No real result");
		else {
			double delta = b*b - 4*a*c;
			if (delta < 0) System.out.println("No real result");
			else if (Math.abs(delta) < 1e-10) System.out.println("x = " + (-b / (2*a)));
			else {
				double x1 = (-b + Math.sqrt(delta)) / (2*a);
				double x2 = (-b - Math.sqrt(delta)) / (2*a);
				
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}