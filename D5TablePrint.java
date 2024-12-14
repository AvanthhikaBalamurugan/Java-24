import java.util.*;

public class D5TablePrint {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {

            int product = number * i;
            System.out.println(number + "*" + i + "=" + product);

        }
        input.close();
    }

}