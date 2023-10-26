import java.util.*;
public class Even_Odd_100 {
    public static void Even_Odd(int n){
        int temp=0;
        for(int i=1;i<=100;i++){
            if(n%i==0){
                temp++;
                break;
            }
        }
        if(temp==1){
            System.out.print(n+" is a Even Number.");
        }
        else{
            System.out.print(n+" is a Odd Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        Even_Odd(n);
    }
}