import java.util.Scanner;

public class IT26102370Lab7Q1A {
    public static void main(String[] args) {

        int count, sum = 0;
        int marks[] = new int[4];
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects:");

        for (count = 0; count < 4; count++) {
            System.out.print("Enter subject marks " + (count + 1) + ": ");
            marks[count] = input.nextInt();

            if (marks[count] >= 0 && marks[count] <= 100) {
                sum = sum + marks[count];
            }
            else {
                input.close();
                return;
            }
        }

        average = (double) sum / count;

        System.out.println();
        System.out.println("Average is: " + average);

        if (average >= 75) {
            System.out.println("Overall Grade is: Distinction");
        }
        else if (average >= 50) {
            System.out.println("Overall Grade is: Credit");
        }
        else {
            System.out.println("Overall Grade is: Fail");
        }

        input.close();
    }
}