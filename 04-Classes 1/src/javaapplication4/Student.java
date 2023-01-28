 //create the following student class by using a java program
package javaapplication4;
import java.util.*;
public class Student 
{
    //data
    //we dont need to others to access it.so private
    private int admin;
    private String name;
    private String batchno;
    //method(//same as functions)public void 
    public void input()
    {
        Scanner a=new Scanner(System.in);
        
        System.out.println("Enter the name ");
        name=a.nextLine();
        System.out.println("Enter the ad no ");
        admin=a.nextInt();  
        System.out.println("Enter the batch ");
        batchno=a.nextLine();
        
    }
    public void display()
    {
        System.out.println("Adno is "+admin+" and name is "+name+" and batch is "+batchno);
      
    }
}
