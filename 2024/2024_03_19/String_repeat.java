import java.io.*;
import java.util.StringTokenizer;

public class String_repeat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int repeat_word = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for(int j=0; j<word.length(); j++){
                for(int k=0; k<repeat_word; k++){
                    bw.write(word.charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
