import java.util.*;
public class Claculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("1.Addition \n2.Subtration \n3.Multiplication \n4.Division \n");
        System.out.print("Enter any one choice to perform calculation from above operations:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int sum=0;
                sum=a+b;
                System.out.print("Addition is:"+sum);
                break;
            }

            case 2:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int sub=0;
                sub=a-b;
                System.out.print("Subtraction is:"+sub);
                break;
            }

            case 3:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int mul=0;
                mul=a*b;
                System.out.print("Multiplication is:"+mul);
                break;
            }

            case 4:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int div=0;
                div=a/b;
                System.out.print("Multiplication is:"+div);
                break;
            }

            default:{
                System.out.print("Pls Enter correct choice!!!");
            }
            
        }
    }
}
