import java.util.*; //Accept the string from user and count the latters

import javax.xml.catalog.CatalogFeatures.Feature;

class String18   //514
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        str = str.replaceAll("\\s","");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();
        int Frequancy[] = new int[26];

        int iCnt = 0;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Frequancy[((int)Arr[iCnt]) - 'a']++;
        }
        System.out.println("Frequancy of each letter is : ");
        for(iCnt = 0; iCnt < Frequancy.length; iCnt++)
        {
            if(Frequancy[iCnt] != 0)
            {
            System.out.println((char)(iCnt+'a')+" occures "+Frequancy[iCnt]+" times");
            }
        }
        sobj.close();
        
    }
}