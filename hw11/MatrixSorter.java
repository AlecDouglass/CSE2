/////////////////////////////////////////////////////////////////////////////////
//Alec Douglass
//second program
//
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
}
/*  it is at this point in the class that I regret taking it but am in far too deep to drop it
*   so here's no code
*   this class is killing me and I need it to end a month ago.......
*/