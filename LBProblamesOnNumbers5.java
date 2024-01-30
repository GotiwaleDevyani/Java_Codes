import java.util.*;
class LBProblamesOnNumbers5
{
    public static void main(String[] args) 
    {
        {
            Scanner sobj = new Scanner(System.in);
           int iSize = 0,iCnt = 0;

           System.out.println("Enter the Number of Elements : ");
           iSize = sobj.nextInt();

           int Arr[] = new int[iSize]; //Dyanamic memory Allowcation using new keyword.

           System.out.println("Enter the elements :");
           for(iCnt = 0;iCnt < iSize; iCnt++)
           {
            Arr[iCnt] = sobj.nextInt();
           }

           System.out.println("Elements of the Array are : ");
           for(iCnt = 0;iCnt < iSize; iCnt++)
           {
            System.out.print(Arr[iCnt]+"\t");
           }

           System.out.println();

            sobj.close();
        }
    }
}
