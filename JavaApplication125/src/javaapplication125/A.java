
package javaapplication125;

public class A implements Runnable
{
    public void run()
    {
        int x;
        for(x=1;x<6;x++)
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
