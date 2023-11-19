import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

       
        int odd = 1;
        int sum = 0;

        
        System.out.println("The first " + n + " odd natural numbers are:");

        
        for (int i = 1; i <= n; i++) {
           
            System.out.print(odd + " ");

           
            sum = sum + odd;

           
            odd = odd + 2;
        }

        
        System.out.println("\nThe sum of the first " + n + " odd natural numbers is: " + sum);
    }
}
