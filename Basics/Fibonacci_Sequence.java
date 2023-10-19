import java.util.*;
public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,next=0;
        System.out.print("Enter the number:");
        int n=sc.nextInt();

        System.out.print("Series is:"+a+""+b);
        next=a+b;

        while(next<=n){
            System.out.print(next);
            a=b;
            b=next;
            next=a+b;
        }

    }
}
