package javaapplication11;
public class JavaApplication11 {
   
    public static void main(String[] args) {
        //4 access modifiers-
        //1.private-can only use by the class
        //2.public-can access from anywhere
        //3.protected-accessed only by the immediate child class.b extends a. only b can access
        //4.package(default)- not using any. just int x; can access by anywhere from the package. [public(outside of the package)]
        B x=new B(1,2,3);//calling the parameterized constructors
        x.displayA();
        x.displayB();
       
    }
    
}
