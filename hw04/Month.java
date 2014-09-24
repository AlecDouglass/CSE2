//Alec Douglass
//09/23/2014
//Homework 4 program 2
//prompt for a number of a month
//print number of days in the month
//if they input 2 prompt for year and print number of days

//scanner import
import java.util.Scanner;
//class
public class Month {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter an int giving the number of the month (1-12)");//prompt for int
        if (myScanner.hasNextInt()){//check for integer input
            int month = myScanner.nextInt();//accept input as int
            if (month >= 1 || month <=12){
                if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){//check for 31
                System.out.println("The month has 31 days");//print respionse
                }//end 31 months
                else{//if none of above inputs
                    if (month==4 || month==6 || month==9 || month==11){//check for 30 months
                       System.out.println("The month has 30 days");//print respionse
                    }//end 30s
                    else{//if not 30 or 31
                        if (month == 2){//if for month 2
                            System.out.print("Enter an int giving year ");//prompt for year
                            if (myScanner.hasNextInt()){//check for integer input
                                int year = myScanner.nextInt();//accepting new imput
                                if (year>0){
                                    if (year % 4 ==0){
                                        System.out.println("The month has 29 days");
                                    }//remainder 0
                                    else{
                                        System.out.println("The month has 28 days");
                                    }//remainder not 0
                                }
                                else{
                                    System.out.println("You did not enter a valid integer");
                                    return;
                                }//end else for year positive check
                            }//end if year int check
                            else {//if it is not an int
                                System.out.println("You did not enter and integer");//print
                                return;//terminate program
                                
                            }//end else for year int check
                            
                        }//end if month 2
                    }//end else months don't have 31
                }//end int check if
            }//end of valid inputs
            else{
                System.out.println("You did not enter a valid integer");
                return;
                }
        }    
        else{//if it is not an int
            System.out.println("You did not enter and integer");//print
            return;//terminate program
        }//end else for int check
    }//end main method 
}//end class