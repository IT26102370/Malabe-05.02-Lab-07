
public class IT26102370Lab7Q2C {

    public static void main(String[] args) {

        int raw = 5 , column = 1;

        while(raw <= 5 && raw >0){

            column = 1;

            while(column <= raw){
                System.out.print(raw);
                column++;
            }

            System.out.println();
            raw--;

        }


    }
}
