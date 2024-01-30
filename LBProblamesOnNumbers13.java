import java.util.*;
class LBProblamesOnNumbers13
{
    public static int CountCapital(String str)
    {
        int iCnt = 0, iCount = 0;
        char Arr[] = str.toCharArray();

            for(iCnt = 0; iCnt < Arr.length; iCnt++)
            {
                if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
                {
                    iCount++;
                }
                
            }
            return iCount;
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);
        String str = null;

        System.out.println("Enter Srting :");
        str = sobj.nextLine();

        int iRet = 0;
        iRet  =  CountCapital(str);

        System.out.println("Number of capital character are : "+iRet);
        sobj.close();
    }
}
