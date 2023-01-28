package javaapplication8;

public class time {
    //data
    private int hours,minutes;
    //no parameter constructor- same name as class name
    time(){
        hours=0;//default value.whatever
        minutes=30;
        //any value. just for default value
    }
    //parameterized constructor
    time(int h,int minutes){ //public time unath constructor
        hours=h;
        this.minutes=minutes; //this minutes keyword equals to member variable
    }
    //thiis - cause member variable and parameter name same
    
    //display method
    //if no talk about no return type.VOID
    public void displaytime()
    {
        System.out.println("Hours: "+hours+" Minutes:"+minutes);
    }
    
    
}
