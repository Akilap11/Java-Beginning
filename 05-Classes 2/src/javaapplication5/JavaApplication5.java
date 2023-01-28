package javaapplication5;

public class JavaApplication5{
    public static void main(String[] args)
    {
        //class name objectname=new class name
        marks s=new marks();
        s.input();
        //s.displayavg(); is wrong.output wont dvisible. cause marks class has a return type
        //named float. It returns the value. It should be called system.out
        System.out.println("Avg is: "+s.displayavg());
        s.displaydetails();
        //u cant call displays before input. They hv to be in order
     
     
        
        
         
    }    
}