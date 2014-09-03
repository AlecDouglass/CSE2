//Alec Douglass
//September 3, 2014
//
//print time of each trip
//print rotation count for each trip
//print distance of each trip in miles
//print distance of two trips combined
//

public class Cyclometer {
    //main method...it's required I'll figure out what it means later
    public static void main(String[] args) {
        
        //input data
        int secsTrip1=480; //input seconds trip one
        int secsTrip2=3220; //input seconds trip two
        int countsTrip1=1561; //input rotation count trip one
        int countsTrip2=9037; //input rotation count trip two
        
        //intermediate variables & output data
        double wheelDiameter=27.0, //input diameter of wheel
        PI=3.14159, //is pi
        feetPerMile=5280, //the number of feet in a mile for conversions
        inchesPerFoot=12, //more convertions...feet to inches
        secondsPerMinute=60; //seconds to minutes convertion
        double distanceTrip1, distanceTrip2,totalDistance; //for finding the distances
        
        //print of time and counts for each trip
        System.out.println("Trip one took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ (countsTrip1)+ " counts");
        System.out.println("Trip two took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+ (countsTrip2)+ " counts");
        
        //run calculations
        //calculating distances
        
        //this is distance in inches
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //each count is one rotation of the wheel which moves the bike a distance of the wheel diameter, in inches, times pi
        
        distanceTrip1/=inchesPerFoot*feetPerMile; //converts inches to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/(inchesPerFoot*feetPerMile); //distance in inches and converts to miles for trip two
        totalDistance=distanceTrip1+distanceTrip2; //the total distance
        
        //print output data
        System.out.println("Trip one was "+distanceTrip1+ " miles" );
        System.out.println("Trip two was "+distanceTrip2+ " miles" );
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
        
    }  //end main method
}  //end public class