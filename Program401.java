import java.util.*;
import LB.Matrix;

class Program400
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol = 0, iRet = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();
        
        MyMatrix mobj = new MyMatrix(iRow,iCol);

        mobj.Accept();
        mobj.Display();

        // Function calls
        mobj.MinimumRow();
        mobj = null;
        System.gc();
    }
}
class MyMatrix extends Matrix
{
    public MyMatrix(int A, int B)
    {
        super(A,B);
    }

    public void MinimumRow()
    {
        int i  =0, j = 0, iSum = 0;
        for(i = 0; i< Arr.length; i++)
        {
            int iMin = Arr[i][0];
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMin)
                {
                   iMin= Arr[i][j];
                }
            }
            System.out.println("maximum elements from Row no  : "+(i+1)+" is : "+iMin);
        }
    }
}
