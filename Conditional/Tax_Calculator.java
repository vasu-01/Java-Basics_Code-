import java.util.*;
public class Tax_Calculator {
    public static void main(String[] args) {
        int income_tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your salary:");
        int salary=sc.nextInt();
        if(salary<=10000){
            income_tax = salary*0;
            System.out.println("You have to pay no tax. \n So your tax is:"+ income_tax);
        }
        else if(salary>10000 && salary<=20000){
            income_tax = salary*10/100;
            System.out.println("You have to pay 10%  tax according to your salary. \nSo your tax is: Rs."+ income_tax);
        }
        else if(salary>20000 && salary<=30000){
            income_tax = salary*15/100;
            System.out.println("You have to pay 15%  tax according to your salary. \nSo your tax is: Rs."+ income_tax);
        }
        else if(salary>30000){
            income_tax = salary*25/100;
            System.out.println("You have to pay 25%  tax according to your salary  \nSo your tax is: Rs."+ income_tax);
        }
        else{
            System.out.println("Enter valid salary!");
        }
    }
}
