import java.util.*;
public class Triangle {
    public static void triangle(float a,float b,float c){
        if(a==b && a==c){
            System.out.print("Triangle is eqilateral.");
        }
        else if((a==b && a!=c) || (a!=b && a==c) || (b==a && b!=c) || (b!=a && b==c) || (c==a && c!=b) || (c!=a && c==b) ){
            System.out.print("Triangle is scalene.");
        }
        else{
            System.out.print("Triangle is isosceles.");
        } 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter all three sides of triangle:");
        float a=sc.nextFloat();        
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        triangle(a, b, c);

    }
}
