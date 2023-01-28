package javaapplication11;
public class B extends A {
    private int c;
    //in inheritance,once you write a child class consructor,
    //its must to passs values to the base class constructor 
    public B(int a,int b,int c) //public b is a constructor
    {
        super(a,b);//super is a keyword
        this.c=c;
    }
    public void displayB()
    {
        System.out.println("C:"+c);
    }
    
}
