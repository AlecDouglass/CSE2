//Alec Douglass
//lab07
//using loops for stuff
/////////////////////////
import java.util.Scanner;
//class
public class LoopTheLoop{
    //main method
    public static void main(String[] args){
        int nStars = 10;
        int nTest = 0;
        char star = '*';
        int line = 0;
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter an int between 1 and 15: ");
        if (myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            while (nTest<nStars){
                nTest++;
                System.out.print(star);
                if (nTest==10){
                    System.out.println(" ");
                }   
                while (line<input){
                    line++;
                    switch (line) {
                        case 1: System.out.print("");
                            System.out.println(" "); break;
                        case 2: System.out.print("**");
                            System.out.println(" "); break;
                        case 3: System.out.print("***");
                            System.out.println(" "); break;
                        case 4: System.out.print("****");
                            System.out.println(" "); break;
                        case 5: System.out.print("*****");
                            System.out.println(" "); break;
                        case 6: System.out.print("******");
                            System.out.println(" "); break;
                        case 7: System.out.print("*******");
                            System.out.println(" "); break;
                        case 8: System.out.print("********");
                            System.out.println(" "); break;
                        case 9: System.out.print("*********");
                            System.out.println(" "); break;
                        case 10: System.out.print("**********");
                            System.out.println(" "); break;
                        case 11: System.out.print("***********");
                            System.out.println(" "); break;
                        case 12: System.out.print("************");
                            System.out.println(" "); break;
                        case 13: System.out.print("*************");
                            System.out.println(" "); break;
                        case 14: System.out.print("**************");
                            System.out.println(" "); break;
                        case 15: System.out.print("***************");
                            System.out.println(" "); break;
                    }
                }
            }//end first while
        }
        else{
            System.out.println("Invalid input");
        }
    }//end method
}//end class