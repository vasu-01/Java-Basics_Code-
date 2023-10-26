import java.util.*;
public class Insurance {
    public static void premium(String name,String gender,int age,String city){

        String g1="male";
        String g2="female";

        String c1="metro";
        String c2="non-metro";
        
        if(age>=25 && age<=35){
            if(gender.equals(g1) && city.equals(c1)){
                 System.out.print("Your premium is 6%.");
            }
           
            else{
                System.out.print("Age should be between 25 to 45 ");
            }

        }
        else if(age>=25 && age<=42){
            if(gender.equals(g2) && city.equals(c1)){
                System.out.print("Your premium is 3%");
            }
        }
        else if(age>25 && age<=40){
            if(gender.equals(g1) && city.equals(c2)){
                 System.out.print("Your premium is 4%.");
            }
           
            else{
                System.out.print("Age should be between 25 to 45 ");
            }        
        }
         else if(age>=25 && age<=45){
            if(gender.equals(g2) && city.equals(c2)){
                System.out.print("Your premium is 2%");
            }
         }

    }
    public static void main(String[] args) {
       

        Scanner sc=new Scanner (System.in);
        System.out.print("Enter your name:");
        String name=sc.next();

        System.out.print("Enter your gender:");
        String gender=sc.next();

        System.out.print("Enter your age:");
        int age=sc.nextInt();

        System.out.print("Enter your city (metro or non-metro):");
        String city=sc.next();
        premium(name, gender, age, city);

        
    }
}
