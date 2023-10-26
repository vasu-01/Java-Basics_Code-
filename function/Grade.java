import java.util.*;
public class Grade {
    public static void Grade(int n){
        if(n>=90){
            System.out.print("A Grade");
        }
        else if(n<=89 && n>=70){
            System.out.print("B Grade");
        }
        else if(n>=69 && n>=50){
            System.out.print("C Grade");
        }
        else if(n<50){
            System.out.print("D Grade");
        }
        else{
            System.out.print("Invalid Percentage");
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your percentage:");
        int n=sc.nextInt();
        Grade(n);
    }
}
