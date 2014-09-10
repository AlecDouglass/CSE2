//Alec Douglass
//Sept. 8, 2014
//Homework 2

//always the public class
public class Arithmetic {
    //main method
    public static void main(String[] args) {
        //Input variables
        //number of sock pairs
        int nSocks=3; //don't ever forget the semicolon
        //price per pair
        //'$' is part of variable name
        double sockCost$=2.58;
        //number drinking glasses
        int nGlasses=6;
        //Price glasses
        double glassCost$=2.29;
        //number envelope boxes
        int nEnvelopes=1;
        //price per box
        double envelopeCost$=3.25;
        //tax
        double taxPercent=.06;
        
        //calculations for: price for each item, tax for each, 
        //total cost before tax, total cost after tax
        double totalSockCost$=nSocks*sockCost$;//total cost of socks
        double sockTax$=totalSockCost$*taxPercent;//tax for socks
        double totalGlassesCost$=nGlasses*glassCost$;//total cost of glasses
        double glassesTax$=totalGlassesCost$*taxPercent;//glasses tax
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;//total cost of envelopes
        double envelopeTax$=totalEnvelopeCost$*taxPercent;//envelope tax
        double totalCostA$=totalEnvelopeCost$+totalGlassesCost$+totalSockCost$;//total cost before tax
        double totalTaxA$=totalCostA$*taxPercent;//total tax
        double totalPaidA$=totalTaxA$+totalCostA$;//total amount actually paid
        
        int totalBeforeTax$=(int)totalCostA$;
        int totalTaxInt$=(int)totalTaxA$;
        int totalPaidTotal$=(int)totalPaidA$;
        double totalCost$=totalBeforeTax$*100/100.0;
        double totalTax$=totalTaxInt$*100/100.0;
        double totalPaid$=totalPaidTotal$*100/100.0;
        
        //print item, how many, cost per item, cost for each item, tax for each item
        //total before tax, total tax, total after tax
        
        System.out.println("Socks");
        System.out.println("amount: "+nSocks);
        System.out.println("cost per item: "+sockCost$);
        System.out.println("total cost: "+totalSockCost$);
        System.out.println("tax on item: "+sockTax$);
        System.out.println("Drinking Glasses");
        System.out.println("amount: "+nGlasses);
        System.out.println("cost per item: "+glassCost$);
        System.out.println("total cost: "+totalGlassesCost$);
        System.out.println("tax on item: "+glassesTax$);
        System.out.println("Envelopes");
        System.out.println("amount: "+nEnvelopes);
        System.out.println("cost per item: "+envelopeCost$);
        System.out.println("total cost: "+totalEnvelopeCost$);
        System.out.println("tax on item: "+envelopeTax$);
        System.out.println("---------------------");
        System.out.println("Total Before Tax: "+totalCost$);
        System.out.println("Tax: "+totalTax$);
        System.out.println("Total after tax: "+totalPaid$);
        
        
    } //method
} //class