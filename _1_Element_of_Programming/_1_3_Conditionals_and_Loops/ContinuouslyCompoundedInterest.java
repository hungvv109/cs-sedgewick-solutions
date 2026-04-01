class ContinuouslyCompoundedInterest {
	public static void main(String[] args) {
		// Input: p (dau tu money) -> r (lai suat hang nam) -> t (numbers of the year).
		double p = Double.parseDouble(args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);

		double result = p * Math.exp(r * t);
		System.out.println(result);
	}
}