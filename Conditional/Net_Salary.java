import java.util.Scanner;

public class Net_Salary{

    public static void main(String[] args) {
        System.out.println("Enter your Basic salary");
        Scanner scan = new Scanner(System.in);
        float basic_salary = scan.nextFloat();
        float hra = basic_salary*30/100;
        float ta = 2000;
        float da = basic_salary*20/100;
        int pf_or_tax =1500;

        float Gross_Salary = basic_salary + hra + ta + da ;

        float net_salary = Gross_Salary - pf_or_tax;

        System.out.println("Basic salary : " + basic_salary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("TA : " + ta);
        
        System.out.println("Gross salary is : " + Gross_Salary);
        System.out.println("Net salary is : " + net_salary);

    }
}
