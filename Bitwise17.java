//Accept number from user And 7 th bits and Toggel it.
import java.util.*;

class Bitwise17
{
    public static int ToggelBit(int iNO)
    {
        int iMask = 0X00000040;
        int iResult = 0;
        iResult = iNO ^ iMask;

        return iResult;  
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        int  iRet = 0;

        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet =ToggelBit(iNo);

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
    Result      1   1   0  | 1 |  0   1   0
      
 */