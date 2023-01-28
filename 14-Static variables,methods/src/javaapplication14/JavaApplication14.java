package javaapplication14;
public class JavaApplication14 {

    //practical 7 2nd questionth balanno
    
    public static void main(String[] args) {
        //first look at student class and look at the output. then employee class
        //doesnt matter how many objects, every object can access to the static variable
        student s1=new student();
        s1.setdata(12,"Aaa");
        s1.display(); 
        student s2=new student();
        s2.setdata(13,"Baa");
        s2.display();

        //U can declare a method as static(look at employee class)
        //A static method is access by the class without creating an object
        //just call the employee static method by the class name
        //dont need to create objects
        employee.increment();
        employee.increment();
    }   
}
