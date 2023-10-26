import java.util.*;
public class Sum_Of_Digit {
    public static int sum_of_digit(int n){
        int sum=0;
        while(n>0){
            int a=n%10;
            sum=sum+a;
            n=n/10;
        }
        System.out.print("Sum of number is:"+sum);
        return(sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        sum_of_digit(n);
    }
}
