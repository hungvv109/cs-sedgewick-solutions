class DragonCurves {
	public static void main(String[] args) {
		/*
		Input: n
		Output:
			- curve(n) = curve(n-1) + 'L' + convert(n-1)

		Convert:
		1. Revert.
		2. Convert F->L, L->F.
		n = 0: F
		n = 1: FLF
		*/
        String dragon0 = "F";
        String dragon1 = dragon0 + "L" + dragon0;
        String nogard1 = dragon0 + "R" + dragon0;
        String dragon2 = dragon1 + "L" + nogard1;
        String nogard2 = dragon1 + "R" + nogard1;
        String dragon3 = dragon2 + "L" + nogard2;
        String nogard3 = dragon2 + "R" + nogard2;
        String dragon4 = dragon3 + "L" + nogard3;
        String nogard4 = dragon3 + "R" + nogard3;
        String dragon5 = dragon4 + "L" + nogard4;

        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);		
	}
}