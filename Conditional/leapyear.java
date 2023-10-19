package if_else_Questions;
import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println("  is Leap Year");
        } 
        else if(year%100==0){
            System.out.println("  is not a Leap Year");
        }
        else if(year%400==0){
            System.out.println("  is a Leap Year");
        }
    }
}
