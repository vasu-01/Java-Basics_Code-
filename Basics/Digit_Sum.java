import java.util.*;
public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int r=0;
        int a;
        while(n>0){
            a=n%10;
            r=r+a;
            n=n/10;
        }
        System.out.println(r);
    }
}
