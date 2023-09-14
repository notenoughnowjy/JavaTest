import java.util.Scanner;

public class jinsoo_to_jinsoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int n = scanner.nextInt();

        int decimal = convertToDecimal(n, a);

        String result = convertToBase(decimal, b);
        System.out.println(result);
    }

    public static int convertToDecimal(int number, int base) {
        int result = 0;
        int multiplier = 1;

        while (number > 0) {
            int digit = number % 10;
            result += digit * multiplier;
            multiplier *= base;
            number /= 10;
        }

        return result;
    }

    public static String convertToBase(int number, int base) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;
            result.insert(0, remainder);
            number /= base;
        }

        return result.toString();
    }
}