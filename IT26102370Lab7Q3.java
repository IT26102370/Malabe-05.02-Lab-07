import java.util.Scanner;
public class IT26102370Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int customer,amount;
        char mode;
        final double DISCOUNT = 0.05;
        double discount,totalAmount;

            for(customer = 1; customer <= 5; customer++){

                System.out.println("Customer " + customer);
                System.out.print("Enter total bill amount: ");
                amount = input.nextInt();

                System.out.print("Enter mode of payment (C for cash, O for other): ");
                mode = Character.toLowerCase(input.next().charAt(0));

                if((mode != 'c') && (mode != 'o')){
                    System.out.println("Payment mode is not valid");

                }

                    switch(mode){

                        case 'c' :
                            discount = amount * DISCOUNT;
                            totalAmount = amount - discount;

                            System.out.println("Discount is: " + discount);
                            System.out.println("Amount to be paid: " + totalAmount);
                            break;

                        case 'o' :
                            System.out.println("No discount applicable");
                            System.out.println("Amount to be paid: " + amount);
                            break;


                    }

                System.out.println();





            }


    }
}