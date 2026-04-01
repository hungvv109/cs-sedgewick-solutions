class _1_3_9_PrintIntegers {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1000; i <= 2000; i++) {
			System.out.print(i + " ");
			count++;
			if (count == 5) {
				count = 0;
				System.out.println();
			}
		}
	}
}
