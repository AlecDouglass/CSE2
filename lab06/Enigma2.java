import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/0;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * It is an ArithmeticException so that means the error is in the arithmetic.
 * after the colon the compiler says " / by zero" indicating that the line of code is
 *      trying to divide by zero.
 * then it gives the method the error is in(Enigma2 main method)
 *      and it gives the line of the error (line 9) 
 */
