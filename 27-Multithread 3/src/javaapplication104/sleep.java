//3 method-wenama seen ekak-pdf 3 method eka
//checked exception-must to write exception(or error(compile time)
//unchecked("runtime error)
package javaapplication104;
public class sleep implements Runnable
{
    public void run() //run keyword
    {
    int x;
    for(x=1;x<=5;x++)
    {
        try
    {
        Thread.sleep(500);        
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
        System.out.println("x"+x);
    }
    }
}