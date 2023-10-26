import java.util.*;
public class SI {
    public static float Simple_Interest(float p,float r ,float t ){
        float result=0;
        result=(p*r*t)/100;
        System.out.print("Your interest will be:"+result);
        return(result);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        float p=sc.nextFloat();
        System.out.print("Enter the rate of interest:");
        float r=sc.nextFloat();
        System.out.print("Enter the time period:");
        float t=sc.nextFloat();
        float result=0;
        Simple_Interest(p, r, t);

    }
}
