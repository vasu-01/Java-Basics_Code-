import java.util.*;
public class Traffic_Light{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select a traffic light color \n ");
        System.out.print("1.Red \n2.Yellow \n3.Green \n");
        System.out.print("Enter your choice:");
        int ch=sc.nextInt();

        switch(ch){
            case 1:
            {
                System.out.println("Stop! The light is Red.");
                break;
            }

            case 2:{
                System.out.println("Prepare to stop. The light is Yellow.");
                break;
            }

            case 3:{
                System.out.println("Go! The light is Green.");
                break;
            }

            default:{
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
    }
}

