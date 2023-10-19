import java.util.*;
public class temprature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Temprature in Celcius \n2.Temprature in Farhenhiet \n");
        System.out.print("Enter your choice:");
        int n=sc.nextInt();
        if(n==1){
            float cel=0;
            System.out.print("Enter temperature in Fahrenhiet: ");
            float far=sc.nextFloat();
            cel = (far - 32)*5/9;
            System.out.print("Temprature is: "+cel+"°C");
        }
        else if(n==2){
            float far=0;
            System.out.print("Enter temperature in Celsius: ");
            float cel=sc.nextFloat();
            far =(cel*9/5)+ 32;
            System.out.print("Temprature is: "+far+"°F");
        }
        else{
            System.out.println("Wrong choice!!");
        }

    }
}
