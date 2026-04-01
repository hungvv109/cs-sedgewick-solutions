public class CheckSum {
    public static void main(String[] args) {
        
        int num = Integer.parseInt(args[0]);
        int tmp = 2;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit * tmp;
            tmp++;
            num /= 10;
        }

        System.out.println("sum = " + (sum+(11-sum%11)));
    }
}
