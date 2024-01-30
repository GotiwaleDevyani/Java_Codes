import Marvellous.Maths;
import Marvellous.Infosystems.Arithmatic;

class PackageDemo
{
    public static void main(String Arg[])
    {
        Maths mobj = new Maths();
        int iRet = 0;

        iRet = mobj.Addition(10, 11);
        System.out.println("Addiotion is :"+iRet);
    }
}

//javac PackageDemo.java
//java PackageDemo