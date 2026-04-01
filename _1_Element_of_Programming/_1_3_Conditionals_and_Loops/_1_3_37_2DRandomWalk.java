public class _1_3_37_2DRandomWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = 1000;

        double total = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0;
            int count = 0;

            while (true) {
                int rd = (int)(Math.random() * 4);

                if (rd == 0) x++;
                else if (rd == 1) x--;
                else if (rd == 2) y++;
                else y--;

                count++;

                if (Math.abs(x) >= n || Math.abs(y) >= n) {
                    break;
                }
            }

            total += count;
        }

        double avg = total / trials;
        System.out.println(avg);
    }
}