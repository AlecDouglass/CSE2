//Alec Douglass
//9/30/14
//hw05 program 2
//randomly select 3 t/f variables
//combine with two randomly selected || or &&
//print expression to user and ask for a truth value
//tell whether correct
//scanner
import java.util.Scanner;
//class
public class BoolaBoola {
    //main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);//declare and call constructor
        boolean var1;//declare the three bollean variables
        boolean var2;
        boolean var3;
        String andor1;
        String andor2;
        double rand1;//declare 5 temp random variables
        double rand2;
        double rand3;
        double rand4;
        double rand5;
        rand1 = Math.random();
        rand2 = Math.random();
        rand3 = Math.random();
        rand4 = Math.random();
        rand5 = Math.random();
        if (rand1 > .5){
            var1 = true;
        }//end var1 true
        else{
            var1 = false;
        }//end var1 false
        if (rand2 > .5){
            var2 = true;
        }//end var2 true
        else{
            var2 = false;
        }//end var2 false
        if (rand3> .5){
            var3 = true;
        }//end var3 true
        else{
            var3 = false;
        }//end var3 false
        if (rand4> .5){
            andor1 = "&&";
        }//end 
        else{
            andor1 = "||";
        }//end
        if (rand5> .5){
            andor2 = "&&";
        }//end 
        else{
            andor2 = "||";
        }//end 
        System.out.print("Is " + var1 +andor1+ var2 +andor2+ var3 +" true(T/t) or false(F/f)? ");
        String input = myScanner.next();//get user input as string
        boolean first;//first expression
        boolean answer;//total truth value
        if ( andor1.equals("&&")){
            first = var1 && var2;
            if (andor2.equals("&&")){
                answer = first &&var3;
            }//and andor2&&
            else{
                answer = first || var3;
            }//end andor2||
        }//end andor1&&
        else{
            first = var1 || var2;
            if (andor2.equals("&&")){
                answer = first &&var3;
            }//and andor2&&
            else{
                answer = first || var3;
            }//end andor2||
        }//and andor1||
        boolean inputBool;
        if (input.equals("T")){
            inputBool = true;
                if (inputBool == answer){
                System.out.println("Correct");
                }//end right
                else{
                    System.out.println("Incorrect, try again");
                }//end wrong
        }
        else{
            if  (input.equals("t")){
                inputBool = true;
                if (inputBool == answer){
                System.out.println("Correct");
                }//end right
                else{
                    System.out.println("Incorrect, try again");
                }//end wrong
            }//end t
            else{
                if  (input.equals("F")){
                    inputBool = false;
                    if (inputBool == answer){
                        System.out.println("Correct");
                    }//end right
                    else{
                        System.out.println("Incorrect, try again");
                    }//end wrong
                }//end if F
                else{
                    if  (input.equals("f")){
                    inputBool = false;
                        if (inputBool == answer){
                        System.out.println("Correct");
                        }//end right
                        else{
                            System.out.println("Incorrect, try again");
                        }//end wrong
                    }//end if f
                    }//end f
                }//end F
            }//end t
    }//end main method
}//end classs