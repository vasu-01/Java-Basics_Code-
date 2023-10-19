import java.util.*;
public class Weekday_WeekEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day:");
        String ch=sc.next();
        switch(ch){
            case "Sunday":{
                System.out.print(ch+" is a week-end day.");
                break;
            }

            case "Monday":{
                System.out.print(ch+" is a week day.");
                break;
            }

            case "Tuesday":{
                System.out.print(ch+" is a week day.");
                break;
            }

            case "Wednesday":{
                System.out.print(ch+" is a week day.");
                break;
            }

            case "Thursday":{
                System.out.print(ch+" is a week day.");
                break;
            }

            case "Friday":{
                System.out.print(ch+" is a week day.");
                break;
            }

            case "Saturday":{
                System.out.print(ch+" is a week-end day.");
                break;
            }


            default:{
                System.out.print("Pls Enter correct choice!!!");
            }
            
        }
    }
}

