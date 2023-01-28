package javaapplication104;
public class JavaApplication104 {

    public static void main(String[] args) {
        sleep a=new sleep();
        sleep b=new sleep();
        sleep c=new sleep();
        
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        
        t1.start();
        t2.start();
        t3.start();
    }   
}
  
