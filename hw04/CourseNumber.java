//Alec Douglass
//09/23/14
//hw04 3
//get a course number
//output the semester

//import scanner

import java.util.Scanner;
//class
public class CourseNumber{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        System.out.print("Enter a 6 digit number giving course semester-");//prompt for semester number
        if (myScanner.hasNextInt()){//check for integer
            int number = myScanner.nextInt();//accept input
            if (number<186510 || number>201440){//check it outside range
                System.out.print("The number was outside of the valid range");
                return;
            }//end range check
            else{//inside range
                if (number % 10 < 5){//if semester number valid
                    if (number % 100 == 10){//srping check
                         System.out.println("Course was offered Spring semester "+((int)(number/100))); 
                    }//end spring check
                    else{//not spring
                        if (number % 100 == 20){//sumemer I
                            System.out.println("Course was offered Summer 1 semester "+((int)(number/100))); 
                        }//end summer 1
                        else{////not summer 1
                            if (number % 100 == 30){//summer2
                                System.out.println("Course was offered Summer 2 semester "+((int)(number/100)));
                            }//end summer 2    
                            else{//not summer 2
                                if(number % 100 == 40){//summer2
                                    System.out.println("Course was offered Fall semester "+((int)(number/100)));
                                }//end fall
                            }//end not summer2
                        }//end not summer 1
                    }//end not spring
                }//end if semester number valid
                else{//not valid semester
                    System.out.println(((number%100))+" is not a valid semester.");
                    return;
                }//end not valid semester
            }//end valid range else
        }//end int check
        else{//not an int
            System.out.println("You did not enter a valid number");
            return;
        }//end int check else
    }//end main method
}//end class