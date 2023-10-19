import java.util.*;
public class Reverse_No {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int n=sc.nextInt();
        int reverse_no=0,a;

        while(n!=0){
            a=n%10;
            reverse_no=reverse_no*10 + a;
            n=n/10;
        }

        System.out.println("Reversed Number is: "+reverse_no);
    }
}
