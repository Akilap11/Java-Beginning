//write a program to allow the user to input a name and
//birth year and display name with age
package javaapplication3;
import java.util.*;
public class JavaApplication3
{
    public static void main(String[] args) 
    {
        int age,by;
        String name;
        
        Scanner a=new Scanner(System.in);
  
        System.out.println("Enter the name ");
        name=a.nextLine();
        
        System.out.println("Enter Birth year ");
        by=a.nextInt();
        //float nam nextfloat()
        
        
        age=(2021-by);
        
        System.out.println("Your name is "+name+" and "
                + "Your age is "+age);
    }   
}
//CAPITALSSSSSSSSSSSSSSSSSSSSSSSS
//Scanner
//System
//Integer
//parseInt
//nextLine
