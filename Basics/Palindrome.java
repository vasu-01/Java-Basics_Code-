import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int a;
        while(n!=0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }

        if(n == rev){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a palindrome Number");
        }
    }
}
