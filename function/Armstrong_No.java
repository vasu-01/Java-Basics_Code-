import java.util.*;
public class Armstrong_No {
    public static int Armstrong_No(int n){
        int result=0;
        while(n>0){
            int a=n%10;
            result=result+(a*a*a);
            n=n/10;
        }
        if(result==n){
            System.out.print(n+" is a Armstrong Number.");
        }
        else{
            System.out.print(n+" is not a Armstrong Number.");

        }
        return(result);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        Armstrong_No(n);
    }
}
