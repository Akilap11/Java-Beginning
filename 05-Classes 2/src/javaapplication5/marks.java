/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.*;
/**
 *
 * @author akila
 */
public class marks {
    
    //MOST OF THE TIME data private.method public
    //data
    private int adno;
    private String prgn;
    private float n1,n2,n3;
    //methods
    public void input()
    {
            Scanner a=new Scanner(System.in);
    
            System.out.println("Enter admission no: ");
            adno=Integer.parseInt(a.nextLine());
            System.out.println("Enter program name: ");
            prgn=a.nextLine();//a.next() also valid
            System.out.println("Enter 1st mark: ");
            n1=a.nextFloat();
            System.out.println("Enter 2st mark: ");
            n2=a.nextFloat();
            System.out.println("Enter 3st mark: ");
            n3=a.nextFloat(); 
                             
    }
    public float displayavg()
    {
        //u can declare avg and do the inputs above.but not recommended
        //return if its not void
        float avg;
        avg=(n1+n2+n3)/3;
        return avg;           
    }
    public void displaydetails()
    {
        System.out.println("Admission number is "+adno+" and program name is "+prgn);          
    }  
    
}

