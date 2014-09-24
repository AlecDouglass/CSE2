//Alec Douglass
//09/23/2014
//Homework 4 program 1
//prompt user for an integer of income in thousands
//calculate and print the tax rate

//import the scanner
import java.util.Scanner;
//class
public class IncomeTax {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter an integer given the number of thousands ");//prompt for input
        if (myScanner.hasNextInt()){//check for integer input
            int income = myScanner.nextInt();//accept input as integer
            if (income < 20){//check input is less than 20
                System.out.println("The tax rate on $" +(income*1000)+ " is 5% and the tax is $"+(((income*1000)*5)/100));//print income and rate
            }//end if for less than 20
            else{//if not <20 check for between 20 and 40
                if (income>=20 & income<40){//check if between 20&40
                    System.out.println("The tax rate on $" +(income*1000)+" is 7% and the tax is $" +(((income*1000)*7)/100));//print income and rate
                }//end if for 20-40
                else{//if not 20-40 check if 40-78
                    if (income>=40 & income<78){//check for 40-78
                       System.out.println("The tax rate on $" +(income*1000)+" is 12% and the tax is $" +(((income*1000)*12)/100));//print income and rate
                    }//end if 40-78 check
                    else{//for if not 40-78
                        if (income>78){//check if input is >78
                            System.out.println("The tax rate on $" +(income*1000)+" is 14% and the tax is $" +(((income*1000)*14)/100));//print income and rate
                        }//end if for >78 check
                    }//end else for 40-78
                }//end else for not 20-40
            }//end else for not <20
        }//end if for scanner int check
        else{//if it is not an int
            System.out.println("You did not enter and integer");//print
            return;//terminate program
        }//end else for int check
    }//end main method
}//end class