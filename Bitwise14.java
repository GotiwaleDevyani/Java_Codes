//accept one number from user the number that is  Decimal Formate and checks the 4th bit is on then it will Do off.
import java.util.*;

class Bitwise14
{
    public static int OFFBit(int iNO)
    {
        int iMask = 0X00000008;
        int iResult = 0;
        iResult = iNO & iMask;

        if(iResult == iMask)
        {
            return (iNO ^ iMask);  //4th bit is ON
        }
        else
        {
            return iNO;  //4th bit is oFF  
        }
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int  iRet = 0;

        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = OFFBit(iNo);

        System.out.println("Updated Number is : "+iRet);
    }
}
/*
    iMask = 889
    input       1   1   0   1   1   1   1   0   0   1
    Mask        0   0   0   0   0   0   1   0   0   0   ^
    -------------------------------------------------------
    RESULT      1   1   0   1   1   1  | 0 |  0   0   1


    No= 98
    Input       1   1   0   0   0   1   0
    Mask        0   0   0   1   0   0   0       ^
    ---------------------------------------------
    Result      1   1   0   1   0   1   0
      
      

 */