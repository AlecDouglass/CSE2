public class ArrayMath{
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
               y[]={2.3, 3, 4, -2.1, 82, 23},
               z[]={2.3, 13, 14},
               w[]={2.3, 13, 14, 12}, 
               v[],
               u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                             +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                           " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                           " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                           " == "+display(z));

  }
  
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
            out+=", ";
        }
        out+=x[j];
        }
        return out+"}";
    }
    public static boolean equals(double[] a, double[] b){
        boolean alpha = false;
        boolean beta = false;
        if (a.length==b.length){
            alpha=true;
            int i=0;
            for (i=0;i<a.length;i++){
                beta = false;
                if (a[i]==b[i]){
                    beta = true;
                }
                else{
                    beta=false;
                    break;
                }
            }
            if (alpha==true && beta==true){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
        
    }
    public static double[] addArrays(double[] x, double[] y){
        int k=1;
        double[] sum;
        int i=0;
        if (x.length>y.length){
            k=x.length;
            sum = new double[k];
            for (i=0;i<y.length;i++){
                sum[i]=x[i]+y[i];
            }
            for (i=y.length;i<x.length;i++){
                sum[i]=x[i];
            }
            return sum;
        }
        else if(y.length>x.length){
            i=0;
            k=y.length;
            sum = new double[k];
            for (i=0;i<x.length;i++){
                sum[i]=x[i]+y[i];
            }
            for (i=x.length;i<y.length;i++){
                sum[i]=y[i];
            }
            return sum;
        }
        else{
            i=0;
            k=y.length;
            sum = new double[k];
            for (i=0;i<x.length;i++){
                sum[i]=x[i]+y[i];
            }
            return sum;
        }
    }
    
}
