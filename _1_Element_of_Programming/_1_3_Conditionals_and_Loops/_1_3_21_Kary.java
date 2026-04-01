class _1_3_21_Kary {

	private static String checkChar(long temp) {
		if (temp == 10) {
			return "A";
		} else if (temp == 11) {
			return "B";
		} else if (temp == 12) {
			return "C";
		} else if (temp == 13) {
			return "D";
		} else if (temp == 14) {
			return "E";
		}
		return "F";
	}

	public static void main(String[] args) {
		long i = Long.parseLong(args[0]);
		long k = Long.parseLong(args[1]);

		if (k < 2 || k > 16) {
			System.out.println("K value have to between 2 and 16!");
			return;
		}

		long temp;
		String result = "";

		while (i >= k) {
			temp = i % k;
			if (temp > 9 && temp < 16) {
				String charEle = checkChar(temp);
				result += charEle;
			} else {
				result += Long.toString(temp);
			}
			i /= k;
		}

		result += Long.toString(i);

		int len_re = result.length();
		for (int j = len_re-1; j >= 0; j--) {
			System.out.print(result.charAt(j));
		}
	}
}