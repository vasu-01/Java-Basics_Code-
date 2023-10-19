import java.util.*;
public class ATM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

      

        int amount,balance=0,withdraw;

        
        while(true){
            System.out.println("\n\n\t\tWelcome to the ATM Machine \n");
            System.out.print("Select your option\n\n");
            System.out.print("1.Deposit \n2.Withdraw \n3.Balance \n4.Exit \n");

            System.out.println("Choose any one option:");
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    System.out.print("Enter amount you are depositing:");
                    amount=sc.nextInt();
                    if(amount>0){
                        balance+=amount;
                        System.out.print("You have deposited "+amount);
                    }
                    break;
                }
            
                case 2:{
                    System.out.print("Enter amount you want  to withdraw:");
                    withdraw=sc.nextInt();
                    if(withdraw > 0 && withdraw <= balance){
                          balance-=withdraw;
                          System.out.print("You have withdraw :"+withdraw);
                    }
                    else{
                        System.out.print("Invalid withdrawl amount or insufficient balance");
                    }
                    break;
                }

                case 3:{
                    System.out.print("Your Balance is:"+balance);
                    break;
                }

                case 4:{
                     System.out.println("Thank you for using this ATM. Goodbye!");
                    System.exit(0);
                }
                default:{
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
                }
                   
            }

        }
    }
}


       