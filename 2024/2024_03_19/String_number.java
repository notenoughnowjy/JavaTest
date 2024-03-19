import java.io.*;
import java.util.StringTokenizer;

public class String_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        " "을 통해서 토큰 나누기
        StringTokenizer st = new StringTokenizer(br.readLine() + " ");

//        토큰 개수 세리기
        bw.write(Integer.toString(st.countTokens()));
        bw.flush();
        bw.close();

    }
}
