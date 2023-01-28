//throws and throw
package throwws;
public class Throwws {
    static void method()throws ArithmeticException
{
System.out.println("Inside method ");
//...........how to use throw ?
throw new ArithmeticException("throwing an ArithmeticException");//try it
}

public static void main(String[] args)
{
try
{
method();
    //if the method is static, we can call it directly.no need of objects
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());//because this throw new will run
System.out.println("Caught in main() method ");
}
}
}
