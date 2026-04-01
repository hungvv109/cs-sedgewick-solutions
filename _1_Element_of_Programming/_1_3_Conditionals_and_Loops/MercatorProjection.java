class MercatorProjection {
	public static void main(String[] args) {
		/*
		Input: 
		- lambda0: longitude at center map.
		- lambda: longitude.
		- φ: latitude. (Radian)

		Output:
		x = lambda - lambda0
		y = 1/2 * ln((1 + sinφ) / (1 − sinφ)) 
		*/

		double lambda0 = Double.parseDouble(args[0]);
		double lambda = Double.parseDouble(args[1]);
		double phi = Double.parseDouble(args[2]);

		double x = lambda - lambda0;
		double y = 1/2.0 * Math.log((1 + Math.sin(phi)) / (1 - Math.sin(phi)));

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}