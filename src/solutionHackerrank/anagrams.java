package solutionHackerrank;
import java.util.Scanner;

public class anagrams {

    static boolean isAnagram(String a, String b) {
      char[] aArr = a.toLowerCase().toCharArray();
      char[] bArr = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(aArr);
        java.util.Arrays.sort(bArr);
        return java.util.Arrays.equals(aArr,bArr);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
