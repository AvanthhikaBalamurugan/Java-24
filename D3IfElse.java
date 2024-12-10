import java.util.*;
public class D3IfElse {
    //take user input , if he is above 18 he can vote if he is less than 18 he cant vote and if he is correct 18 then say u can vote next yea
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = in.nextInt();
         if(age>18){
            System.out.println("He is eligible to vote");
        }
        else if(age==18){
            System.out.println("Next Year");
        }else{
         System.out.println("He is not eligible to vote");
         in.close();
    }
}
}
