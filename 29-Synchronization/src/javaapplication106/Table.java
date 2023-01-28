package javaapplication106;
public class Table 
{
 synchronized void printTable(int n) //synchronized-if someone call this method, 
         //other person will not use this
 {//method not synchronized 
 for(int i=1;i<=5;i++)
 { 
 System.out.println(n*i); 
        try
        { 
        Thread.sleep(400); 
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        
  } 
 } 
}
