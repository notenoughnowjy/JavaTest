import java.util.Scanner;
public class threenumbermax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int minvalue = Integer.MAX_VALUE;

        for(int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        minvalue = Math.min(minvalue, arr[i]);
        }
        System.out.println(minvalue);


    }
}