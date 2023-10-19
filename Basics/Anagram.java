import java.util.*;

public class Anagram {

    public static void anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] charArr_1=str1.toCharArray();
            char[] charArr_2=str2.toCharArray();

            Arrays.sort(charArr_1);
            Arrays.sort(charArr_2);

            boolean result=Arrays.equals(charArr_1,charArr_2);

            if(result){
                System.out.println(str1+" and "+str2 +" are Anagram");
            }
            else{
                System.out.println(str1+" and "+str2 +" are not Anagram");

            }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter the first string:");
           String str1=sc.next();

           System.out.print("Enter the second string:");
           String str2=sc.next();
           anagram(str1,str2);

    }

}
