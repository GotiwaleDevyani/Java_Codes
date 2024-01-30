import java.util.*;
class LBProblamesOnNumbers7
{
    public static int Addition(int Brr[])
    {
        int iCnt = 0 , iSum = 0;
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
        System.out.println();
    }
    public static void main(String Arg[]) 
    {
        {
            Scanner sobj = new Scanner(System.in);
           int iSize = 0, iCnt = 0, iRet = 0;

           System.out.println("Enter the Number of Elements : ");
           iSize = sobj.nextInt(); 

           int Arr[] = new int[iSize]; //Dyanamic memory Allowcation using new keyword.

           System.out.println("Enter the elements :");
           for(iCnt = 0;iCnt < iSize; iCnt++)
           {
            Arr[iCnt] = sobj.nextInt();
           }

           iRet = Addition(Arr);
           System.out.println("Addition of elements is : "+iRet);

            sobj.close();
        }
    }
}
