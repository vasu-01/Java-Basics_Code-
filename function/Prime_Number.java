import java.util.*;
public class Prime_Number {
    public static void prime_no(int n){
        int temp=0;
        if(n==0||n==1)
        {
            System.out.println("Non-Prime Number");
        }

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                temp++;
                break;
            }
        }
        if(temp==0 ){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        prime_no(n);
    }
}
