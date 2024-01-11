//accept one number from user the number that is  Decimal Formate and checks the 17th bit or 7th bit  is on or off.
import java.util.*;

class Bitwise7
{
    public static boolean CheckBit(int iNO)
    {
        int iMask = 0X00001010;
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
            System.out.println("7th or 15th bit is ON..");
        }
        else
        {
            System.out.println("7th or 15th bit is OFF..");
        }
    }
}
/*
    iMask = 4

    0000 0000 0000 0000 0100 0000 0100 0000
      0    0    0    0    4   0    4   0    
      
      0X00001010

 */