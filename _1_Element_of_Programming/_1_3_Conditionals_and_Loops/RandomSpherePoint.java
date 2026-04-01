public class RandomSpherePoint {
    public static void main(String[] args) {
        double x = Math.random();
        double y = Math.random();

        do {
            x = 2 * Math.random() - 1;
            y = 2 * Math.random() - 1;
        } while (x*x + y*y > 1);

        double a = 2 * x * Math.sqrt(1 - x*x - y*y);
        double b = 2 * y * Math.sqrt(1 - x*x - y*y);
        double c = 1 - 2*(x*x + y*y);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
