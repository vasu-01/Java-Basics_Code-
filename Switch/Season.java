import java.util.*;
public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the month: ");
        String ch=sc.next();
        switch(ch){
            case "January":{
                System.out.print(ch+" is a month of winter season.");
                break;
            }

            case "February":{
                System.out.print(ch+" is a month of winter season.");
                break;
            }

            case "March":{
                System.out.print(ch+" is a month of summer season.");
                break;
            }

            case "April":{
                System.out.print(ch+" is a month of summer season.");
                break;
            }

            case "May":{
                System.out.print(ch+" is a month of summer season.");
                break;
            }

            case "June":{
                System.out.print(ch+" is a month of rainy season.");
                break;
            }

            case "July":{
                System.out.print(ch+" is a month of rainy season.");
                break;
            }

            case "August":{
                System.out.print(ch+" is a month of rainy season.");
                break;
            }

            case "September":{
                System.out.print(ch+" is a month of rainy season.");
                break;
            }

            case "October":{
                System.out.print(ch+" is a month of autumn season.");
                break;
            }

            case "November":{
                System.out.print(ch+" is a month of autumn season.");
                break;
            }

            default:{
                System.out.print("Pls Enter correct choice!!!");
            }
            
        }
    }
}

