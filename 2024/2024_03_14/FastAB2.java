import java.io.*;
import java.util.StringTokenizer;

public class FastAB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            String sum = Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            bw.write(sum);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
