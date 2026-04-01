class UniformRandomNumbers {
	public static void main(String[] args) {
		double num1 = Math.random();
		double num2 = Math.random();
		double num3 = Math.random();
		double num4 = Math.random();
		double num5 = Math.random();

		double avg_num = (num1 + num2 + num3 + num4 + num5) / 5;
		double max_num = Math.max(Math.max(Math.max(Math.max(num1, num2), num3), num4), num5);
		double min_num = Math.min(Math.min(Math.min(Math.min(num1, num2), num3), num4), num5);

		System.out.println("Average value: " + avg_num);
		System.out.println("Min value: " + min_num);
		System.out.println("Max value: " + max_num);
	}
}