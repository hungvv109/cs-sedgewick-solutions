class _1_3_45_Chaos {
	public static void main(String[] args) {
		double x = 0.01;
		double r = 2.0;

		for (int i = 0; i < 1000; i++) {
			x = r*x*(1-x);
		}

		for (int i = 0; i < 10; i++) {
			x = r*x*(1-x);
			System.out.print(x + " ");			
		}
	}
}