import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Char_and_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        int[] a = new int[100];

        for(int i=0; i<3; i++)
            a[i] = Integer.parseInt(st.nextToken());

        String array[] = s.split(" ");

        for(int i=0; i<3; i++){
//            System.out.println(a[i]);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] c = new char[100];
        String[] strings = new String[100];
        for(int i=0; i<3; i++){
            strings[i] = Integer.toString(a[i]);
        }
        for(int i=0; i<3; i++){
            bw.write(strings[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
