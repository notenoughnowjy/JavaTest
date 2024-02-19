import java.util.Scanner;

public class Make_pair2 {
    static int result = 0;
    static final int max_n_length = 100;
    static char c[] = new char[max_n_length];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        c = str.toCharArray();

        for(int i=1; i<c.length; i++){
            if(c[i] == '(' && c[i-1] == '('){
                for(int j=i+1; j<c.length-1; j++){
                    if(c[j] == ')' && c[j+1] == ')')
                        result++;
                }
            }
        }
        System.out.println(result);
    }
}
