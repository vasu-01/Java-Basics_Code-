import java.util.*;
public class SwaptwoNo {
    public static void Swap_with_variable(int a,int b ){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.print("With Variable:-\nNow a is:"+a+"\n");
        System.out.print("Now b is:"+b+"\n Without variable:- \n");
        
    }
    public static void Swap_without_variable(int a,int b ){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("Now a is:"+a+"\n");
        System.out.print("Now b is:"+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value in a :");
        int a=sc.nextInt();
        System.out.print("Enter the value in b:");
        int b=sc.nextInt();
        int result=0;
        Swap_with_variable(a,b);
        Swap_without_variable(a, b);

    }
}
