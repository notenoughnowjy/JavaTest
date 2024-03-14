import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Char_and_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());

        int tepm = Integer.parseInt(s);

        System.out.println(s + i + tepm);
    }
}
