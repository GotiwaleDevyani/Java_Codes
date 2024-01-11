//Accept the possition from user And and check bit is on or off at runtime.
import java.util.*;

class Bitwise21
{
    public static boolean CheckBit(int iNO,int iPos)
    {
        int iMask = 0X00000001;
        int iResult = 0;
        
        iMask = iMask << (iPos-1);
        iResult = iNO & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0, iPos = 0;
        boolean bRet = false;

        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();
        
        System.out.println("Enter the Possition : ");
        iPos = sobj.nextInt();

        bRet = CheckBit(iNo, iPos);
        if(bRet == true)
        {
            System.out.println("Bit is On at the given Possition..");
        }
        else
        {
            System.out.println("Bit is Off at the given Possition..");
        }
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

    iMask :     0000    0000    0000    0000    0000    0000    0000    0001
    iPos : 6

    iMask = iMask <<(iPos-1);
    iMask = iMask << 5;

    iMask :     0000    0000    0000    0000    0000    0000    0000    0001
    iMask :     0000    0000    0000    0000    0000    0000    0010    0000
      
 */