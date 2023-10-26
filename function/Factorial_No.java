import java.util.*;
public class Factorial_No {
    public static int Factorial_No(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.print("Factorial of given number is:"+fact);
        return(fact);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        Factorial_No(n);
    }
}
