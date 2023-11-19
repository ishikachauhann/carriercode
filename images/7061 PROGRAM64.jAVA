import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

     
        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        
        int count = 0;

       
        while (n > 0) {
          
            count = count + 1;

            
            n = n / 10;
        }

        
        System.out.println("The number of digits in the input is: " + count);
    }
}
