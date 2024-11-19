package solutionHackerrank;
    import java.io.*;


public class DecimalToBinary {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();
            int i =0;
            int rem [] = new int[100];
            while(n>0){
                 rem [i] = n % 2;
                n = n/2;
                i++;
            }
            for (int j = i-1; j >=0 ; j --) {
                System.out.print(rem[j]);
            }

        }
    }
