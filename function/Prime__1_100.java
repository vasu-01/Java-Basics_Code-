import java.util.*;
public class Prime__1_100 {
    public static void prime_1_100(int n){
       int temp=0;
       for(int i=1;i<=100/2;i++){
            if(n==0||n==1)
            {
                System.out.println("Non-Prime Number");
            }
            for(int j=2;i<=i/2;++j)
            if(i%j==0){
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
        prime_1_100(n);
    }
}
