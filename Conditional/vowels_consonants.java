import java.util.*;
public class vowels_consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char c=sc.next().charAt(0);
        if( c == 'a' || c=='e' || c == 'i' || c== 'o' || c == 'u'){
            System.out.print(c+" is a vowel.");
        }
        else if( c == 'A' || c == 'E' || c == 'I' || c== 'O' || c == 'U'){
            System.out.print(c+" is a vowel.");
        }
        else{
            System.out.println(c+" is Consonant");
        }

    }
}
