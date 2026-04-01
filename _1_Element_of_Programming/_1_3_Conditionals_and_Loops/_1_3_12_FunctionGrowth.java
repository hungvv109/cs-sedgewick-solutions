class _1_3_12_FunctionGrowth {
	public static void main(String[] args) {
		double n = Double.parseDouble(args[0]);

		System.out.println("log n \t n \t nlogn \t n^2 \t n^3 \t 2^n");
		System.out.println(Math.log(n) + "\t" + n + "\t" + n*Math.log(n) + "\t" + n*n + "\t" + n*n*n + "\t" + Math.pow(2, n));
	}
}