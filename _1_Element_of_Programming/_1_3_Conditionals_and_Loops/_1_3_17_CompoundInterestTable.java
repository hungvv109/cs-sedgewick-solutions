class _1_3_17_CompoundInterestTable {
	public static void main(String[] args) {
		// Input: p (dau tu money) -> r (lai suat hang nam) -> t (numbers of the year).
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);

		for (int i = 0; i <= 10; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();

		double res = p;

		for (int i = 1; i <= 10; i++) {
			res = res * Math.exp(r * i);
			System.out.print(res + "\t");
		}
	}
}