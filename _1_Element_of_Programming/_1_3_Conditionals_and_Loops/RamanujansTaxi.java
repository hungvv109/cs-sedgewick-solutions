public class RamanujansTaxi {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int a = 1; a*a*a <= n; a++) {
            for (int b = 1; b*b*b <= n; b++) {
                for (int c = 1; c*c*c <= n; c++) {
                    for (int d = 1; d*d*d <= n; d++) {

                        if (a*a*a + b*b*b == c*c*c + d*d*d &&
                            (a != c || b != d)) {

                            int sum = a*a*a + b*b*b;

                            if (sum <= n) {
                                System.out.println(
                                  sum + " = " +
                                  a + "^3 + " + b + "^3 = " +
                                  c + "^3 + " + d + "^3");
                            }
                        }
                    }
                }
            }
        }
    }
}