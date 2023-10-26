import java.util.*;
public class NetSalary {
    public static float Hra(float basic_salary){
        float hra = basic_salary*30/100;
        System.out.print("Your hra is:"+hra +"\n");
        return(hra);
    }
    public static float Ta(float basic_salary){
        float ta = basic_salary*20/100;
        System.out.print("Your ta is:"+ta+"\n");
        return(ta);
    }
    public static float Da(float basic_salary){
        float da = basic_salary*10/100;       
        System.out.print("Your da is:"+da+"\n");
        return(da);
    }
    public static float Net_Salary(float basic_salary,float hra,float da,float ta,float pf){
        float net_salary=0;
        net_salary=basic_salary+hra+ta+da-pf;
        System.out.print("Your Net Salary is:Rs."+net_salary);
        return(net_salary);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your basic salary:");
        float basic_salary=sc.nextFloat();
        float da;
        float hra;
        float ta;
        float pf=1400;
        Hra(basic_salary);
        Ta(basic_salary);
        Da(basic_salary);
        Net_Salary(basic_salary,hra,da,ta,pf);

    }
}

//Function Principles
//1.  DRY:Do Not Repeat yourself
//means no particular block of code or line should not be repeat
//or no repeat


//Single Responsibility 