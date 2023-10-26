import java.util.*;
public class Positive_or_Negative {
    public static void Positive_Or_Negative(int n){
        if(n>0){
            System.out.print(n+" is a positive number.");
        }
        else if(n<0){
            System.out.print(n+" is a negative number.");
        }
        else{
            System.out.print(n+"is zero.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        Positive_Or_Negative(n);
    }
}
