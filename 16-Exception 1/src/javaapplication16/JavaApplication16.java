package javaapplication16;
public class JavaApplication16 {

    public static void main(String[] args) 
    {
        try
        {
            int x,y=10,z=0;
            x=y/z;
            System.out.println("x is "+x);
        }
        catch(Exception e)// e any name.whatever
        {
            //System.out.println(e.getMessage());// this is the default code
            //our own error message below
            System.out.println("Divide by zero errorrrrr");
        }
    }
    
}
//checked exception-must to write exception