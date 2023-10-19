package Basics;
import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println((age<=10)?"Child":(age>=10&&age<=20)?"Teenager":(age>=20&&age<=34)?"Adult":"Senior");
    }
}
