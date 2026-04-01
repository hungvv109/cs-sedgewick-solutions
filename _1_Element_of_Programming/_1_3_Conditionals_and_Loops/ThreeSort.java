class ThreeSort {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);

		int sum = num1 + num2 + num3;

		int max_num = Math.max(Math.max(num1, num2), num3);
		int min_num = Math.min(Math.min(num1, num2), num3);
		int tmp_num = sum - max_num - min_num;

		System.out.println(min_num + " " + tmp_num + " " + max_num);
	}
}