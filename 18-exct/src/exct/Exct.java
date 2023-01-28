package exct;  //2nd METHOD
import java.util.*;

public class Exct {
   //static ganne kelinma call krnna plwn nisa object nathuwa. EASYYY
    static void method1()throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        int x=10/2;
        System.out.println("x "+x);
        
        int arr[]=new int[5];
        arr[5]=10;
        System.out.println("Last element is "+arr[4]);
    }
    public static void main(String[] args) {
        try
        {
            method1();
        }
        catch(ArithmeticException e1) //if we know if its arithemetic
            //else just use exception
        {
            throw new ArithmeticException("Arithemtic Error ");
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            throw new ArrayIndexOutOfBoundsException("Array Based Error ");
        }
    }
}
