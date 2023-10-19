import java.util.*;
public class bmicalculator {
    public static void main(String[] args) {
        //weight in kg/height^2
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int weight=sc.nextInt();
        System.out.println((weight/(height*height)<=18.9?"Underweight":(weight/(height*height)>=24.9)?"Overweight":"Healthy"));
    }
}
