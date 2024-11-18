import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter A number to get fibonacci number :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 0;
        int b = 1;
            for (int i = 1; i <= (x - 1); i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("fibbonaci number at place " + x + " is:" + b);

    }

}
