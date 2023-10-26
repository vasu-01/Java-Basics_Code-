import java.util.*;
public class Squareroot {
    public static void Squareroot(int n){
        int result=0;
        int s;
        for(int i=1;i<(n/2)+1;i++){
            result=i*i;
            if(result==n){
                s=i;
                System.out.print(s);
            }
        }
        // System.out.print(Math.sqrt(n));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int n=sc.nextInt();
        Squareroot(n);
    }
}
