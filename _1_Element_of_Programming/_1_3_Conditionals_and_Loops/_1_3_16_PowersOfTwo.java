class _1_3_16_PowersOfTwo {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		if (n < 2) {
			System.out.println("No value!");
		} else {

			for (int i = 1; i <= n; i++) {
				int res = (int) Math.pow(2, i);
				if (res <= n) {
					System.out.print(res + " ");
				} else {
					break;
				}
			}
		}

	}
}