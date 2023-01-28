package javaapplication7;
import java.util.*;
public class marks3 {
    
    //MOST OF THE TIME data private.method public
    //data
    private int adno;
    private String prgn;
    private float n1,n2,n3;
    //methods
    //FYI if there is no inputs. 0 for int and null for string will display
    
    //NO PARAMETER CONSTRUCTOR(same name as class name)
    marks3()
    {
        adno=89;
        prgn="ghdhgg";
        
    }
    
    public float displayavg()
    {
        //u can declare avg and do the inputs above.but not recommended
        //return if its not void
        float avg=(n1+n2+n3)/3;
        return avg;           
    }
    public void displaydetails()
    {
        System.out.println("Admission number is "+adno+" and program name is "+prgn);  
        
    }  
}

 