public class _1_3_46_EulerSumOfPowersConjecture {
    public static void main(String[] args) {
        long limit = 150; 

        for (long e = 1; e <= limit; e++) {
            long e5 = e * e * e * e * e;

            for (long a = 1; a <= e; a++) {
                long a5 = a * a * a * a * a;

                for (long b = a; b <= e; b++) {
                    long b5 = b * b * b * b * b;

                    for (long c = b; c <= e; c++) {
                        long c5 = c * c * c * c * c;

                        for (long d = c; d <= e; d++) {
                            long d5 = d * d * d * d * d;

                            if (a5 + b5 + c5 + d5 == e5) {
                                System.out.println("Find!");
                                System.out.println("a = " + a);
                                System.out.println("b = " + b);
                                System.out.println("c = " + c);
                                System.out.println("d = " + d);
                                System.out.println("e = " + e);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No limit " + limit);
    }
}