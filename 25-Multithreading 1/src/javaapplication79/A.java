package javaapplication79;
class A extends Thread{ 
//1st method
//inbuilt class
    //overriding- 
    public void run() //run() is a inbuilt method for thread class
    {
        int x;
        for(x=1;x<5;x++);
        System.out.println("x "+x);
    }
}
