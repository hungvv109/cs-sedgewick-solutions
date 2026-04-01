class TenHellos {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		for (int i = 1; i <= num; i++) {
			if (i >= 11 && i <= 13) {
				System.out.println(i + "th");
			} else {
				if (i % 10 == 1) {
					System.out.println(i + "st");
				} else if (i % 10 == 2) {
					System.out.println(i + "nd");
				} else if (i % 10 == 3) {
					System.out.println(i + "rd");
				} else {
					System.out.println(i + "th");
				}
			}
		}
	}
}