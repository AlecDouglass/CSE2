//Alec Douglass
//lab 4
//get number of bigmacs from user ask if they want fries
//import Scanner first
import java.util.Scanner;
//class
public class BigMacAgain {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter the number of Big Macs: ");//prompt for a number
        if (myScanner.hasNextInt()){ //check if input is an integer
            int nBigMacs = myScanner.nextInt();//accept scanner as integer
            if (nBigMacs > 0) {//make sure integer is positive
                System.out.println("You ordered " +nBigMacs+ " Big Macs for a cost of $" +nBigMacs*2.22);//print amount and cost
                System.out.print("Do you want an order of fries? (Y,y,N,n) ");//prompt for fries order
                String answer=myScanner.next();//input as a string
                
                if (answer.equals("Y")){//check it input is Y
                    System.out.println("Total cost of the meal is $" +((nBigMacs*2.22)+2.15));//print statement and cost with fries
                }//end if for Y
                else {//input is not Y so check if y
                    if (answer.equals("y")){
                        System.out.println("Total cost of the meal is $" +((nBigMacs*2.22)+2.15));//print statement and cost with fries
                        
                    }//end if for y
                    else {//input is not Y nor y so check if N
                        if (answer.equals("N")){
                            System.out.println("Total cost of the meal is $" +nBigMacs*2.22);//print statement and cost
                        }//ent if for N
                        else{//input is not Y,y,nor N so check if n
                            if (answer.equals("n")){
                                System.out.println("Total cost of the meal is $" +nBigMacs*2.22);//print statement and cost
                            }//end if for n
                            else{//input is none of the valid responses
                                System.out.println("You did not enter a valid symbol");//print statement
                                return;//terminate
                            }//end else for n is not the input
                        }//end else for N is not the input
                    }//end else for y is not the input
                }//end else for Y is not the input
                
            }//end if
            else {
                System.out.println("You did not  enter a number > 0.");//print this line
                return;//terminate program
            }//end else
        }//end if
        else{
            System.out.println("You did not enter an integer.");
            return;//ends program
        }//end else
       
        
        
        
    }//end main method
} //end class