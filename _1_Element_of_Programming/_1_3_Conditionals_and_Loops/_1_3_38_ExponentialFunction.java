class _1_3_38_ExponentialFunction {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        int N = 1_000_000;

        double sum = 0;

        // 1. Math.exp
        long start = System.nanoTime();
        for (int k = 0; k < N; k++) {
            sum += Math.exp(x);
        }
        long end = System.nanoTime();
        System.out.println("Math.exp: " + (end - start));

        // 3. Taylor (fixed 100 terms)
        start = System.nanoTime();
        for (int k = 0; k < N; k++) {
            double result = 1;
            double power = 1;
            for (int i = 0; i < 100; i++) {
                power *= x / (i + 1);
                result += power;
            }
            sum += result;
        }
        end = System.nanoTime();
        System.out.println("Method 3: " + (end - start));

        // 4. Taylor + early stop
        start = System.nanoTime();
        for (int k = 0; k < N; k++) {
            double result = 1;
            double power = 1;
            for (int i = 0; i < 100; i++) {
                power *= x / (i + 1);
                result += power;
                if (power < 1e-15) break;
            }
            sum += result;
        }
        end = System.nanoTime();
        System.out.println("Method 4: " + (end - start));
    }
}