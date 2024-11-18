import java.util.Scanner;
public class Armstrong {
    public static boolean IsArmstong(int n){
        int temp = n;
        int sum =0;
        while (n>0){
                int rem = n%10;
            n /= 10;
                sum = sum + (rem * rem * rem);
        }

        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number or not..:- ");
        int n = in.nextInt();
        System.out.println(IsArmstong(n));
        for (int i = 100 ; i < 1000; i++)
            if (IsArmstong(i)) {
                System.out.print(i + " ");
            }
        System.out.println(":-are Armstrong numbers from 100 - 1000. ");
    }

}