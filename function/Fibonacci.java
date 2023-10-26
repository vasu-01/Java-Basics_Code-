import java.util.*;
public class Fibonacci {
    public static int Fibonacci(int n){
        int a=0;
        int b=1;
        int next=0;
        System.out.print("Series is: "+a+","+b);
        next=a+b;
        while(next<=n){
            System.out.print(","+next);
            a=b;
            b=next;
            next=a+b;
        }
        return(next);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        Fibonacci(n);
    }
}
