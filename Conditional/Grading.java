package if_else_Questions;
import java.util.*;
public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Marks=sc.nextInt();
        if(Marks>=60){
            System.out.println("Excellent");
        }
        else if(Marks>=33 && Marks<=79){
            System.out.println("Good");
        }
        else if(Marks<=32){
            System.out.println("Fail");
        }
        else{
            System.out.println("Enter valid number!");
        }
    }
}
