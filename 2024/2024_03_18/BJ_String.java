import java.io.*;

public class BJ_String {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String s = br.readLine();
            bw.write(Output_1_Last(s));
            bw.newLine();
        }
         bw.flush();
    }

    private static String Output_1_Last(String s) {
        return s.charAt(0) + "" + s.charAt(s.length()-1);
    }
}
