import java.util.Scanner;

public class Strange_Jinsoo_2{
    static int result = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char c[] = str.toCharArray();
        char c2[] = str.toCharArray();

        int CLength = c.length;

        for(int i=0; i<CLength; i++){
            c = c2.clone();
            if(c[i] == '0')
                c[i] = '1';
            else c[i] = '0';

            int temp = 0;
            for(int j=0; j<CLength; j++){
                temp += Character.getNumericValue(c[j]) * Math.pow(2, CLength-1-j);
            }
            System.out.println("temp:"+ temp);
            result = Math.max(result, temp);
        }
        System.out.println(result);
    }
}