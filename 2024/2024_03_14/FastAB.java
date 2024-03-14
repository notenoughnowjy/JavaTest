import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FastAB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n; i++){
            String A_and_B = br.readLine();
            StringTokenizer st = new StringTokenizer(A_and_B);
            String array[] = A_and_B.split(" ");

            int A = Integer.parseInt(array[0]);
            int B = Integer.parseInt(array[1]);

            String C = Integer.toString(A+B);

            bw.write(C);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
