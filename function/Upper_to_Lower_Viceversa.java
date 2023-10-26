import java.util.*;
public class Upper_to_Lower_Viceversa {
    public static void Upper_to_Lower(String str){
        System.out.print(str.toLowerCase()+"\n");
    }
    public static void Lower_to_Upper(String str){
        System.out.print(str.toUpperCase());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.next();
        Upper_to_Lower(str);
        Lower_to_Upper(str);
    }
}
