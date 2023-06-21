import java.util.*;

public class optionalstring{
    // public static int Max_N = 1000;
    // public static int optionstr_N = 2;
    public static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] allstr = new String[]{"b", "a", "n", "a", "n", "a"};
        String optionstr = "na";

        for(int i=0; i<allstr.length; i++){
            for(int j=i+1; j<allstr.length; j++){
                String test = allstr[i] + allstr[j];
                System.out.println(test);
                if(test.equals(optionstr))
                    count++;
            }
        }
        System.out.println(count);
    }
}