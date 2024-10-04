import java.util.Scanner;
public class IT24103124Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            int billAmount = input.nextInt();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentMode = input.next().charAt(0);

            if (!(paymentMode == 'C' || paymentMode == 'c' || paymentMode == 'O' || paymentMode == 'o')) {
                System.out.println("Payment Mode is Not Valid.");
            } else {
                if (paymentMode == 'C' || paymentMode == 'c') {
                    float discount = (float)billAmount * 5/100;
                    float discountPrice = (float)billAmount * 95/100;
                    System.out.println("Dicount is : " + discount);
                    System.out.println("Amount to be paid : " + discountPrice);
                } else {
                    System.out.println("No discount applicable.");
                }
            }
            System.out.println();
        }
        input.close();
    }
}