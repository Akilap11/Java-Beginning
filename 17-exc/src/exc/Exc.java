package exc;

public class Exc {
        public static void main(String[] args) 
    {
        //try block handles 2 types of exceptions. It means,with a single try block,
        //there can be more than one catch blocks
        try
        {
            int x,y=10,z=2;
            x=y/z;
            System.out.println("x is "+x);
        //an integer array with the size of 5
            int arr[]=new int[5];
            arr[5]=20;//no 5 indexes
            System.out.println("Last element is "+arr[4]);
        }
        catch(ArithmeticException a)// a any name.whatever
        {
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException b)// a any name.whatever
        {
            System.out.println("Array based error");
        }  
        finally
        {
            System.out.println("Finally block is here");
        }
        //even though exception executed or not, finally will execute
    }
}
//only 1st of the exceptions is show in the output
//try z=0.it will only show arithmetic error

//we use finally,cause 