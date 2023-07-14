import java.util.Scanner;
public class printstars {
    public static void printStar(int n, String star){
        for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(star);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = sc.next();
         printStar(n, star);
    }
}