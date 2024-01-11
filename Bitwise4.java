//accept one number from user the number that is  Decimal Formate and checks the 3rd bit is on or off.
import java.util.*;

class Bitwise4
{
    public static boolean CheckBit(int iNO)
    {
        int iMask = 4;
        int iResult = 0;
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
        int iNo = 0;
        boolean bRet = false;

        
        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = CheckBit(iNo);

        if(bRet == true)
        {
            System.out.println("3rd bit is ON..");
        }
        else
        {
            System.out.println("3rd bit is OFF..");
        }
    }
}