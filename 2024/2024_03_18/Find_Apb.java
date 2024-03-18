import java.io.*;

public class Find_Apb {
    public static final int max_n = 100;
    public static char[] getAlphabet = new char[max_n];
    public static char[] alphabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w' ,'x' ,'y' ,'z'};
    public static int[] result = new int[alphabet.length];
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        getAlphabet = s.toCharArray();

        for(int i=0; i<alphabet.length; i++){
            result[i] = -1;
        }

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<alphabet.length; j++){
                if(result[j] != -1)
                    continue;
                if(getAlphabet[i] == alphabet[j])
                    result[j] = i;
            }
        }


        for(int i=0; i< alphabet.length; i++){
            bw.write(Integer.toString(result[i]));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}
