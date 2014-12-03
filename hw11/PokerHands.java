////////////////////////////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//hw11
//Multidimentional arrays, methods, searching, sorting
//prompt user to enter a hand
//print the hand
//print the hand "rank"
import java.util.Scanner;
public class PokerHands{
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        int[] input=new int[52];//the array
        String set="y";
        String thing="";
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");//prompt to start
        set=scan.nextLine();//
        while (set.equals("y")||set.equals("Y")){//asking to start
            int i=0;
            while (i<5){
                System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");//prompt suit
                thing=scan.nextLine();//get inpiut
                if (!thing.equals("c")|!thing.equals("d")|!thing.equals("h")|!thing.equals("s")){
                    System.out.println("Invalid input");
                    continue;
                }   
                else{
                    i++;
                }
                
                
                
                
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");//prompt to start
            set=scan.nextLine();//
        }
        
        
        
        
    }
    public static void showOneHand(int hand[]){
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
    	String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
    	out+=suit[s];
    	for(int rank=0;rank<13;rank++)
        	for(int card=0;card<5;card++)
         	if(hand[card]/13==s && hand[card]%13==rank)
          	out+=face[rank];
    	out+='\n';
    	}
    	System.out.println(out);
    }

}