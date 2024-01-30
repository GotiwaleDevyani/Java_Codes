import java.util.*; //Accept the string from user and count the latters

class String6
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string :");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+"," ");//" " \\s+ one + white space replace 2with 1

        char Arr[] = str.toCharArray();
        int i = 0;
        int SpaceCnt = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                SpaceCnt++;
            }
        }
        System.out.println("Number of words are : "+(SpaceCnt+1));
        sobj.close();
        
    }
}