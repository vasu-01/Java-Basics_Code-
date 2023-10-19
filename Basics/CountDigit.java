import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int a;
        int r=0;
        while(n>0){
           
            n=n/10;
            r++;
        }
        System.out.println(r);
    }
}
