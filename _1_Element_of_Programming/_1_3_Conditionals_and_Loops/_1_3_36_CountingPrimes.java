class _1_3_36_CountingPrimes {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		if (num < 2) {
			System.out.println("No prime!");
			return;
		}

		int count = 1;
        for (int n = 3; n <= num; n += 2) {

            if (n % 3 == 0 && n != 3) continue; // Skip power of 3

            boolean check = true;

            for (int j = 5; j * j <= n; j += 6) {
                if (n % j == 0 || n % (j + 2) == 0) {
                    check = false;
                    break;
                }
            }

            if (check) count++;
        }

		System.out.print(count);		
	}
}	
