import java.io.*;

public class ASCII_Code{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char c = br.readLine().charAt(0);
        bw.write(Integer.toString((int)c));
        bw.flush();
        bw.close();
    }
}