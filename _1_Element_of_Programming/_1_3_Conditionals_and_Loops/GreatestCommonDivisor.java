public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x < 1 && y < 1) {
            System.out.println("Invalid values!");
            return;
        }

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println(x);
    }
}
