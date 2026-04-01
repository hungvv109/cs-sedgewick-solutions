class RollLoadedDie {
	public static void main(String[] args) {
		/*
		[0:1) * 8 = [0:8) + 1 = [1: 9)
		*/
		int rand_num = (int)(1 + Math.random()*8);
		
		if (rand_num >= 1 && rand_num <= 5) { System.out.println(rand_num); }
		else { System.out.println(6); }
	}
}