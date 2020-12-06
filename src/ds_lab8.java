
import java.io.*;
import java.util.StringTokenizer;

public class ds_lab8 {
    static int len = (int)1e6;
    static InputReader input;
    static PrintWriter output;

    public static void main(String[] args) throws IOException {
        InputStream ins = System.in;
        input = new InputReader(ins);
        output = new PrintWriter(System.out);
        
        new Task().solve(input, output);
        output.close();
    }

    static class Task{
        public void solve(InputReader input,PrintWriter output) {
            int [] f = new int[len+10];
            int [] ok = new int[len+10];
            int n;
            String s = input.next();
            n = s.length();
            f[0] = 0;f[1] = 0;
            for (int i = 1;i < n;i++) {
                int j = f[i];
                while (j>0 && s.charAt(i)!=s.charAt(j)) {
                    j = f[j];
                }
                if (s.charAt(i)==s.charAt(j)) {
                    f[i+1] = j+1;
                    if (i<n-1) {
                        ok[j+1] = 1;
                    }
                }
                else{
                    f[i+1] = 0;
                }

            }

            int j = f[n];
            int temp = 0;
            while (j>0) {
                if (ok[j]==1) {
                    temp = Math.max(temp, j);
                }
                j = f[j];
            }

            if (s.charAt(n-1)==s.charAt(0) && ok[1]==1) {
                temp = Math.max(1, temp);
            }
            if (temp==0) {
                output.print("Just a legend");
            }else {
                for (int i = 0;i < temp;i++) {
                    output.print(s.charAt(i));
                }
            }
        }
    }
    static class InputReader{
        public BufferedReader br;
        public StringTokenizer tk;

        public InputReader(InputStream ins) {
            br = new BufferedReader(new InputStreamReader(ins));
            tk = null;
        }

        public String next(){
            while (tk==null || !tk.hasMoreTokens()) {
                try {
                    tk = new StringTokenizer(br.readLine());
                }catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tk.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
