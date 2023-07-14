import java.util.Arrays;
import java.util.Scanner;

public class maxvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        for(int i=0; i<n; i++){
            array1[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            array2[i] = sc.nextInt();
        }
        boolean isEqual = checkArrayEquality(array1, array2);
        
        if (isEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    
    
    public static boolean checkArrayEquality(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}
