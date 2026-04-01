class GreatCircle {
	public static void main(String[] args) {
		/*
		x1 = latitude point 1 (degrees)
		y1 = longitude point 1
		x2 = latitude point 2
		y2 = longitude point 2
		*Convert to Radians.

		d = 60*arccos(sin(x1)*sin(x2) + cos(x1)*cos(x2)*cos(y1 - y2))
		*/

		double x1 = toRadians(Double.parseDouble(args[0]));
		double y1 = toRadians(Double.parseDouble(args[1]));
		double x2 = toRadians(Double.parseDouble(args[2]));
		double y2 = toRadians(Double.parseDouble(args[3]));

		double d = 60*Math.acos(
			Math.sin(x1)*Math.sin(x2) + 
			Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2)
		);

		System.out.println(d);
	}

	private static double toRadians(double double1) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'toRadians'");
	}
}