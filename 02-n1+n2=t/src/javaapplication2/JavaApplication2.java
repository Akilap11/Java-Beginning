package javaapplication2;
//importing a package
import java.util.*; 
//util is the package name(just 1)
//java. and javas. both has packages
//util. list of classes of this package
//* is to choose all the classes from util package

public class JavaApplication2 
{
    public static void main(String[] args) 
    {
      int no1,no2,total;
      
      //creating an object from the class scanner
      Scanner sc=new Scanner(System.in);
      //class name objectname=new class name
      //scanner is a building class
      //sc is the object name(Whatever)
      
      System.out.println("Enter 1st Number ");
      no1=Integer.parseInt(sc.nextLine());
      //sc.nextline() allow the user to input a string
      //Integer.parseInt convert string to integer
      
      System.out.println("Enter 2nd Number ");
      no2=sc.nextInt();
      //allow the user to only input a integer
      //so no need to convert like before
      
      total=(no1+no2);
      
      System.out.println("total is "+total);
      
      
    }
    
}
//CAPITALSSSSSSSSSSSSSSSSSSSSSSSS
//Scanner
//System
//Integer
//parseInt
//nextLine