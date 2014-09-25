//Alec Douglass
//hw04 program 4
//input time in seconds output actual time

//Scanner
import java.util.Scanner;
//class
public class TimePadding{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter the time in seconds");//prompt for input
        if (myScanner.hasNextInt()){//check if int
            int seconds = myScanner.nextInt();//accept input as int
            if (seconds>0 || seconds<86400){//if valid number of second
                int tHours = (int)(seconds/(3600));//number of hours 
                int tMinutes = (int)((seconds/(60))-(tHours*60));//number of minutes after hours
                int tSeconds = (seconds%60);//number of seconds after minutes
               
                System.out.printf("Time is %02d:%02d:%02d", tHours, tMinutes , tSeconds);
            }//end if valid number of seconds
            else{//invalid number of seconds
                System.out.println("You did not enter a valid number of seconds for one day");//print
                return;//terminate
            }//end invalid number of seconds
        }//end if int
        else{//if not int
            System.out.println("You did not enter an integer");//print
            return;//terminate program
        }//end not int
    }//end main metheod
}//end class