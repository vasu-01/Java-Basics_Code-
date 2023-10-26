import java.util.*;
public class Leapyer_or_Not {
    public static void leapyear(int year){
        if(year%400==0){
            System.out.print(year+" is a leap year.");
        }
        else if(year%100==0){
            System.out.print(year+" is Not a leap year.");
        }
        else if(year%4==0){
                System.out.print(year+" is a leap year.");
        }
        else{
            System.out.print(year+" is not a leap year.");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=sc.nextInt();
        leapyear(year);
    }
}
