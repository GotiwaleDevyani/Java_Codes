//accept one number from user the number that is  Decimal Formate and checks the 9th bit is on or off.
import java.util.*;

class Bitwise6
{
    public static boolean CheckBit(int iNO)
    {
        int iMask =0X00010000;
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
            System.out.println("17th bit is ON..");
        }
        else
        {
            System.out.println("17th bit is OFF..");
        }
    }
}
/*
    iMask = 17

    0000 0000 0000 0000 0000 0000 0000 0000
      0    0    0    1   0    0    0    0     
      
      0X00010000

 */