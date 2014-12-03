/////////////////////////////////////////////////////
public class RaggedArrays{
    public static void main(String[]arg){
        int[] [] rows=new int[5][];
        int i=0;
        for (i=0;i<5;i++){
            rows[i]=new int[i*3+5];
        }
        i=0;
        int j=0;
        for (i=0;i<5;i++){
            j=0;
            for (j=0;j<rows[i].length;j++){
                int k=(int)(Math.random()*39);
                rows[i][j]=k;
            }
        }
        System.out.println("Before sorting");
        i=0;
        for (i=0;i<5;i++){
            j=0;
            for (j=0;j<rows[i].length;j++){
                System.out.print(rows[i][j]+" ");
            }
            System.out.println();
        }
        sort(rows);
        public static void sort(int[][] row){
            int l=0;
            int m=0;
            for (l=0;l<5;l++){
                for (m=0;m<row[l].length;m++){
                    if (m=0){
                        continue
                    }
                    else if()
                        
                    }
                }
            }
        }
        
    }
}