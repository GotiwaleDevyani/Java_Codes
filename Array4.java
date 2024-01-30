
class Array4
{
    public static void main(String Arg[])
    {
        int Arr[] [] = new int[4] [];
        Arr[0] = new int[2];
        Arr[1] = new int[5];
        Arr[2] = new int[3];
        Arr[3] = new int[7];

        
        int i = 0 ,j = 0;
        
        //    1        // 2        // 3
        for(i = 0; i < Arr.length; i++) //outer for loop
        {
           //     1             2           3
            for(j = 0; j < Arr[i].length; j++) //inner for loop
            {                                       
                System.out.print(Arr[i][j]+"\t");   //4
            }
            System.out.println();
        }
    }
}