//////////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//hw06
//program 2
//square roots
//bisection method
//get a double from the user and compute the square root
//import scanner
import java.util.Scanner;
//class
public class Root{
    //main method
    public static void main(String[] arg){
        Scanner input = new Scanner (System.in);//declare and call constructor
        double low;//declare low
        double middle;//declare middle//
        double high;//declare high
        System.out.print("Enter a double greater than 0: ");//prompt for input
        if (input.hasNextDouble()){//check if double
            double x = input.nextDouble();//accept as double
            high = (1+x);//initialize high
            low = 0.0;//initialize low
            if (x>0){//if the user can follow directions
                while ((high-low)>0.0000001){//while the difference is big enough
                    middle = ((high+low)/2);//resetting the middle to the middle
                    if ((middle*middle)>x){//if middle squared more than high
                        high = middle;//set high to middle
                    }//end middle squared more than high
                    else{//middle squared less then high
                        low = middle;//set low to the middle
                    }//end if middle squared less than high
                }//end loop
                System.out.println("Square root is: "+high);
            }//end if user can follow directions
            else{//user can't follow directions
                System.out.println("Invalid input");//inform user of error
            }//end if < 0
            }//end if double
        else{//user can't follow directions
            System.out.println("Invalid input");//inform user of silliness
        }//end if not double
    }//end main method
}//end class