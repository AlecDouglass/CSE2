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
        /*loop goes when j is less than n and less than 40
        *nested if when k<j+1
        *   when nested runs it prints a star
        *   then leaves and prints a blank line to move on
        */
        
        int j = 0;
        int k = 0;
        while (j<n && j<40){
            j++;
            while (k<(j+1)){
                k++;
                System.out.print("*");
            }
            System.out.println();
        }
        
        //below runs once before quitting
        k=4;
        while(k<5){
            System.out.println("k = "+k);
            k++;
        }
        /////////////////////////////////////////////////////////
        //this is the given code remember to rewrite it//////////
        int count = 0;
        while(true){
            switch(n){
                
            }
        }
    }
}