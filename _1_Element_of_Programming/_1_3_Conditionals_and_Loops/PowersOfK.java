public class PowersOfK {
    public static void main(String[] args) {
        long k = Long.parseLong(args[0]);

        long res = 1;
        while(res <= Long.MAX_VALUE / k) {
            System.out.println(res);
            res *= k;
        }
    }
}