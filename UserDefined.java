import java.util.*;

class UserDefined
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in); //create scanner class object to accept the input from user..

        System.out.println("Enter your age :");
        int iAge = sobj.nextInt();

        try
        {
            if(iAge < 18)
            {
                AgeInvalide aobj = new AgeInvalide("your age is below 18");
                throw aobj;
            }
            else
            {
                System.out.println("Login Succesful..");
            }
        }
        catch(AgeInvalide obj)
        {
            
            System.out.println("Inside catch block");
            System.out.println(obj);
        }
    }
}

class AgeInvalide extends Exception
{
    public AgeInvalide(String str)
    {
        super(str); //super.objcet is parent class object creation.
    }

}