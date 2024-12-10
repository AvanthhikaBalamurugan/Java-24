import java.util.*;

public class D2Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = in.nextInt();
        System.out.println(num);
        
        // Consume the leftover newline character
        in.nextLine();
        
        System.out.println("Enter the string");
        String value = in.nextLine();
        System.out.println(value);
        in.close();
    }
}
