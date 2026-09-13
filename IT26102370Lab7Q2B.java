
public class IT26102370Lab7Q2B {

    public static void main(String[] args) {

        int raw = 1 , column = 1;

        while(raw<=5){

            column = 1;

            System.out.print(raw + " - ");

            while(column <= raw){
                System.out.print("* ");
                column++;
            }

            System.out.println();
            raw++;

        }


    }
}
