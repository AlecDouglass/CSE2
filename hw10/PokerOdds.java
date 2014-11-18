//Alec Douglass
//hw10 program2
//




import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    public static void main(String [] arg){
        showHands();//call upon showHands method
        simulateOdds();//calling the odds method
    }
    public static void showHands(){
        Scanner c=new Scanner (System.in);//declaring scanner 
        String card[]= new String[52];//declaring and allocating deck
        int rand;
        int i=1;
        for(i=1;i<53;i++){
            switch (i){
                case 1: card[0]= "A"; break;
                case 2: card[1]= "K"; break;
                case 3: card[2]= "Q"; break;
                case 4: card[3]= "J"; break;
                case 5: card[4]= "10"; break;
                case 6: card[5]= "9"; break;
                case 7: card[6]= "8"; break;
                case 8: card[7]= "7"; break;
                case 9: card[8]= "6"; break;
                case 10: card[9]= "5"; break;
                case 11: card[10]= "4"; break;
                case 12: card[11]= "3"; break;
                case 13: card[12]= "2"; break;
                case 14: card[13]= "A"; break;
                case 15: card[14]= "K"; break;
                case 16: card[15]= "Q"; break;
                case 17: card[16]= "J"; break;
                case 18: card[17]= "10"; break;
                case 19: card[18]= "9"; break;
                case 20: card[19]= "8"; break;
                case 21: card[20]= "7"; break;
                case 22: card[21]= "6"; break;
                case 23: card[22]= "5"; break;
                case 24: card[23]= "4"; break;
                case 25: card[24]= "3"; break;
                case 26: card[25]= "2"; break;
                case 27: card[26]= "A"; break;
                case 28: card[27]= "K"; break;
                case 29: card[28]= "Q"; break;
                case 30: card[29]= "J"; break;
                case 31: card[30]= "10"; break;
                case 32: card[31]= "9"; break;
                case 33: card[32]= "8"; break;
                case 34: card[33]= "7"; break;
                case 35: card[34]= "6"; break;
                case 36: card[35]= "5"; break;
                case 37: card[36]= "4"; break;
                case 38: card[37]= "3"; break;
                case 39: card[38]= "2"; break;
                case 40: card[39]= "A"; break;
                case 41: card[40]= "K"; break;
                case 42: card[41]= "Q"; break;
                case 43: card[42]= "J"; break;
                case 44: card[43]= "10"; break;
                case 45: card[44]= "9"; break;
                case 46: card[45]= "8"; break;
                case 47: card[46]= "7"; break;
                case 48: card[47]= "6"; break;
                case 49: card[48]= "5"; break;
                case 50: card[49]= "4"; break;
                case 51: card[50]= "3"; break;
                case 52: card[51]= "2"; break;
            }
        }
        i=0;
        for (i=0;i<5;i++){
            rand=(int)(Math.random()*51);
            if (rand<13){
                String g = card[rand];
                System.out.println("Clubs: "+g);
            }
            else if(rand>12&&rand<26){
                String d = card[rand];
                System.out.println("Diamonds: "+d);
            }
            else if(rand>25&&rand<39){
                String e = card[rand];
                System.out.println("Hearts: "+e);
            }
            else{
                String f = card[rand];
                System.out.println("Spades: "+f);
            }
        }
    }
    public static void simulateOdds(){
        
    }
}
