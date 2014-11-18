//Alec Douglass
//create the two methods called in the main
//using arrays


import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);//declaring and calling scanner
        int num[]=new int[10];//declaring and allocating array
        String answer="";//declaring and initializing answer string
        do{//loop to get inputs
            System.out.print("Enter 10 ints- ");//prompt
            for(int j=0;j<10;j++){//loop to put inputs in array
                num[j]=scan.nextInt();//puting inputs into array
            }
            String out="The array ";//creating the printing statement...I like this it's clever
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            if(hasDups(num)){//calling the hasDups method
                out+="has ";//adding to statement
            }
            else{
                out+="does not have ";//adding to print statement
            }
            out+="duplicates.";//more statement adding
            System.out.println(out);//print whether or not there are duplicates
            out="The array ";//new printing statement
            out+=listArray(num);//printing the array    
            if(exactlyOneDup(num)){//calling one duplicate method
                out+="has ";//adding to statement if true
            }
            else{
                out+="does not have ";//adding to statement if false
            }
            out+="exactly one duplicate.";//adding this to statement
            System.out.println(out);//print the statement
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//prompt for another go
            answer=scan.next();//accepting answer
        }while(answer.equals("Y") || answer.equals("y"));//go again or not...checking for answer
    }

    public static String listArray(int num[]){//for building the array print
        String out="{";//enclosing the begining
        for(int j=0;j<num.length;j++){//for making commas
            if(j>0){
            out+=", ";//commas
        }
        out+=num[j];//puting in each value
        }
        out+="} ";//closing the string
        return out;//give back the string
    }
    public static boolean hasDups(int[] a){
        int i=0;//for tracking
        int j=0;//for tracking
        boolean r=false;//to find a duplicate
        for (i=0;i<a.length;i++){//looping to every permutaion of i and j
            j=0;//reset j for a loop of the i
            for (j=0;j<a.length;j++){//looping for every permutation
                if (i==j){//so as to not use the same term equal to itself
                    continue;//run loop again
                }
                else{//when it's not pointing to the same term
                    if (a[i]==a[j]){//is there is a duplicate
                        r=true;//switching r statement
                    }
                    else{//not a duplicate
                        continue;//reloop
                    }
                }
            }
        }
        if (r==true){//r will be true if any values are ever equal
            return true;
        }
        else{//if r isn't true there were no diuplicates
            return false;
        }
    }
    public static boolean exactlyOneDup(int[] a){
        int i=0;//for tracking
        int j=0;//for tracking
        int k=0;//different tracking
        boolean z=false;//truthiness maybe won't be used
        for (i=0;i<a.length;i++){//looping to every permutaion of i and j
            j=0;//reset j for a loop of the i
            for (j=0;j<a.length;j++){//looping for every permutation
                if (i==j){//so as to not use the same term equal to itself
                    continue;//run loop again
                }
                else{//when it's not pointing to the same term
                    if (a[i]==a[j]){//is there is a duplicate
                        k++;//finding number of duplicates
                    }
                    else{
                        continue;//not a duplicate
                    }
                }
            }
        }
        k=k/2;//because the duplicate will be found twice so it should not count twice
        System.out.println(k);
        if (k==0){//no duplicates
            return false;
        }
        else if (k==1){//exactly one duplicate
            return true;
        }
        else{//more than one duplicate
            return false;
        }
    }
}
