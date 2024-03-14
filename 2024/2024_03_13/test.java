import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        for(int i=a; i<=b; i++){
            if(i == c)
                continue;
            System.out.println(i);
        }
    }
}
