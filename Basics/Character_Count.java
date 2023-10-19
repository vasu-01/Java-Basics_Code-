import java.util.*;
public class Character_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.print("Enter any string:");
        String str=sc.next();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count+=1;
            }
        }
        System.out.print(count);
    }
}
