//////////////////////////////////////////////////////////////////////////////////////
//arrays 
import java.util.Scanner;
public class arrays{
    public static void main(String[]arg){
        Scanner scan=new Scanner(System.in);
        int[] item;
        item=new int[10];
        int i=0;
        int k=0;
        for (i=0;i<10;i++){
            System.out.print("Enter an int: ");
            k=scan.nextInt();
            item[i]=k;
        }
        i=0;
        k=item[0];
        for(i=0;i<10;i++){
            if (item[i]<k){
                k=item[i];
            }
        }
        System.out.println("lowest is: "+k);
        i=0;
        k=item[0];
        for(i=0;i<10;i++){
            if (item[i]>k){
                k=item[i];
            }
        }
        System.out.println("largest is: "+k);
        i=0;
        k=0;
        for(i=0;i<10;i++){
            k=k+item[i];
        }
        System.out.println("Sum is: "+k);
        int[] item2;
        item2=new int[10];
        i=0;
        for (i=0;i<10;i++){
            item2[i]=item[9-i];
        }
        System.out.println(item[0]+"  "+item2[0]);
        System.out.println(item[1]+"  "+item2[1]);
        System.out.println(item[2]+"   "+item2[2]);
        System.out.println(item[3]+"   "+item2[3]);
        System.out.println(item[4]+"  "+item2[4]);
        System.out.println(item[5]+"  "+item2[5]);
        System.out.println(item[6]+"   "+item2[6]);
        System.out.println(item[7]+"   "+item2[7]);
        System.out.println(item[8]+"  "+item2[8]);
        System.out.println(item[9]+"  "+item2[9]);
        
    }
}