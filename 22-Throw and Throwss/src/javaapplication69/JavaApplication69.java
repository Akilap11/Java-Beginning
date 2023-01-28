//ez example
package javaapplication69;
public class JavaApplication69 {
static void checkAge(int age)throws ArithmeticException
{
if(age<18)
throw new ArithmeticException("Access denied - You must be at least 18 years old ");
else
System.out.println("Access granted ");
}
public static void main(String[] args)
{
try
{
checkAge(19); //as this method is static it can be called directly without an object
}
catch(ArithmeticException e)
{
System.out.println("dfsgjkbsgjkmsgfnb");    
System.out.println(e.getMessage());
}
}
}