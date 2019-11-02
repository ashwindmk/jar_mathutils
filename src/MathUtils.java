public class MathUtils {
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("No arguments passed");
            System.out.println("Usage: add 12.5 2.5");
            return;
        }

        String op = args[0];

        if (op.equals("add")) {
            double a = Double.valueOf(args[1]);
            double b = Double.valueOf(args[2]);
            add(a, b);
        }

        else if (op.equals("sub")) {
            double a = Double.valueOf(args[1]);
            double b = Double.valueOf(args[2]);
            sub(a, b);
        }

        else if (op.equals("mul")) {
            double a = Double.valueOf(args[1]);
            double b = Double.valueOf(args[2]);
            mul(a, b);
        }

        else {
            System.out.println("Invalid operation: " + op);
        }
    }

    private static void add(double a, double b) {
        System.out.println((a + b));
    }

    private static void sub(double a, double b) {
        System.out.println((a - b));
    }

    private static void mul(double a, double b) {
        System.out.println((a * b));
    }
}
