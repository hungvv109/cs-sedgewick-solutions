public class _1_3_43_MedianOf5 {
    public static void main(String[] args) {
        if (args.length < 5) return;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int temp;

        if (a < b) { temp = a; a = b; b = temp; }
        
        if (c < d) { temp = c; c = d; d = temp; }
        
        if (a < c) {
            temp = a; a = c; c = temp;
            temp = b; b = d; d = temp;
        }

        if (b < e) { temp = b; b = e; e = temp; }

        int result;

        if (c >= b) {
            if (b >= d) {
                result = b;
            } else {
                result = d;
            }
        } else {
            if (c >= e) {
                result = c;
            } else {
                result = e;
            }
        }

        System.out.println("Median: " + result);
    }
}
