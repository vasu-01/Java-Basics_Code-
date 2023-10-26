import java.util.*;
public class Vowel {
    public static void vowel(char c){
        
        if( c == 'a' || c=='e' || c == 'i' || c== 'o' || c == 'u'){
            System.out.print(c+" is a vowel.");
        }
        else if( c == 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U'){
            System.out.print(c+" is a vowel.");
        }
        else{
            System.out.print(c+" is not a vowel.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char c=sc.next().charAt(0);
        vowel(c);
    }
}
