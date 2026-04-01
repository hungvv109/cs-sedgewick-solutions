class _1_3_39_TrigonometricFunctions {
	public static void main(String[] args) {
		// Radian
		double x = Double.parseDouble(args[0]);

		// Normalize
		x = x % (2 * Math.PI);

		double sine = x;
		double cosine = 1;
		double term_sine = x;
		double term_cosine = 1;

		for (int i = 1; i < 50; i++) {
			term_sine *= (-1*x*x) / ((2*i)*(2*i+1));
			term_cosine *= (-1*x*x) / ((2*i)*(2*i-1));
			
			sine += term_sine;
			cosine += term_cosine;

			if (Math.abs(term_sine) < 1e-15 && Math.abs(term_cosine) < 1e-15) {
				break;
			}
		}
		System.out.println("Sine = " + sine);
		System.out.println("Cosine = " + cosine);
	}
}