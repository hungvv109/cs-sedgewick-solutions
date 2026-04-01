class _1_2_19 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int random_int = a + (int)Math.random() * (b-a+1);
		System.out.println(random_int);
	}
}