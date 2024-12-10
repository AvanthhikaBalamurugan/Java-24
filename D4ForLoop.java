
//to print sum of n number, if user input n =10 then sum will be 1+2+3...upto 10
import java.util.*;

public class D4ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num");
        int sum = 0;
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum + i;

        }
        System.out.println("Sum : " + sum);
    }
}
