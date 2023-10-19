import java.util.*;
public class Discount_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount you have shoppped to know your discount and total amount have to pay:");
        int Bill=sc.nextInt();
        int discount_1k=0;
        int discount_5k=0;
        int discount_10k=0;
        int discount_20k=0;
        int total_bill=0;
        if(Bill>=1000 && Bill<=5000){
            discount_1k =Bill*5/100;
            total_bill= Bill-discount_1k;
            System.out.print("Congrtualtions You have got Discount of: 5% \nYou have to pay total : Rs."+total_bill);
        }
        else if(Bill>5000 && Bill<=10000){
            discount_5k=Bill*10/100;
            total_bill= Bill-discount_5k;
            System.out.print("Congrtualtions You have got Discount of: 10% \nYou have to pay total : Rs."+total_bill);
        }
        else if(Bill>10000 && Bill<=20000){
            discount_10k= Bill*15/100;
            total_bill= Bill-discount_10k;
            System.out.print("Congrtualtions You have got Discount of: 15% \nYou have to pay total : Rs."+total_bill);
        }
        else if(Bill>20000){
            discount_20k= Bill*25/100;
            total_bill= Bill-discount_20k;
            System.out.print("Congrtualtions You have got Discount of: 25% \nYou have to pay total : Rs."+total_bill);
        }
    }
}
