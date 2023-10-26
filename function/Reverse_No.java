import java.util.*;
public class Reverse_No {
    public static int Reverse_No(int n){
        int rev=0;
        while(n>0){
            int a=n%10;
            rev=(rev*10)+a;
            n=n/10;
        }
        System.out.print("Reverse of number is:"+rev);
        return(rev);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        Reverse_No(n);
    }
}
