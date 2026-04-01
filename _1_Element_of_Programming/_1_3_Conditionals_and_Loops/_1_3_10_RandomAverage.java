class _1_3_10_RandomAverage {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double num = Math.random();
			sum += num;
		}
		System.out.println(sum / n);
	}
}