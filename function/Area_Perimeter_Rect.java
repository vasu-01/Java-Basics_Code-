import java.util.*;
public class Area_Perimeter_Rect {
    public static int area(int l,int b){
        int result=0;
        result=l*b;
        System.out.print("Area is:"+result);
        System.out.println();
        return(result);
    }
     public static int perimeter(int l,int b){
        int result=0;
        result=2*(l+b);
        System.out.print("Perimeter is:"+result);
        return(result);
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        int l=sc.nextInt();
        System.out.print("Enter the breadth:");
        int b=sc.nextInt();
        area(l,b);
        perimeter(l, b);
       


    }
}
