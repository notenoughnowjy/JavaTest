import java.io.*;

public class Char_length {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String result = Integer.toString(s.length());
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
