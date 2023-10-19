import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
}
