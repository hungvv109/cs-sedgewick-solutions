class _1_3_20_KthRoot {
	public static void main(String[] args) {
		Double n = Double.parseDouble(args[0]);
		Double k = Double.parseDouble(args[1]);

		Double x = 1.0;

		while (Math.abs(Math.pow(x, k) - n) > 1e-10) {
			x = ((k-1)*Math.pow(x, k) + n) / (k*Math.pow(x, k-1));
		}

		System.out.println("x = " + x);
	}
}