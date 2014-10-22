/////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//lab08
//LooOOOOOOooOOoOOooooOOOops
import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);
        int n = 0;
        /*prompt for an integer
        *loop case is that the input is not an int
        *clear the Scanner
        *tell the user that they can't follow directions
        *
        *///changed to case if tracker is one which it becomes if the input isn't an int
        System.out.print("Enter an int: ");
        int tracker = 0;
        do{
            tracker = 0;
            if (!scan.hasNextInt()){
                scan.next();
                System.out.print("Not an int, try again: ");
                tracker++;
            }
        }while(tracker>0);
        
        n=scan.nextInt();
        /*  loop goes when j is less than n and less than 40
        *   nested if when k<j+1
        *   when nested runs it prints a star
        *   then leaves and prints a blank line to move on
        */
        System.out.println(n);
        int j = 0;
        int k = 0;
        while (j<n && j<40){
            while (k<(j+1)){
                k++;
                System.out.print("*");
            }
            System.out.println();
            j++;
            k=0;
        }
        
        //below runs once before quitting
        k=4;
        while(k<5){
            System.out.println("k = "+k);
            k++;
        }
        int count = 0;
        for(count=0;count<10;count++){
            if (n==1||n==2){
                for (n=0;n<12;)
                System.out.print("Case 2");
            }
            else if (n==3){
                break;
            }
            else if (n==4){
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            else if (n==5){
                System.out.println("Case 5");
            }
            else{
                System.out.println(n + " is > 5 or <1");
            }
        }
        
        
    }
}