package javaapplication125;
public class JavaApplication125
{
    public static void main(String[] args)
    {
        A a=new A();
        A b=new A();
        
        Thread c=new Thread(a);
        Thread d=new Thread(b);
        c.start();
        d.start();
        
    }
}
