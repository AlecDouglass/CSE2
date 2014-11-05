////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//hw09
//creating and substituting modular programs

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(0); 
        System.out.println(m);
        allBlocks(m);
    }
    public static int getInt(int t){//get the input from the user
        System.out.print("Enter an int between 1 and 9, inclusive: ");//prompt
        Scanner scan=new Scanner (System.in);//declare and call
        if (checkInt(scan)==true){//cell checkInt method
            t=scan.nextInt();//assign integer if true
        }
        else{
            while (checkInt(scan) == false){//keep prompting for good input
                System.out.println();
                System.out.print("You did not enter an int; try again: ");
                scan=new Scanner (System.in);
            }
        }
        t=scan.nextInt();
        while (checkRange(t)==false){//checking the range and prompting for good input
            System.out.println();
            System.out.print("You did not enter an int in [1,9]; try again: ");//prompting
            scan=new Scanner (System.in);
            t=scan.nextInt();//assigning
        }
        t=scan.nextInt();//assign
        return t;
    }
    public static boolean checkInt(Scanner scan){//method to check int returns t or f
        scan=new Scanner (System.in);//get the input
        if (scan.hasNextInt()){//check for int
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkRange(int m){//checking renge returns boolean
        if (m>9||m<1){//outside range
            return false;
        }
        else{
            return true;
        }
    }
    public static void allBlocks(int x){//calls block method
        block(x);
    }
    public static void block(int n){//gets the blocks
        int i=1;
        int l=1;
        int w=1;
        while (w<(n+1)){//creating the blocks
            i=1;
            while (i<(n+1)){
                line(n,w);//calling line method to get line
                i++;
            }
            w++;
            
            while (l<((n-w)+2)){//for printing the spaces
                l++;
                System.out.print(" ");
            }
            l=1;
            while (l<(2*w-2)){
                System.out.print("-");//dashes between blocks
                l++;
            }
            System.out.println();
        }
    }
    public static int line(int q, int r){//the only part of the code that wirks properly
        int k=q-r;
        int l=0;
        while (l<k){//prints correct number of spaces per line
            l++;
            System.out.print(" ");
        }
        l=1;
        while (l<(2*r)){//printing correct line and numbers
            System.out.print(r);
            l++;
        }
        System.out.println();
        return 1;    
    }
}
/*
*   Issues I cannot resolve:
*   1 input must be put in 4 times and I do not know why
*   2 the blocks are not the correct shape and I do not know how to fix it 
*   3 the dashes between blocks are not indented properly and I cannot make them work
******Clearly I don't understand this excercise and I'm not willing to put in anymore time.
*
*
*
*
**
*/ 