public class RelativelyPrime {

    private static int checkGcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        return x;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n < 0) {
            System.out.println("Invalid value!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(checkGcd(i, j) == 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
