class CastingToGetARandomInteger {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		double r = Math.random();   // uniform between 0.0 and 1.0
		int value = (int) (r * n);  // uniform between 0.0 and 1.0
		System.out.println(value);
		System.out.println(Math.round(2.6467534));
		System.out.println(Math.round(2.4467534));
	}
}