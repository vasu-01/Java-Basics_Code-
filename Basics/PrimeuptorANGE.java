import java.util.*;
public class PrimeuptorANGE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.print("Enter the size :");
        int n=sc.nextInt();
        for(int i=2;i<n;i++){

        for(int j=2;j<=i/2;j++){
            if(i%j==0){   
                temp++;
                break;
            }
        }
        if (temp!=0){
            System.out.print(i);
        }
        }

    }
}
