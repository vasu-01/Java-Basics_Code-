import java.util.*;
public class Menu_Driven_Calculator {
    public static int Addition(int a , int b){
        int sum=0;
        sum=a+b;
        System.out.print("Addition is:"+sum);
        return(sum);
    }
    public static int Subtraction(int a , int b){
        int sub=0;
        sub=a-b;
        System.out.print("Subtraction is:"+sub);
        return(sub);
    }
    public static int Multiplication(int a , int b){
        int mul=0;
        mul=a*b;
        System.out.print("Multiplication is:"+mul);
        return(mul);
    }
    public static int Division(int a , int b){
        int div=0;
        div=a/b;
        System.out.print("Multiplication is:"+div);
        return(div);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.print("\n\n1.Addition \n2.Subtration \n3.Multiplication \n4.Division \n5.Exit");
        System.out.print("Enter any one choice to perform calculation from above operations:");
        int ch=sc.nextInt();
        
            switch(ch){
            case 1:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                Addition(a, b);
                break;
            }

            case 2:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                Subtraction(a, b);
                break;
            }

            case 3:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                Multiplication(a, b);
                break;
            }

            case 4:{
                System.out.print("Enter the any to numbers a and b:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                Division(a, b);
                break;
            }

            case 5:{
                System.exit(0);
            }

            default:{
                System.out.print("Pls Enter correct choice!!!");
            }
        }
            
        }
    }
}

