
import java.util.Scanner;

public class IT26102370Lab7Q1B {

    public static void main(String[] args) {

        int count,sum,countStudent;
        int marks[] = new int[4];
        double average;

        Scanner input = new Scanner(System.in);

        for(countStudent=1; countStudent <= 3; countStudent++) {

            sum = 0;

            System.out.println("Student " + countStudent);
            System.out.print("Enter subject marks: ");



            for (count = 0; count < 4; count++) {

                marks[count] = input.nextInt();

                sum = sum + marks[count];

            }


            average = sum / count;

            if ((average > 100) || (average < 0)) {
                System.out.println("Marks are invalid!");
                return;

            }


            System.out.println("Average is: " + average);


            if (average >= 75) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is: Credit");
            } else if (average >= 0) {
                System.out.println("Overall Grade is: Fail");
            }

            System.out.println("\n");


        }









    }
}
