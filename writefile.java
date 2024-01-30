import java.io.*;
class writefile
{
    public static void main(String[] args)
    {
        try
        {
            String Data = "MARVELLOUS INFOSYSTEMS";
            byte Arr[] = Data.getBytes();

            FileOutputStream fobj = new FileOutputStream("PPA.txt");
            fobj.write(Arr);
            
        }
        catch(Exception obj){}
    }
}